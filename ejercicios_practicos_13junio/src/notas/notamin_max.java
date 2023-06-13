package notas;

import java.util.Scanner;

public class notamin_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int notas;
		int not[]=new int[5];
		int sum=0;
		int nmax=0;
		int nmin=10;
		
	  for (int i = 0; i < not.length; i++) {
		  do {
		  System.out.println("Ingrese la nota "+(i+1)+" : ");
		  notas=scan.nextInt();
		     }
		  while(notas>10 || notas<0);
		  not[i] = notas;
		  sum+=notas;
		  if(notas>nmax) {
			  nmax=notas;
		  }
		 
		  if(notas<nmin) {
			  nmin=notas;
		  }
		  }
	  System.out.println("Notas ingresadas");
		for(int notes: not) {
			System.out.println(notes);
		}
		double prom=(double)sum/not.length;
		System.out.println("Nota media: "+Math.floor(prom));
		System.out.println("Nota menor: "+nmin);
		System.out.println("Nota mayor: "+nmax);
	}

}
