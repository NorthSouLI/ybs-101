package ybs101w4;
import java.util.Scanner;

public class ÇALIÞANKÖLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int girsayý	, sissayi;
		
	sissayi = (int)(Math.random() *101);	
	System.out.println("sayýyý tahmin et (0-100)*");	
	Scanner input = new Scanner (System.in);
	girsayý = input.nextInt();	
	
	while (sissayi != girsayý){
if (girsayý < sissayi)	{
		System.out.println("daha büyük yaz");
		
	}else if (girsayý > sissayi) {	
		System.out.println("sende abartma in biraz");
		
		
	}	
	 girsayý = input.nextInt();
	 {
	System.out.println("aferin");	
	}	
		
		
		
		
	}
	
}
}