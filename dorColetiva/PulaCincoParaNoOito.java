package dorColetiva;

public class PulaCincoParaNoOito {

	public static void main(String[] args) {

		for (int valor = 1; valor < 10; valor++) {

			if (valor == 5) {
				continue;
			}
			System.out.println(valor);
			if (valor == 8) {
				break;
			}

		}

	}

}
