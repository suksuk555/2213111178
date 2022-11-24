package week3;
import javax.swing.*;
import java.text.*;

public class lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("####.#");
		String weight_str = JOptionPane.showInputDialog("Input Weight");
		double weight = Double.parseDouble(weight_str);
		String height_str = JOptionPane.showInputDialog("Input Height");
		double height = Double.parseDouble(height_str);
		double newheight = height*0.01;
		double bmi = weight/(newheight*newheight);
		if(bmi<18.5) {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're Underweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if(bmi>=25.0 && bmi<=29.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		}

	}

}
