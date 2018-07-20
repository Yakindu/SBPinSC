package com.edu4java.samplegame;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

class Wall extends GameAsset {
	public static final int HEIGHT = 500;
	public static final int WIDTH = 20;

	private List<Shape> shapes;

	public Wall(int location){
		this.bounds.x = location;
		this.shapes = new ArrayList<>();
		createGrid();
	}

	public Shape getShape(){
		return new Rectangle(0, 0, WIDTH, HEIGHT);
	}


	@Override
	public void paint(Graphics2D g2d) {
		g2d.translate(bounds.x, 10);
		// left upright
		g2d.fill(new Rectangle(0, 0, 2, HEIGHT));
		g2d.translate(18, 0);
		g2d.fill(new Rectangle(0, 0, 2, HEIGHT));
		g2d.translate(-g2d.getTransform().getTranslateX(), -g2d.getTransform().getTranslateY());
		g2d.translate(bounds.x, 10);
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

		g2d.translate(bounds.x + WIDTH - 1, 10);
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
		g2d.translate(bounds.x, 9);
		while(g2d.getTransform().getTranslateY() < HEIGHT + 10) {
			g2d.fill(new Rectangle(0, 0, WIDTH, 2));
			g2d.translate(0, 10);
		}

		g2d.translate(-g2d.getTransform().getTranslateX(), -g2d.getTransform().getTranslateY());
	}

	protected void createGrid() {
		//left upright
		shapes.add(new Rectangle(bounds.x, 10, 2, HEIGHT));
		//right upright
		shapes.add(new Rectangle(bounds.x + 18, 10, 2, HEIGHT));
	}
}