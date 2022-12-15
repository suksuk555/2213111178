package week6;
import javax.swing.*;

public class javaLab606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		int []nums = {25,78,41,22,36,85,37};
		while(!checkIndex(nums,index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
		}
		JOptionPane.showMessageDialog(null, "Current data, nums["+index+"] is "+nums[index]+
									"\n"+(prevData(nums,index)==-1?"No previous data":"Previous data, nums["+(index-1)+"] is "+nums[index-1])+
									"\n"+(nextData(nums,index)==7?"No next data": "Next data, nums["+(index+1)+"]" +"is"+nums[index+1]));
		
		
		
		
		
	}
	public static boolean checkIndex(int[]nums,int index) {
		return index>=nums.length?false:true;
		
	}
	public static int currentData(int[]nums,int index) {
		return nums[index];
	}
	public static int prevData(int[] nums,int index) {
		return nums[index-1];
	}
	public static int nextData(int[] nums,int index) {
		return nums[index+1];
	}

}
