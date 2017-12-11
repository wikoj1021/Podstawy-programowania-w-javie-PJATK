public class zad_2
{

	public static void main(String args[]){
		
		boolean stat;
		if ( Math.random() > 0.5)
		stat = true;
		else
		stat = false;

		System.out.println(stat);
		
		double zmienna = stat ? 1d : 5d;
		
		System.out.println(zmienna);
}

}