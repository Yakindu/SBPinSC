package com.edu4java.samplegame;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.yakindu.scr.TimerService;
import org.yakindu.scr.rocketlanding.IRocketLandingStatemachine.SCIGameListener;
import org.yakindu.scr.rocketlanding.SynchronizedRocketLandingStatemachine;

@SuppressWarnings("serial")

public class Game extends JPanel implements KeyListener, ActionListener {

	public static final int FRAME_WIDTH = 300;
	public static  final int FRAME_HEIGHT = 400;

	private SynchronizedRocketLandingStatemachine sm;

	private JButton buttonPauseUnpause;
	private JButton buttonLeft;
	private JButton buttonRight;
	private JButton buttonHumanPilot;
	private JButton buttonAutoPilot;

	protected RocketLandingScene scene;


	public Game(){
		super();

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		
		JPanel pane = new JPanel();
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;

		
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
//		setLayout(null);
		
		Dimension smallButtonDimension = new Dimension(FRAME_WIDTH / 2 - 1, 35);
		Dimension largeButtonDimension = new Dimension(FRAME_WIDTH , 35);
		
		this.buttonAutoPilot = new JButton("Auto Pilot");
		this.buttonAutoPilot.setPreferredSize(smallButtonDimension);
		this.buttonAutoPilot.setMargin(new Insets(10,10,10,10));
		this.buttonAutoPilot.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sm.getSCIGame().raiseAutopilotPressed();
			}
		});
		
		this.buttonHumanPilot = new JButton("Manual Control");
		this.buttonHumanPilot.setPreferredSize(smallButtonDimension);
	    this.buttonHumanPilot.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sm.getSCIGame().raiseManualControlPressed();
			}
		});

	    this.buttonLeft = new JButton("< Left");
	    this.buttonLeft.setPreferredSize(smallButtonDimension);
	    this.buttonLeft.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sm.getSCILeftButton().raisePressed();
			}
		});

		this.buttonRight = new JButton("Right >");
		this.buttonRight.setPreferredSize(smallButtonDimension);
	    this.buttonRight.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sm.getSCIRightButton().raisePressed();
			}
		});

		this.buttonPauseUnpause = new JButton("Pause / Unpause");
		this.buttonPauseUnpause.setPreferredSize(largeButtonDimension);
	    this.buttonPauseUnpause.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sm.getSCIGame().raisePausePressed();
			}
		});


		this.scene = new RocketLandingScene();
		this.scene.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		this.scene.setMinimumSize(this.scene.getPreferredSize());
		this.scene.setMaximumSize(this.scene.getPreferredSize());
		
		this.add(this.scene);
		this.add(pane);
		
		c.gridx = 0;
		c.gridy = 0;
		pane.add(this.buttonAutoPilot, c);
		
		c.gridx = 1;
		c.gridy = 0;
		pane.add(this.buttonHumanPilot, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		pane.add(this.buttonPauseUnpause, c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		pane.add(this.buttonLeft, c);

		c.gridx = 1;
		c.gridy = 2;
		pane.add(this.buttonRight, c);
		
		
		this.sm = new SynchronizedRocketLandingStatemachine();
		sm.setTimer(new TimerService());
		sm.init();
		
		sm.getSCILeftWall().setX(scene.wall1.getBounds().x);
		sm.getSCIRightWall().setX(scene.wall2.getBounds().x);
		sm.getSCIRocket().setWidth(scene.rocket.getBounds().width);
		sm.getSCIRocket().setHeight(scene.rocket.getBounds().height);
		sm.getSCIGround().setLevel(scene.ground.getBounds().y);
		sm.getSCIPlatform().setX(scene.platform.getBounds().x);
		sm.getSCIPlatform().setWidth(scene.platform.getBounds().width);
		
		
		sm.getSCIGame().getListeners().add(myStateMachineEventListener);
		sm.enter();

	}

	

	@Override
	public void actionPerformed(ActionEvent e){

	}

	@Override
	public void keyPressed(KeyEvent e){
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_RIGHT){
			this.sm.getSCIRightButton().raisePressed();
		}

		if (code == KeyEvent.VK_LEFT){
			this.sm.getSCILeftButton().raisePressed();
		}

		if (code == KeyEvent.VK_P){
			this.sm.getSCIGame().raisePausePressed();
		}
		
		if (code == KeyEvent.VK_A){
			this.sm.getSCIGame().raiseAutopilotPressed();
		}
		
		if (code == KeyEvent.VK_M){
			this.sm.getSCIGame().raiseManualControlPressed();
		}
	}

	@Override
	public void keyTyped(KeyEvent e){}

	@Override
	public void keyReleased(KeyEvent e){}

	
	public void moveRocket(){

		sm.runCycle();
		
		scene.platform.getBounds().x = (int) sm.getSCIPlatform().getX();
		scene.rocket.getBounds().x = (int) sm.getSCIRocket().getX();
		scene.rocket.getBounds().y = (int) sm.getSCIRocket().getY();
		
		//System.out.println(sm.getRocketY());
	}

	SCIGameListener myStateMachineEventListener = new SCIGameListener() {

		@Override
		public void onOverWonRaised() {
			scene.setMessage("YOU WON!");
		}

		public void onOverLoseRaised() {
			scene.setMessage("YOU LOSE!");
		}
		
		@Override
		public void onCountDownRaised(long value) {
			if (value != 0L)
				scene.setMessage("Count Down " + value);
			else 
				scene.setMessage("");
		}
		

		@Override
		public void onPausedRaised() {
			scene.setMessage("Game Paused");

		}

		@Override
		public void onContinuedRaised() {
			scene.setMessage("");

		}
	};

	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Rocket Game");
		Game game = new Game();

		frame.add(game);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT+130);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Thread.sleep(1000);
		
		while (true) {
			game.moveRocket();
			game.repaint();
			Thread.sleep(5);
		}
	}


}