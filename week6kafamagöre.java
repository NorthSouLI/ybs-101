package week6;
import java.util.Scanner;
public class week6kafamagöre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		int dogrusayýsý = 0;
		int kullsonuc, asýlsonuc;
		int n1, n2;
		final int MAXSORUSAYISI = 5;
		Scanner input = new Scanner (System.in);
		while (count <= MAXSORUSAYISI) {
			n1 = (int) (Math.random()*101);
			n2 = (int) (Math.random()*101);
			if (n1>n2)
				asýlsonuc = n1-n2;
			else
				asýlsonuc = n2-n1;
			System.out.println("cikarma iþleminin sonucunu girin " +n1 + " " +n2 );
			kullsonuc = input.nextInt();
			if(kullsonuc == asýlsonuc) {
				dogrusayýsý++;
			}
			count++;
	
	    }
		System.out.println("dogru sayýnýz" + dogrusayýsý);
	}	
}
