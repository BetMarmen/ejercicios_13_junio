package vector10n;

import java.util.Scanner;

public class main_10num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n=10;
		int []vect=new int [n];
		int i=0;
		while(i<vect.length) {
			System.out.println("Ingrese el numero:");
			try {
				
				int num= scan.nextInt();
				if(num<0) {break;}
				vect[i]=num;
				i++;
			}
			
			catch(Exception e)
			{
				System.out.println("Debe ingresar un numero entero positivo!");
				scan.nextLine();
			}
		}
			System.out.println("Elementos ingresados en el vector:");
			for(int j=0;j<i;j++) 
			{
				System.out.println(vect[j]);
			}
		
	}

}
