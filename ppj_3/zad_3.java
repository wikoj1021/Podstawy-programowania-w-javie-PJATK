public class zad_3
{

	public static void main(String args[]){

		java.util.Scanner user_input = new java.util.Scanner(System.in);
		
		//try{
			
			byte wrt = user_input.nextByte();
			int jeden = 1;
			for(int i = 0; i < 8; i++){
			//System.out.print(wrt + "/");
			System.out.println(wrt & jeden);
			
			jeden = (byte) (jeden << 1);
			}
			
		//}
		//catch(){
			
			
			
		//}

	}

}