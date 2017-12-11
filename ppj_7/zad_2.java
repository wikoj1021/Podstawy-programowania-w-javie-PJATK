public class zad_2{

	public static void main(String args[]){

		char tab[] = new char[(int)(Math.random()*20)];
		char revtab[] = new char[tab.length];
		
		for(int i = 0; i < tab.length; i++){
			
			//char znak = (char)/*('A' + (int)(Math.random()**/('A' - 'Z');//));
			
			//System.out.println(znak);
			
			tab[i] = (char)('A' + (int)(Math.random()*('Z' - 'A')));
			
			System.out.println(tab[i]);

		}
		
		System.out.println();
		
		for(int i = 0; i < tab.length; i++){
			
			revtab[i] = tab[tab.length - i - 1]; 
			System.out.println(revtab[i]);
		}

	}

}