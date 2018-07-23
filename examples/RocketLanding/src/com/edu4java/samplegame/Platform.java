package com.edu4java.samplegame;

import java.awt.Color;
import java.awt.Graphics2D;

class Platform extends GameAsset {

	
	public Platform(int location, int width, int screenYOffset) {
		super(screenYOffset);
		
		this.bounds.setBounds(location, -5, width, 10);
	}

	@Override
	public void paint(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.fill(this.getScreenBounds());
	}

}