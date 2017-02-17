import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.ARG_OUT;

public class ColorTeacher implements ActionListener {
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton yellow = new JButton();
	JButton green = new JButton();
public static void main(String[] args) {
	ColorTeacher teacher = new ColorTeacher();
	teacher.runer();
} 
void runer(){
JFrame frame = new JFrame();
JPanel panel = new JPanel();
frame.setVisible(true);
frame.setTitle("Color Teacher");
frame.add(panel);
panel.add(green);
panel.add(red);
panel.add(blue);
panel.add(yellow);
frame.pack();
red.setBackground(Color.red);
red.setOpaque(true);
green.setBackground(Color.green);
green.setOpaque(true);
blue.setBackground(Color.blue);
blue.setOpaque(true);
yellow.setBackground(Color.yellow);
yellow.setOpaque(true);
red.addActionListener(this);
yellow.addActionListener(this);
blue.addActionListener(this);
green.addActionListener(this);
}
void speak(String words){
	try{
		Runtime.getRuntime().exec("say "+words);
	}	catch(IOException e) {
		e.printStackTrace();
	}
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton color = (JButton) e.getSource();
	if(color.equals(red)){
		speak("Red");
	}
	if(color.equals(green)){
		speak("Green");
	}
	if(color.equals(blue)){
		speak("Blue");
	}
	if(color.equals(yellow)){
		speak("Yellow");
	}
}
}
