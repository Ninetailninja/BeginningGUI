package gui.view;
import gui.controller.GuiController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{

	private GuiController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	
	public GUIPanel(GuiController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("Look a button!");
		secondButton = new JButton("Oh wow another one!");
		baseLayout = new SpringLayout();
		
		
		setUpPanel();
		setUpLayout();
	}
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
	}
	
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 6, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 85, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 28, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 101, SpringLayout.WEST, this);
	}
}
