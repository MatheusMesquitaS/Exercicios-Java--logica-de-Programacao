package dorColetiva;
import java.util.Scanner;

public class LoopInfinito {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	       
	        for (;;) {
	            System.out.print("Insira um número (Descubra o número chave para parar o programa) : ");
	            int numero = scanner.nextInt();

	            if (numero == 0) {
	            	 System.out.println(" -------------------------------");
	 	            System.out.println("Você inseriu: " + numero);
	                System.out.println("Loop encerrado. Parabéns!! Você inseriu o número chave para encerrar o programa.");
	                break; 
	                }

	           
	        }

	        
	     
		
		

	}

}

