

public class zad_10
{

	public static void main(String args[]){
		
		char typ;
		char rzad1;
		char rzad0;	
		
		char input[];
		
		input = System.console().readPassword();
		
		 
		
		switch(input.length) {
		
			default:	
				typ = input[0];
				rzad1 = input[1];
				rzad0 = input[2];	
				break;
			
			case 2:
				typ = input[0];
				rzad1 = '0';
				rzad0 = input[1];
				break;
			
			case 1:
				typ = input[0];
				rzad1 = '0';
				rzad0 = '0';
			
			case 0:
				typ = 'd';
				rzad1 = '0';
				rzad0 = '0';
				break;
				
		}
		
		System.out.println(typ);
		System.out.print(rzad1);
		System.out.println(rzad0);
		
		System.out.println((int)('A'));
			
			
			switch(typ) {
			case 'b':
				System.out.println("Binarny : "+rzad1+rzad0);
				if((rzad0 == '0' || rzad0 == '1') && (rzad1 == '0' || rzad1 == '1')) {
					
					char rzad1tmp = (char)('0'+(int)(rzad0 - 48)+(int)((rzad1 - 48)*2));
					
					System.out.println("Decymalny : "+rzad1tmp);
					System.out.println("Heksadecymalny : "+rzad1tmp);
					
					
				}else System.out.println("bledne dane");
			
				//rzad1 
				break;
				
			case 'd':
				System.out.println("Decymalny : "+rzad1+rzad0);
				if((rzad0 >= 48 && rzad0 <= 57) && (rzad1 >= 48 || rzad1 <= 57)) {
					
					int liczba = (rzad1 - 48)*10+(rzad0-48);
					
					System.out.println(liczba);
					
					int tmpliczba = liczba;
					byte roznica;
					System.out.print("Binarny : ");
					for(int i = 7; i >= 0; i--) {
						
						System.out.print((int)((1 << i & liczba)/Math.pow(2,i)));
						
					}
					System.out.println();
	
					System.out.print("Heksadecymalny : ");
					if(liczba > 15) {
					
						//System.out.print(liczba-(Div(liczba,16)*16)+);
						
					}
					
				}else System.out.println("bledne dane");
				break;
				
			case 'h':
				System.out.println("Heksadecymalny :");
				break;
				
			default:
				System.out.println("Error");
				break;
			
			}
	}
}
