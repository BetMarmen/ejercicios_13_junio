package vector_caracteres;

import java.util.Scanner;

public class caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc= new Scanner(System.in);
		 int cantidad = 0;

		 
		 
		 System.out.println("Ingrese el tamaño del vector");
		 cantidad= tc.nextInt();
		 tc.nextLine();
		 String[] vectororig= new String[cantidad];
		 System.out.println("Ingrese los elementos del vector");
		 for(int i=0; i<cantidad; i++) {
			 System.out.println("Elementos"+(i+1)+":");
			 vectororig[i]=tc.nextLine();
		 }
		 String[] vectorinver= new String [cantidad];
		for (int i=0;i<cantidad; i++) {
			vectorinver[i]=vectororig[cantidad-1-i];
		}
		System.out.println("El vector inversor es: ");
		for (int i=0; i<cantidad; i++) {
			System.out.println(vectorinver[i]);
		}
		 
		 
			
			}
		}

	
