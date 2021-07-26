package app;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operaciones {
	
	public int suma(int num1, int num2) {
		try {
			return num1 + num2;	
		}
		catch(InputMismatchException e) {
			System.out.println("Digitó un número que no es admitido, el error es: "+e);
		}
		return num1 + num2;
		
	}
	
	public Double sumar(double num11, double num22) {
		return num11 + num22;
	}
	
	public int resta(int num11, int num22) {
		try {
			return num11 - num22;	
		}
		catch(InputMismatchException e) {
			System.out.println("Digitó un número que no es admitido, el error es: "+e);
		}
		return num11 - num22;
		
	}
	
	public Double Multiplicación(double numMul1, double numMul2) {
		return numMul1 * numMul2;
	}
	
	
	public Double NroDecimal(String mensaje) {
		@SuppressWarnings("resource")
		Scanner leer= new Scanner(System.in);
		Double num1 = null;
		String valorLee;
		do {
			System.out.println(mensaje);
			try {
				valorLee = leer.next();
				num1=Double.parseDouble(valorLee);
			}catch(NumberFormatException e){
				num1=null;	
				System.out.println("Hubo un Error, al digitar mal un número "+e);
			}
		}while(num1==null);
		return num1;
		
	}
	
}
