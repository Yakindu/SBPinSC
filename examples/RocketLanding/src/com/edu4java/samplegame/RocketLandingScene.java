package com.edu4java.samplegame;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class RocketLandingScene extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected static final int GROUND_OFFSET = 390;
	
	public Platform platform;
	public Ground ground;
	public Wall wall1;
	public Wall wall2;
	public Rocket rocket;
	public Background bg;
	
	protected String message;
	
	
	public RocketLandingScene() {
		super();
		
		this.platform = new Platform(145, 30, GROUND_OFFSET);
		this.ground = new Ground(0, 0, 300, 10, GROUND_OFFSET);
		this.wall1 = new Wall(10, GROUND_OFFSET);
		this.wall2 = new Wall(270, GROUND_OFFSET);
		this.rocket = new Rocket(new Rectangle(0, 0, 20, 50), GROUND_OFFSET);
		this.bg = new Background(GROUND_OFFSET);

	}
	
	

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(new Font(g.getFont().getName(), g.getFont().getStyle(), (int)(g.getFont().getSize() * 1.5)));
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		bg.paint(g2d);
		wall1.paint(g2d);
		wall2.paint(g2d);
		ground.paint(g2d);
		platform.paint(g2d);
		rocket.paint(g2d);

		drawCenteredString(g2d, getMessage(), (int)(0.5 * this.getWidth()), 50);

	}
	
	protected void drawCenteredString(Graphics g, String s, int x, int y) {
		FontMetrics fontMetrics = g.getFontMetrics();
		
		int textHeight = fontMetrics.getHeight();
		int textWidth = fontMetrics.stringWidth(s);
		
		int drawX = x - (int)Math.round(0.5 * textWidth);
		int drawY = y + (int)Math.round(0.5 * textHeight);
		
		g.drawString(s, drawX, drawY);
	}

}
