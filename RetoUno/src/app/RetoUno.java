package app;

import java.util.Scanner;

public class RetoUno {
	static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean num1ok = false;
		boolean num2ok = false;
		int result = 0;
		int opc = 0;
		
		do {
	        System.out.println("\n�Que operaci�n quisiera realizar?");
			System.out.println("\n1. Suma de n�meros enteros positivos: "+ "\n2. Suma de cualquier n�mero: " + "\n3. Resta de n�meros enteros positivos: " + "\n4. Multiplicaci�n: " + "\n5. Potencia: "+"\n6. Raiz de un n�mero: "+"\n7. Salir");
			opc = entrada.nextInt();
			System.out.println("-------------------------------------------------------------\n");
			
			switch(opc) {
				case 1:
					System.out.println("Digite dos n�meros enteros positivos");
					System.out.println("Digite el primer n�mero: ");
					int num1 = entrada.nextInt();
					System.out.println("Digite el segundo n�mero: ");
					int num2 = entrada.nextInt();
					if (num1 >=0 && num2 >=0) {
						num1ok=true;
						num2ok=true;
						Operaciones suma = new Operaciones();
						result = suma.suma(num1, num2);
						System.out.println("El resultado de la suma es: " + result);
						break;
					}
					else {
						System.out.println("Por favor digite un n�mero valido");
						break;
					}
				case 2:
					Operaciones suma1 = new Operaciones();
					System.out.println("Digite dos n�meros");
					Double num11 = suma1.NroDecimal("Digite el primer n�mero: ");
					Double num22 = suma1.NroDecimal("Digite el segundo n�mero: ");
					Double resul = suma1.sumar(num11, num22);
					System.out.println("El resultado de sumar "+num11+" + "+num22+" es igual a: "+resul);
					break;
				case 3:
					System.out.println("Digite dos n�meros enteros positivos");
					System.out.println("Digite el primer n�mero: ");
					int numRes1 = entrada.nextInt();
					System.out.println("Digite el segundo n�mero: ");
					int numRes2 = entrada.nextInt();
					if (numRes1 >=0 && numRes2 >=0) {
						num1ok=true;
						num2ok=true;
						Operaciones resta = new Operaciones();
						result = resta.resta(numRes1, numRes2);
						System.out.println("El resultado de la resta es: " + result);
						break;
					}
					else {
						System.out.println("Por favor digite un n�mero valido");
						break;
					}
					
				case 4:
					System.out.println("Digite dos n�meros");
					System.out.println("Digite el primer n�mero: ");
					int nummul1 = entrada.nextInt();
					System.out.println("Digite el segundo n�mero: ");
					int nummul2 = entrada.nextInt();
					Operaciones multiplicar = new Operaciones();
					Double total= multiplicar.Multiplicaci�n(nummul1, nummul2);
					System.out.println("El resultado de la multiplicaci�n es: " +total);					
					break;
				case 5:
					System.out.println("Digite dos n�meros");
					System.out.println("Digite el primer n�mero: ");
					int numPow1 = entrada.nextInt();
					System.out.println("Digite el segundo n�mero: ");
					int numPow2 = entrada.nextInt();
					Double res= Math.pow(numPow1, numPow2);
					System.out.print("el resultado de elevar el n�mero "+numPow1+ " al exponente "+numPow2+" es igual a: "+ res);
					break;
				case 6:
					System.out.println("Digite un n�mero al cual desea sacar su ra�z");
					int numRaiz = entrada.nextInt();
					System.out.println("La ra�z del n�mero "+numRaiz+" es: "+Math.sqrt(numRaiz));
					break;
				default:
					if (opc == 7) {
						break;
					}
					else {
						System.out.println("Opci�n invalida, por favor digite un n�mero de los que presenta el men�.");		
					}
			}
		}while(opc!=7);
		System.out.println("\nHa salido del programa");

	}

}
