package dorColetiva;
import java.util.Scanner;

public class LoopInfinito {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	       
	        for (;;) {
	            System.out.print("Insira um n�mero (Descubra o n�mero chave para parar o programa) : ");
	            int numero = scanner.nextInt();

	            if (numero == 0) {
	            	 System.out.println(" -------------------------------");
	 	            System.out.println("Voc� inseriu: " + numero);
	                System.out.println("Loop encerrado. Parab�ns!! Voc� inseriu o n�mero chave para encerrar o programa.");
	                break; 
	                }

	           
	        }

	        
	     
		
		

	}

}

