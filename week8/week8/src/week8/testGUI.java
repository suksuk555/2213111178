package week8;
import java.awt.*;
import javax.swing.*;

public class testGUI extends JFrame{
	
	private final int wid = 400;
	private final int hig = 300;
	
	private JLabel lblLength,lblwidth,lblArea,lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimter;
	public testGUI() {
		setTitle("aaa");
		setSize(wid,hig);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblLength = new JLabel("Enter the length ; ",SwingConstants.RIGHT);
		lblwidth = new JLabel("Enter the length ; ",SwingConstants.RIGHT);
		lblArea = new JLabel("Enter the length ; ",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Enter the length ; ",SwingConstants.RIGHT);
		txtLength = new JTextField("10");

		
		GridLayout L = new GridLayout(4,2);
		setLayout(L);
		add(lblLength);
		add(lblwidth);
		add(lblArea);
		add(lblPerimeter);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGUI a = new testGUI();
		
	}

}
