import java.util.Scanner;

public class Principal{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba la primera palabra o frase");
		String x = sc.nextLine();
		System.out.println("Escriba la segunda palabra o frase");
		String y = sc.nextLine();
                
		System.out.println("Exactamente iguales");
		System.out.println(x.contentEquals(y));
		System.out.println("Sin contar con mayúsculas ni minúsculas");
		System.out.println(x.equalsIgnoreCase(y));
	}
}

