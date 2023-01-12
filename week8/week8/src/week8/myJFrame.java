import java.awt.EventQueue;
import java.text.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.*;

public class myJFrame extends JFrame {

	private JPanel twodigit;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myJFrame frame = new myJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myJFrame() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		twodigit = new JPanel();
		twodigit.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(twodigit);
		twodigit.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setBounds(43, 28, 89, 19);
		twodigit.add(lblNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(142, 27, 130, 20);
		twodigit.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setBounds(43, 58, 92, 14);
		twodigit.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(142, 55, 130, 20);
		twodigit.add(txtNumber2);
		txtNumber2.setColumns(10);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(286, 182, 99, 19);
		twodigit.add(lblResult);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(43, 93, 70, 14);
		twodigit.add(lblOperator);

		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(142, 91, 55, 19);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		twodigit.add(chOperator);
		
		JRadioButton b1 = new JRadioButton("1digit");
		b1.setBounds(122, 129, 109, 23);
		twodigit.add(b1);
		
		JRadioButton b2 = new JRadioButton("2digit");
		b2.setBounds(122, 155, 109, 23);
		twodigit.add(b2);
		
		ButtonGroup group = new ButtonGroup();
		;
		group.add(twodigit);


		final JButton btnOK = new JButton("OK");
		JLabel lblNewLabel = new JLabel("option to show");
		lblNewLabel.setBounds(29, 186, 103, 14);
		twodigit.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show result");
		chckbxNewCheckBox.setBounds(111, 182, 97, 23);
		twodigit.add(chckbxNewCheckBox);
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					//JComboBox
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					
					DecimalFormat frmNumber = null;
					if(onedigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					else if(twodigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");

					}
					
					

					lblResult.setText(frmNumber.format(sum));
					
					if(ChkDialigBox.isSelected()) {
						JOptionPane.showMessageDialog(null, "result is : ",sum);
					}
				}
			}
		});
		btnOK.setBounds(142, 229, 89, 23);
		twodigit.add(btnOK);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(241, 229, 89, 23);
		twodigit.add(btnExit);
		
		
		
		
		
		
		
		


	}
}

