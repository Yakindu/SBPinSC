package com.edu4java.samplegame;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.yakindu.scr.TimerService;
import org.yakindu.scr.rocketlanding2.IRocketLanding2Statemachine.SCIGameListener;
import org.yakindu.scr.rocketlanding2.RocketLanding2Statemachine;
import org.yakindu.scr.rocketlanding2.SynchronizedRocketLanding2Statemachine;

@SuppressWarnings("serial")

public class Game extends JPanel implements KeyListener, ActionListener {

	public static final int FRAME_WIDTH = 300;
	public static  final int FRAME_HEIGHT = 400;

	private Base base;
	private Ground ground;
	private Wall wall1;
	private Wall wall2;
	private Rocket rocket;
	private Background bg;


	public Game(){
		super();

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

		this.base = new Base(150, 20);
		this.ground = new Ground(0, 340, 300, 30);
		this.wall1 = new Wall(10);
		this.wall2 = new Wall(270);
		this.rocket = new Rocket(this.wall1.getLocation() + 10, this.wall2.getLocation(), 20, 50);
		this.bg = new Background();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(new Font(g.getFont().getName(), g.getFont().getStyle(), (int)(g.getFont().getSize() * 1.5)));
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		bg.paint(g2d);
		ground.paint(g2d);
		base.paint(g2d);
		wall1.paint(g2d);
		wall2.paint(g2d);
		rocket.paint(g2d);

		drawCenteredString(g2d, rocket.getString(), (int)(0.5 * FRAME_WIDTH), 50);
	}
	

	protected void drawCenteredString(Graphics g, String s, int x, int y) {
		FontMetrics fontMetrics = g.getFontMetrics();
		
		int textHeight = fontMetrics.getHeight();
		int textWidth = fontMetrics.stringWidth(s);
		
		int drawX = x - (int)Math.round(0.5 * textWidth);
		int drawY = y + (int)Math.round(0.5 * textHeight);
		
		g.drawString(s, drawX, drawY);
	}

	@Override
	public void actionPerformed(ActionEvent e){

	}

	@Override
	public void keyPressed(KeyEvent e){
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_RIGHT){
			this.rocket.moveRight();
		}

		if (code == KeyEvent.VK_LEFT){
			this.rocket.moveLeft();
		}

		if (code == KeyEvent.VK_P){
			this.rocket.pause();
		}
		
		if (code == KeyEvent.VK_A){
			this.rocket.autopilot();
		}
	}

	@Override
	public void keyTyped(KeyEvent e){}

	@Override
	public void keyReleased(KeyEvent e){}

	private class Background implements GameAsset {
		private Image image;

		public Background() {
			try {
				this.image = ImageIO.read(new File("resources/sunrise-153600_1280.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		@Override
		public void paint(Graphics2D g2d) {
			g2d.drawImage(this.image,
					0, 0,
					FRAME_WIDTH, FRAME_HEIGHT,
					0, 0,
					this.image.getWidth(null), this.image.getHeight(null),
					null);
		}

	}


	private class Base implements GameAsset {

		private Random rand;
		private int location;
		private int width;

		public Base(int location, int width) {
			this.rand = new Random();
			this.location = location;
			this.width = width;
		}


		public int getLocation(){
			return location;
		}

		public Shape getShape(){
			return new Rectangle(location, 330, width, 10);
		}

		public void moveBase(){
			int i = rand.nextInt(40);
			location = location - (i-20);
		}

		@Override
		public void paint(Graphics2D g2d) {
			g2d.fill(this.getShape());
		}

	}


	private class Wall implements GameAsset {
		public static final int HEIGHT = 500;
		public static final int WIDTH = 20;

		private int location;
		private List<Shape> shapes;

		public Wall(int location){
			this.location = location;
			this.shapes = new ArrayList<>();
			createGrid();
		}

		public Shape getShape(){
			return new Rectangle(0, 0, WIDTH, HEIGHT);
		}

		public int getLocation(){
			return this.location;
		}

		@Override
		public void paint(Graphics2D g2d) {
			g2d.translate(location, 10);
			// left upright
			g2d.fill(new Rectangle(0, 0, 2, HEIGHT));
			g2d.translate(18, 0);
			g2d.fill(new Rectangle(0, 0, 2, HEIGHT));
			g2d.translate(-g2d.getTransform().getTranslateX(), -g2d.getTransform().getTranslateY());
			g2d.translate(location, 10);
			g2d.rotate(Math.toRadians(-45));
			// left downward facing
			while(g2d.getTransform().getTranslateY() < HEIGHT + 10) {
				g2d.fill(new Rectangle(0, 0, 2, (int)Math.sqrt(200d)));
				g2d.rotate(Math.toRadians(45));
				g2d.translate(0, 10);
				g2d.rotate(Math.toRadians(-45));
			}
			g2d.rotate(Math.toRadians(45));
			g2d.translate(-g2d.getTransform().getTranslateX(), -g2d.getTransform().getTranslateY());

			g2d.translate(location + WIDTH - 1, 10);
			g2d.rotate(Math.toRadians(45));
			// right upward facing
			while(g2d.getTransform().getTranslateY() < HEIGHT + 10) {
				g2d.fill(new Rectangle(0, 0, 2, (int)Math.sqrt(200d)));
				g2d.rotate(Math.toRadians(-45));
				g2d.translate(0, 10);
				g2d.rotate(Math.toRadians(45));
			}
			g2d.rotate(Math.toRadians(-45));
			g2d.translate(-g2d.getTransform().getTranslateX(), -g2d.getTransform().getTranslateY());
			g2d.translate(location, 9);
			while(g2d.getTransform().getTranslateY() < HEIGHT + 10) {
				g2d.fill(new Rectangle(0, 0, WIDTH, 2));
				g2d.translate(0, 10);
			}

			g2d.translate(-g2d.getTransform().getTranslateX(), -g2d.getTransform().getTranslateY());
		}

		protected void createGrid() {
			//left upright
			shapes.add(new Rectangle(location, 10, 2, HEIGHT));
			//right upright
			shapes.add(new Rectangle(location + 18, 10, 2, HEIGHT));
		}
	}

	private class Ground implements GameAsset {
		private Rectangle rect;

		public Ground(int x, int y, int width, int height) {
			this.rect = new Rectangle(x, y, width, height);
		}

		public Shape getShape() {
			return this.rect;
		}

		@Override
		public void paint(Graphics2D g2d) {
			g2d.fill(this.getShape());
		}
	}

	private class Rocket implements GameAsset {

		private SynchronizedRocketLanding2Statemachine sm;
		private String s;
		private Image image;

		public Rocket(int wall1, int wall2, int width, int height){

			this.s = "";

			try {
				this.image = ImageIO.read(new File("resources/rocket.bmp"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			this.sm = new SynchronizedRocketLanding2Statemachine();
			sm.setTimer(new TimerService());
			sm.init();
			sm.getSCILeftWall().setX(wall1);
			sm.getSCIRightWall().setX(wall2);
			sm.getSCIRocket().setWidth(width);
			sm.getSCIRocket().setHeight(height);
			sm.getSCIGround().setLevel(340);
			sm.getSCIPlatform().setX(150);
			sm.getSCIGame().getListeners().add(myGameEventListener);
			sm.enter();
			
		}

		public void pause() {
			sm.getSCIGame().raisePausePressed();
		}
		
		public void autopilot() {
			sm.getSCIGame().raiseAutopilotPressed();
		}

		SCIGameListener myGameEventListener = new SCIGameListener() {

			@Override
			public void onOverWonRaised() {
				s = "YOU WON!";
			}

			public void onOverLoseRaised() {
				s = "YOU LOSE!";
			}
			
			@Override
			public void onCountDownRaised(long value) {
				if (value != 0L)
					s = "Count Down " + value;
				else 
					s = "";
			}
			

			@Override
			public void onPausedRaised() {
				s = "Game Paused";

			}

			@Override
			public void onContinuedRaised() {
				s = "";

			}
		};

		public String getString() {
			return s;
		}

		public void moveLeft() {
			sm.getSCILeftButton().raisePressed();			
		}

		
		public void moveRight() {
			sm.getSCIRightButton().raisePressed();
		}

		public void moveRocket(){

			sm.runCycle();
			
			base.location = (int) sm.getSCIPlatform().getX();
			//System.out.println(sm.getRocketY());
		}

		public Shape getShape(){
			return new Rectangle((int)sm.getSCIRocket().getX(), (int)sm.getSCIRocket().getY(), 10, 100);
		}

		@Override
		public void paint(Graphics2D g2d) {
			g2d.drawImage(this.image,
					getX(), getY(),
					getX() + getWidth(), getY() + getHeight(),
					0, 0,
					this.image.getWidth(null), this.image.getHeight(null),
					null);
		}

		private int getX() {
			return (int)sm.getSCIRocket().getX();
		}
		private int getY() {
			return (int) sm.getSCIRocket().getY();
		}
		private int getWidth() {
			return (int) sm.getSCIRocket().getWidth();
		}
		private int getHeight() {
			return (int) sm.getSCIRocket().getHeight();
		}
	}

	public interface GameAsset {
		public void paint(Graphics2D g2d);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Rocket Game");
		Game game = new Game();

		frame.add(game);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {
			//game.base.moveBase();
			game.rocket.moveRocket();
			game.repaint();
			Thread.sleep(5);
		}
	}


}