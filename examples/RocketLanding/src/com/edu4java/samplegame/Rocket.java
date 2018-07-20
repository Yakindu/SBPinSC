package com.edu4java.samplegame;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class Rocket extends GameAsset {

	private Image image;

	public Rocket(Rectangle bounds){

		super();
		
		this.bounds.setBounds(bounds);
		
		try {
			this.image = ImageIO.read(new File("resources/rocket.bmp"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public void paint(Graphics2D g2d) {
		g2d.drawImage(this.image,
				bounds.x, bounds.y,
				bounds.x + bounds.width, bounds.y + bounds.height,
				0, 0,
				this.image.getWidth(null), this.image.getHeight(null),
				null);
	}

}