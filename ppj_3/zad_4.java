
public class zad_4
{

	public static void main(String args[]){

		java.util.Scanner user_input = new java.util.Scanner(System.in);
		int wrt = 0;
		boolean znak;
		int ile = user_input.nextInt();
		int ilosc = user_input.nextInt();
		
		for(int i = 0; i < ile; i++){
			
		wrt = (int) (Math.random()*Math.pow(10, ilosc));
		znak = (int)(Math.random() * 10 % 2) == 0 ? true : false;
		wrt = znak ? -wrt : wrt;
	
		System.out.println(wrt);
		
		String zbiory;
		
		zbiory = wrt > 1 ? "A" : wrt < 0 ? "B" : "A,B,C";
		
		System.out.println(zbiory);
		
		}

	}

}