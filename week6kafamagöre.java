package week6;
import java.util.Scanner;
public class week6kafamagöre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		int dogrusayısı = 0;
		int kullsonuc, asılsonuc;
		int n1, n2;
		final int MAXSORUSAYISI = 5;
		Scanner input = new Scanner (System.in);
		while (count <= MAXSORUSAYISI) {
			n1 = (int) (Math.random()*101);
			n2 = (int) (Math.random()*101);
			if (n1>n2)
				asılsonuc = n1-n2;
			else
				asılsonuc = n2-n1;
			System.out.println("cikarma işleminin sonucunu girin " +n1 + " " +n2 );
			kullsonuc = input.nextInt();
			if(kullsonuc == asılsonuc) {
				dogrusayısı++;
			}
			count++;
	
	    }
		System.out.println("dogru sayınız" + dogrusayısı);
	}	
}
