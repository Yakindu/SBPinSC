package com.edu4java.samplegame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.util.Random;
import org.yakindu.scr.gameobjects.GameObjectsStatemachine;
import org.yakindu.scr.TimerService;
import org.yakindu.scr.gameobjects.IGameObjectsStatemachine.SCInterfaceListener;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Game extends JPanel implements ActionListener, KeyListener {
	
	private Base base;
	private Rectangle ground;
	private Wall wall1;
	private Wall wall2;
	private Rocket rocket;
	
	Timer t = new Timer(5, this);
	
	public Game(){
		super();
		
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		this.base = new Base();
		this.ground = new Rectangle(0, 340, 300, 30);
		this.wall1 = new Wall(10);
		this.wall2 = new Wall(250);
		this.rocket = new Rocket(this.wall1.getLocation()+10, this.wall2.getLocation(), 10, 100);
	}
	
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fill(ground);
        g2d.fill(base.getShape());
        g2d.fill(wall1.getShape());
        g2d.fill(wall2.getShape());
        g2d.fill(rocket.getShape());
        g2d.drawString(rocket.getString(), 150, 50);
    }
    
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
    }
    
    public void actionPerformed(ActionEvent e){
    	
    }
    
    public void keyTyped(KeyEvent e){}
    
    public void keyReleased(KeyEvent e){}
    
    
	private class Base{
		
		Random rand;
		
		public Base(){
			this.rand = new Random();
		}
		
		private int location = 150;
		
		public int getLocation(){
			return location;
		}
		
		public Shape getShape(){
			return new Rectangle(location, 330, 10, 10);
		}
		
		public void moveBase(){
			int i = rand.nextInt(40);
			location = location - (i-20);
		}
		
	}
	
	
	private class Wall{
		
		private int location;
		
		public Wall(int location){
			this.location = location;
		}
		
		public Shape getShape(){
			return new Rectangle(location, 10, 10, 500);
		}
		
		public int getLocation(){
			return this.location;
		}
		
	}

	private class Rocket{

		private GameObjectsStatemachine sm;
		private String s;
		
		public Rocket(int wall1, int wall2, int width, int height){
			
			this.s = "";
			
			this.sm = new GameObjectsStatemachine();
			sm.setTimer(new TimerService());
			sm.init();
			sm.setLeftWall(wall1);
			sm.setRightWall(wall2);
			sm.setRocketWidth(width);
			sm.setRocketHeight(height);
			sm.setGroundLevel(340);
			sm.setBaseX(150);
			sm.getSCInterface().getListeners().add(myL);
			sm.enter();
			sm.raiseInitSystem();
		}
		
		public void pause() {
			sm.raisePausePressed();
			
		}

		SCInterfaceListener myL = new SCInterfaceListener() {
			
			@Override
			public void onGameOverWinRaised() {
				s = "YOU WIN!";
				
			}
			
			@Override
			public void onGameOverLoseRaised() {
				s = "YOU LOSE!";
				
			}
				
			@Override
			public void onDisplayPauseMessageRaised() {
				s = "Game Paused";
				
			}

			@Override
			public void onDeletePauseMessageRaised() {
				s = "";
				
			}


			
		};
		
		
		public String getString() {
			return s;
		}

		public void moveLeft() {
			sm.raiseLeftButtonPressed();
			
		}

		public void moveRight() {
			sm.raiseRightButtonPressed();
			
		}

		public void moveRocket(){
			
			sm.runCycle();
			//System.out.println(sm.getRocketY());
		}
		
		public Shape getShape(){
			return new Rectangle((int)sm.getRocketX(), (int)sm.getRocketY(), 10, 100);
		}
	}
	
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Sample Frame");
        Game game = new Game();
        
        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
        	//game.base.moveBase();
        	game.rocket.moveRocket();
            game.repaint();
            Thread.sleep(100);
        }
    }


}