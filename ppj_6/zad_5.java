import java.awt.BorderLayout;
import java.awt.GraphicsDevice;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class zad_5
{

	
	
	public static void main(String args[]){

		int tab[] = {0 ,0 ,0 ,0 ,2 ,0 ,0 ,0 ,0};
		
		int n = 0;
		
		int sleepTime = Integer.parseInt(args[0]);
		
		System.out.println(sleepTime);
		
		JLabel label1[] = new JLabel[4];

		JFrame window = new JFrame("test");
		window.setBounds(new Rectangle(800,600));
		window.setLocationRelativeTo(null);
		//window.
		
		java.awt.Canvas c;
		
		for (int i = 0; i < label1.length; i++) {
			label1[i] = new JLabel("test_"+i);
			label1[i].setSize(100, 30);
			label1[i].setLocation(new Point(0,i*30));
			//label[i].setAlignmentX(0);
			//label[i].setAlignmentY(i*10);
			System.out.println(label1[i].getX()+" , "+label1[i].getY());
			window.getContentPane().add(label1[i]);
			System.out.println(label1[i].getX()+" , "+label1[i].getY());
		} 
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int a = 0;
		while(true){
			a++;
			label1[1].setLocation(new Point(0,a));
			label1[1].setText("test_"+a);
			try{Thread.sleep(sleepTime);}catch(InterruptedException e){System.out.println(e);}
			
			/*
			for (int i = 0; i < 3; i++){
				System.out.print(i+" ");
				for (int j = 0; j < 3; j++){
			
					System.out.print(tab[i*3+j]);
					label[0].
				}
				System.out.println();
			}
			
			tab = new int[] {0,0,0,0,2,0,0,0,0};
			for (int p = 0; p < 5; p++){
				tab = new int[] {0,0,0,0,2,0,0,0,0};
				switch (p){
					case 0:
						tab[0] = 1; tab[8] = 3;
						break;
					case 1:
						tab[6] = 1; tab[2] = 3;
						break;
					case 2:
						tab[8] = 1; tab[0] = 3;
						break;
					case 3:
						tab[2] = 1; tab[6] = 3;
						break;
				}
				for (int i = 0; i < 3; i++){
					System.out.print(i+" ");
					for (int j = 0; j < 3; j++){
				
						System.out.print(tab[i*3+j]);
				
					}
					System.out.println();
				}
				try{Thread.sleep(200);}catch(InterruptedException e){System.out.println(e);}
				System.out.println();
				}
			*/	
				
		}	
	}
}

