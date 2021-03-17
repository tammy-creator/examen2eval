package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alquiler alquileres[]= new Alquiler[4];
		
		alquileres[0]= new TMercancias("CPY0566", 85, "furgoneta", 5);
		alquileres[1]= new TMercancias("CHY6666", 550, "camion", 10);
		alquileres[2]= new TPersonas("BGT5522",52,"coche",4);
		alquileres[3]= new TPersonas("LKJ5520",250,"microbus",40);
		
		System.out.println("Introduce el número de días de alquiler");
		Scanner teclado = new Scanner(System.in);
		int numDias = teclado.nextInt();
				
		for(Alquiler a:alquileres) {
			System.out.println(a.toString()+" Precio Alquiler: "+a.getPrecioAlquiler(numDias));
			
		}
	}

}
