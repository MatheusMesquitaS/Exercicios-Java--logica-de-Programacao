package dorColetiva;

public class Array {

	public static void main(String[] args) {

		int[] numeros = {1,2,3,4,5,6,-7,8,9};
		
		for (int numero :numeros) {
			System.out.println(numero);
			
			if(numero < 0 ) {
				System.out.println("Um número negativo foi encontrado!");
				break;
			}
		}

	}

}
