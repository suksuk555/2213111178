import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder[] cy = new Cylinder[5];
		
		for(int i = 0;i<cy.length;i++) {
			double h = Double.parseDouble(JOptionPane.showInputDialog("Input height"));
			double r = Double.parseDouble(JOptionPane.showInputDialog("Input redius"));
			
			cy[i] = new Cylinder(h,r);
			
		}
		JOptionPane.showMessageDialog(null, "Cylinder 1 , volum ="+cy[0].getVolum()
				+"\nCylinder 2 , volum ="+cy[1].getVolum()
						+"\nCylinder 3 , volum ="+cy[2].getVolum()+"\nCylinder 4 , volum ="+cy[3].getVolum()
								+"\nCylinder 5 , volum ="+cy[4].getVolum());

	}

}
