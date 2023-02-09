import javax.swing.*;

public class RectangleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double width = Double.parseDouble(JOptionPane.showInputDialog("input width "));
		double length = Double.parseDouble(JOptionPane.showInputDialog("input length "));
		String color = JOptionPane.showInputDialog("Input color")
		Rectangle r = new Rectangle(width,length,color);
		
		JOptionPane.showMessageDialog(null, "");
	}

}
