public class zad_4
{

	public static void main(String args[]){

		int start = -100;
		int stop = 100;
		int liczbaPodz1 = 8;
		int liczbaPodz2 = 3;

		while(start % liczbaPodz1 != 0)start++;
		
		for(int i = start; i <= stop; i += liczbaPodz1){
			
			if(i % liczbaPodz2 == 0 && i != 0)System.out.println(i);
			
		}

}

}