package week8;
import java.awt.Container;
import java.awt.Event;
import javax.swing.*;

public class TempConvertion extends JFrame{
	
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;

	private JTextField tfCelsius;
	private JTextField tfFahrenheit;

	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final int OFFSET= 32;

	public TempConvertion() {

		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));

		lblCelsius = new JLabel("Temp in Celsius:",SwingConstants.RIGHT);
		lblFahrenheit = new JLabel("Temp in Fahrenheit:",SwingConstants.RIGHT);

		tfCelsius = new JTextField(10);
		tfFahrenheit = new JTextField(10);

		c.add(lblCelsius);
		c.add(tfCelsius);
		c.add(lblFahrenheit);
		c.add(tfFahrenheit);

		setTitle("Temperature Conversion");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConvertion tempConv = new TempConvertion();
	}

}
