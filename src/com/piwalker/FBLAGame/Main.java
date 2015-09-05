package com.piwalker.FBLAGame;


import com.piwalker.FBLAGame.References.References;

import io.brace.lightsoutgaming.engine.LightsOut;

public class Main extends LightsOut{
	public static void main(String[] args){
		new Main().init();
	}
	
	public float aspectRatio = 9f/16f;
	public int WIDTH = 900;
	public int HEIGHT = (int) (WIDTH * aspectRatio);

	@Override
	protected void init() {
		// TODO Auto-generated method stub
		System.out.println(aspectRatio);
		this.createDisplay(References.TITLE_BAR, WIDTH, HEIGHT);
		this.start();
	}

	@Override
	protected void render() {
		// TODO Auto-generated method stub
		screen.clear();
		
		show();
	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		
	}
}
