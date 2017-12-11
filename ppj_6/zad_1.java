public class zad_1
{

	public static void main(String args[]){

		int tab[] = new int[10];

		for (int i = 0; i < tab.length; i++){
			
			tab[i] = Math.random() < 0.5 ? 1 : 0;
			System.out.println(tab[i]);
		}
}

}