package week6;
import java.util.Scanner;
public class week6kafamag�re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		int dogrusay�s� = 0;
		int kullsonuc, as�lsonuc;
		int n1, n2;
		final int MAXSORUSAYISI = 5;
		Scanner input = new Scanner (System.in);
		while (count <= MAXSORUSAYISI) {
			n1 = (int) (Math.random()*101);
			n2 = (int) (Math.random()*101);
			if (n1>n2)
				as�lsonuc = n1-n2;
			else
				as�lsonuc = n2-n1;
			System.out.println("cikarma i�leminin sonucunu girin " +n1 + " " +n2 );
			kullsonuc = input.nextInt();
			if(kullsonuc == as�lsonuc) {
				dogrusay�s�++;
			}
			count++;
	
	    }
		System.out.println("dogru say�n�z" + dogrusay�s�);
	}	
}
