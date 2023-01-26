package week10;
import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String au = JOptionPane.showInputDialog(null,"Input author name:");
		String email = JOptionPane.showInputDialog(null,"Input author e-mail:");

		
		
		String book = JOptionPane.showInputDialog(null,"Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog(null,"Input book page:"));
		Book1 b1 = new Book1(book,new Author1(au,email),page);
		int a = JOptionPane.showConfirmDialog(null,"Is the page correct?","conferm",JOptionPane.YES_NO_OPTION);
		while(a == 1) {
			page = Integer.parseInt(JOptionPane.showInputDialog(null,"Input book page:"));
			b1.setPage(page);
		}
		b1.setPage(page);
		
		
		
		JOptionPane.showMessageDialog(null, "Book Title :"+b1.getTitle()+
									"\nAuthor name:"+b1.getAuthor()+"("+b1.getPage()+")"+
									"\nAuthor e-mail:"+b1.getAuthor().getEmail());
		
		

	}

}
