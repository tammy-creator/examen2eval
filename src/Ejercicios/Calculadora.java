package Ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			System.out.println("calculadora > ");
			Scanner teclado = new Scanner(System.in);
			String linea = teclado.nextLine();		
			
			do {
				calcular(linea);
				linea="";
				System.out.println("calculadora > ");
				linea = teclado.nextLine();		
			}while(!linea.equals("fin")) ;
			
		}

	public static void calcular(String linea) {
		
		String[] datos = linea.split("\\s");
		int resultado=0;
		int num1=0;
		int num2=0;
		
		try{
        	num1=Integer.parseInt(datos[0]);
        	num2=Integer.parseInt(datos[2]);
    	}catch(NumberFormatException ex){
        	System.out.println("No es un número");
    	}
		
		switch (datos[1]) {
		case "+": resultado=num1+num2;
			break;
		case "-": resultado=num1-num2;
			break;
		case "*": resultado=num1*num2;
			break;	
		case "/": resultado=num1/num2;
			break;
		}
		System.out.println(resultado);
		
		
		
		
	}

}
