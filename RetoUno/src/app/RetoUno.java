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
	        System.out.println("\n¿Que operación quisiera realizar?");
			System.out.println("\n1. Suma de números enteros positivos: "+ "\n2. Suma de cualquier número: " + "\n3. Resta de números enteros positivos: " + "\n4. Multiplicación: " + "\n5. Potencia: "+"\n6. Raiz de un número: "+"\n7. Salir");
			opc = entrada.nextInt();
			System.out.println("-------------------------------------------------------------\n");
			
			switch(opc) {
				case 1:
					System.out.println("Digite dos números enteros positivos");
					System.out.println("Digite el primer número: ");
					int num1 = entrada.nextInt();
					System.out.println("Digite el segundo número: ");
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
						System.out.println("Por favor digite un número valido");
						break;
					}
				case 2:
					Operaciones suma1 = new Operaciones();
					System.out.println("Digite dos números");
					Double num11 = suma1.NroDecimal("Digite el primer número: ");
					Double num22 = suma1.NroDecimal("Digite el segundo número: ");
					Double resul = suma1.sumar(num11, num22);
					System.out.println("El resultado de sumar "+num11+" + "+num22+" es igual a: "+resul);
					break;
				case 3:
					System.out.println("Digite dos números enteros positivos");
					System.out.println("Digite el primer número: ");
					int numRes1 = entrada.nextInt();
					System.out.println("Digite el segundo número: ");
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
						System.out.println("Por favor digite un número valido");
						break;
					}
					
				case 4:
					System.out.println("Digite dos números");
					System.out.println("Digite el primer número: ");
					int nummul1 = entrada.nextInt();
					System.out.println("Digite el segundo número: ");
					int nummul2 = entrada.nextInt();
					Operaciones multiplicar = new Operaciones();
					Double total= multiplicar.Multiplicación(nummul1, nummul2);
					System.out.println("El resultado de la multiplicación es: " +total);					
					break;
				case 5:
					System.out.println("Digite dos números");
					System.out.println("Digite el primer número: ");
					int numPow1 = entrada.nextInt();
					System.out.println("Digite el segundo número: ");
					int numPow2 = entrada.nextInt();
					Double res= Math.pow(numPow1, numPow2);
					System.out.print("el resultado de elevar el número "+numPow1+ " al exponente "+numPow2+" es igual a: "+ res);
					break;
				case 6:
					System.out.println("Digite un número al cual desea sacar su raíz");
					int numRaiz = entrada.nextInt();
					System.out.println("La raíz del número "+numRaiz+" es: "+Math.sqrt(numRaiz));
					break;
				default:
					if (opc == 7) {
						break;
					}
					else {
						System.out.println("Opción invalida, por favor digite un número de los que presenta el menú.");		
					}
			}
		}while(opc!=7);
		System.out.println("\nHa salido del programa");

	}

}
