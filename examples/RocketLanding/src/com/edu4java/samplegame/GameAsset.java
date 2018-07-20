package com.edu4java.samplegame;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class GameAsset {
	
	protected Rectangle bounds;
	
	
	
	public GameAsset() {
		super();
		this.bounds = new Rectangle(0,0,0,0);
	}

	/** 
	 * @return The bounds of the asset that can directly be modified.
	 */
	Rectangle getBounds() {
		return this.bounds;
	}
	
	abstract public void paint(Graphics2D g2d);
}