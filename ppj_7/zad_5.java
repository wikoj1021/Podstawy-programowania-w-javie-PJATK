public class zad_5{

	public static void main(String args[]){
		int size = 7;
		int third = (int)(Math.round(size/2));
		
		//System.out.println(third);
		
		int tab[][] = new int[size][size];
		
		for (int i = 0; i <= third; i++){
			for (int n = tab.length - size; n < size; n++){
				for (int x = tab[n].length - size; x < size; x++){

					tab[n][x] = i;
					
				}
			}					
					size --;					
		}
		
		for (int n = 0; n < tab.length; n++){
			for (int x = 0; x < tab[n].length ; x++){

				System.out.print(tab[n][x]);
				
			}
			System.out.println();
		}
		
	}
}