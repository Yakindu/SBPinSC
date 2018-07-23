package com.edu4java.samplegame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

class Ground extends GameAsset {

	public Ground(int x, int y, int width, int height, int screenYOffset) {
		super(screenYOffset);
		
		this.bounds.setBounds(x, y, width, height);
	}

	
	@Override
	Rectangle getScreenBounds() {
		Rectangle r = new Rectangle(super.getScreenBounds());
		r.y = r.y + r.height;
		return r;
	}


	@Override
	public void paint(Graphics2D g2d) {
		g2d.setColor(Color.LIGHT_GRAY);
		g2d.fill(this.getScreenBounds());
	}
}