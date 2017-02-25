package dalialevel1exam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class colorteacher implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;

	public static void main(String[] args) {
		colorteacher colorteacher = new colorteacher();
		colorteacher.makethings();
		
	}

	public void makethings() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.RED);
		button3.setBackground(Color.BLUE);
		button4.setBackground(Color.GREEN);
		button1.setOpaque(true);
		button2.setOpaque(true);
		button3.setOpaque(true);
		button4.setOpaque(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);



	}
	void speak(String Words){
		try{
		Runtime.getRuntime().exec("say " + Words);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)){
			speak("Yellow");
		}
		else if (e.getSource().equals(button2)){
			speak("Red");
		}
		else if (e.getSource().equals(button3)){
			speak("Blue");
		}
		else if (e.getSource().equals(button4)){
			speak("Green");
		}
	}
}
