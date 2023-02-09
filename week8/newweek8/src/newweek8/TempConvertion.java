package newweek8;
import java.awt.Container;
import java.awt.Event;
import javax.swing.*;

public class TempConvertion extends JFrame{
	
	private JLabel lblCel;
	private JLabel lblFahren;
	
	private JTextField tfCel;
	private JTextField tfFahren;

	private final int wid = 900;
	private final int hig = 300;
	
	private static final double ftc = 5.0/9.0;
	private static final double ctf = 9.0/5.0;
	private static final int offset = 32;
	
	
	
	
	public TempConvertion() {
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
				
		lblCel = new JLabel("temp",SwingConstants.RIGHT);
		lblFahren = new JLabel("temp",SwingConstants.RIGHT);
		c.add(lblCel);
		c.add(lblFahren);
		c.add(tfCel);
		c.add(tfFahren);
		
		CelsHandler celh = new CelsHandler();
		tfCel.addActionListener(celh);
		
		setTitle("convertion temp");
		setSize(wid,hig);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class celsHandier implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double cel , fah;
			cel = Double.parseDouble(tfCel.getText());
			fah = cel*ftc+offset;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConvertion tempConv = new TempConvertion();

	}

}
