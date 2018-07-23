package com.edu4java.samplegame;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class GameAsset {
	
	protected Rectangle bounds;
	protected int yOffset;
	
	
	public GameAsset(int yOffset) {
		super();
		this.yOffset = yOffset;
		this.bounds = new Rectangle(0,0,0,0);
	}

	/** 
	 * @return The bounds of the asset that can directly be modified.
	 */
	Rectangle getBounds() {
		return this.bounds;
	}
	
	Rectangle getScreenBounds() {
		return new Rectangle(
					bounds.x,
					yOffset - bounds.y - bounds.height,
					bounds.width,
					bounds.height
				);
	}
	
	abstract public void paint(Graphics2D g2d);
}