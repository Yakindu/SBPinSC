package com.edu4java.samplegame;

import java.awt.Graphics2D;

class Platform extends GameAsset {

	
	public Platform(int location, int width) {
		super();
		
		this.bounds.setBounds(location, 330, width, 10);
	}

	@Override
	public void paint(Graphics2D g2d) {
		g2d.fill(this.getBounds());
	}

}