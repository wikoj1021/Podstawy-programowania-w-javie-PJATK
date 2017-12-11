public class zad_4
{

	public static void main(String args[]){
		
		double tab[] = new double[10];
		
		for (int i = 0; i < tab.length; i++){
			
			tab[i] = Math.random()*Double.MAX_VALUE;
			System.out.println(tab[i]); 
			
		}

		System.out.println("-----------liczby o parzystym indeksie-----------");
		
		for (int i = 0; i < tab.length; i+=2){
			
			System.out.println(i+" "+tab[i]);
			
		}
		
		System.out.println("-----------liczby nieparzyste-----------");
			
			for (int i = 0; i < tab.length; i++){
				
				int aktTab = (int)(tab[i]);
				
				if (aktTab%2 == 1){
					
					System.out.println(i+" "+aktTab+" "+tab[i]);
					
				}
				
			}
			
		
		
}

}