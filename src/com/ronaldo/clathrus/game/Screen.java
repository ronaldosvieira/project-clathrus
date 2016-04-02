package com.ronaldo.clathrus.game;

public class Screen {
	private int width, height;
	public int[] pixels;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		this.pixels = new int[width * height];		
	}
}
