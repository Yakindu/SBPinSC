package com.edu4java.samplegame;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class Background extends GameAsset {
	private Image image;

	public Background() {
		super();
		
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
				Game.FRAME_WIDTH, Game.FRAME_HEIGHT,
				0, 0,
				this.image.getWidth(null), this.image.getHeight(null),
				null);
	}

}