public class zad_2
{

	public static void main(String args[]){

		int tab[] = new int[10];
		
		int ilosc[] = new int[2];

		for (int i = 0; i < tab.length; i++){
			
			tab[i] = Math.random() < 0.5 ? 1 : 0;
			System.out.println(tab[i]);
			if (tab[i] == 0)ilosc[0]++;
			else ilosc[1]++;
		}

		System.out.println("ile zer: "+ilosc[0]);
		System.out.println("ile jedynek: "+ilosc[1]);
}

}