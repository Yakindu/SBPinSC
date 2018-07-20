package com.edu4java.samplegame;

import java.awt.Graphics2D;

class Ground extends GameAsset {

	public Ground(int x, int y, int width, int height) {
		super();
		
		this.bounds.setBounds(x, y, width, height);
	}

	@Override
	public void paint(Graphics2D g2d) {
		g2d.fill(this.bounds);
	}
}