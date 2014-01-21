package gui.view;

import gui.controller.GuiController;

import javax.swing.JFrame;

public class GUIFrame extends JFrame
{

	private GuiController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		
		this.setContentPane(basePanel);
		this.setSize(400, 200);
		this.setVisible(true);
	}
}
