package dorColetiva;

public class PulaNumeroTres {

	public static void main(String[] args) {
		for (int externo = 1; externo <= 5; externo++) {
           
            for (int interno = 1; interno <= 5; interno++) {
                
                if (interno == 3) {
                    continue;
                }
                
                System.out.print(interno + " ");
            }
           
            System.out.println();
        }

	}

}
