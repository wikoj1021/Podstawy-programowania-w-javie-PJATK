public class zad_4{

	public static void main(String args[]){

		double [][] punkt = {
				{1} ,
				{0} ,
				{0}
		};
		
		double [][] przesuniecie = {
				{ 1 , 0 , 2} ,
				{ 0 , 1 , 2} ,
				{ 0 , 0 , 1}
		};
		
		double [][] rezultat = new double [3][1] ;

		for(int i = 0; i < przesuniecie.length; i++){
			
			for(int n = 0; n < przesuniecie[i].length; n++ ){
				
				rezultat[i][0] += przesuniecie[i][n]*punkt[n][0];
				
			}
			
			System.out.println(rezultat[i][0]);
			
		}
		
	}

}