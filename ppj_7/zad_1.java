public class zad_1{

	public static void main(String args[]){

		int tab[] = new int[20];
		
		int ile[] = new int[3];
		
		
		for(int i = 0; i < tab.length; i++){
			
			tab[i] = (int)(Math.random()*3+1);
			
			ile[tab[i] - 1]++;
			
		}
		
		System.out.println(ile[0]);
		System.out.println(ile[1]);
		System.out.println(ile[2]);
	}

}