public class zad_6
{

	public static void main(String args[]){

		java.util.Scanner user_input = new java.util.Scanner(System.in);
		byte sloik = 0;
		//boolean znak;
		int ile = user_input.nextInt();
		final byte truskawkowy = 0,malinowy = 1,brzoskwiniowy = 2,agrestowy = 3;
		
		for(int i = 0; i < ile; i++){
			
		sloik = ((byte) ((byte) (Math.random()*Math.pow(10, 1)) % 4));
		//znak = (int)((Math.random() * 10) % 2) == 0 ? true : false;
		//wrt = znak ? -wrt : wrt;
	
		System.out.println(sloik);
		
			switch (sloik){
				case truskawkowy: 
				System.out.println("truskawkowy");
				break;
				case malinowy: 
				System.out.println("malinowy");
				break;
				case brzoskwiniowy: 
				System.out.println("brzoskwiniowy");
				break;
				case agrestowy: 
				System.out.println("agrestowy");
				break;						
		}
		
		}
	}


}