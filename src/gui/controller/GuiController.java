package gui.controller;

import gui.view.GUIFrame;

public class GuiController
{
	private GUIFrame appFrame;
	
	public GuiController()
	{
		
	}
	
	public void start()
	{
		appFrame = new GUIFrame(this);
	}
}
