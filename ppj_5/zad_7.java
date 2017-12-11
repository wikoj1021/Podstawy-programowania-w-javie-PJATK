public class zad_7
{

	public static void main(String args[]){
		
		int start = 2;
		int stop = 20;
		int x;
		
		for (int liczba = start; liczba <= stop; liczba++){
			
			for(x = 2; liczba % x != 0; x++);
			
			if (liczba != x) 
				System.out.println(liczba + " nie jest pierwsza");
				
		}

				
			
	}

}

