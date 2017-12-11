public class zad_3{

	public static void main(String args[]){
		
		int [][] tab = {
				{1 , 0 , 0} ,
				{0 , 1 , 0} ,
				{0 , 0 , 1}
		} ;

		int tab_1[];
		int size = 0;
		
		for(int i = 0; i < tab.length; i++){
			
			size += tab[i].length;
			
		}
		
		tab_1 = new int[size];
		
		int x = 0;
		
		for(int i = 0; i < tab.length; i++){
			for (int n = 0; n < tab[i].length; n++){
				tab_1[x] = tab[i][n];
				System.out.print(tab_1[x]);
				x++;
			}
		}
		

	}

}