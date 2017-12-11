public class zad_5
{

	public static void main(String args[]){

		java.util.Scanner user_input = new java.util.Scanner(System.in);
		int wrt = 0;
		boolean znak;
		int ile = user_input.nextInt();
		
		for(int i = 0; i < ile; i++){
			
		wrt = (int) (Math.random()*Math.pow(10, 9));
		znak = (int)(Math.random() * 10) == 0 ? true : false;
		wrt = znak ? -wrt : wrt;
	
		System.out.println(wrt);
		
		
		if(wrt >= -4 && wrt <= -3) System.out.println("nalezy");
		else System.out.println("nie nalezy");
			

		}

	}

}