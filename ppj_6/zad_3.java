public class zad_3
{

	public static void main(String args[]){
		
		boolean error = true;
		int tab[] = new int[1];
		int start = 10000000;
					   
		int wielkosc = 599999999; //(int)(Math.random()*Integer.MAX_VALUE);
		do {
			
			try{
				error = false;
			tab = new int[wielkosc];
			}catch (java.lang.OutOfMemoryError e){
			
			System.out.println(wielkosc);
			wielkosc-=start;
			error = true;
			
			}
			if (start > 0 && !error){
				wielkosc += start;
				error = true;
				start /= 10;
				
			}
		}while (error);
		
		
		
		System.out.println("dozwolona wielkosc"+tab.length);
		
}

}