import java.util.Scanner; //Falta importar Scanner

public class Codigo5 {

	//Se le agregó el main
	public static void main(String[] args) {
		
		Scanner s = new Scanner();
		System.out.print("Introduzca un número: ');
		//String ni = s.nextLine(); // esto sería una mala práctica de programación.
		//int c = ni;// Es completamente innecesario  
		int ni = s.nextInt(); //Se le agregó una variable de entrada tipo entero. 
				
		int afo = 0;
		int noAfo = 0;
				
		while (ni > 0) {
			//No es necesario los parentecis en la operación.
			int digito = ni % 10; //Se le quita el int porque nuestras entradas las hemos definido como enteros.lo cual sería innecesario
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
					afo++;
			} else {
					noAfo++;
						
					ni /= 10;
			}
					
			if (afo > noAfo) {
					System.out.prinln("El " + c + " es un número afortunado.");
				} else {
					System.out.println("El " + c + " no es un número afortunado.");
				}
					
			}
		}
	  
	}