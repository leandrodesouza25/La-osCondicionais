package La�ocsCondicionais;
import java.util.Scanner;
public class Maiornumero {

	public static void main(String[] args) {
	  
		Scanner ler = new Scanner(System.in);
		
		int n1 , n2 , n3 , maior = 0;
		
		System.out.println("Digite  3 numeros: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		
		if(n1 <= n2 && n2 <= n3) {
			
			System.out.printf("A ordem crescente �: " + n1 + n2 + n3);
		}
		
		else if(n1 <= n3 && n2 <= n3) {
			System.out.printf("A ordem crescente �: " + n1 , n3 , n2);
			
		}
		
		else if (n2 <= n3 && n2 <= n1) {
			System.out.println("A ordem crescente �: " + n2 + "," + n1 + "," + n3);
		}
		
		else if(n2 <= n1 && n2 <= n3 ) {
			System.out.println("A ordem crescente �: " + n2 + "," + n3 +"," + n1);
		}
		
		else if(n3 <= n1 && n2 <= n1 ) {
			System.out.println("A ordem crescente �: " + n2 + "," + n1 + " ," + n3);
		}
		
		else if (n3 <= n2 && n1 <= n2 ) {
			  System.out.println("A ordem �:" + n3 + " , " +n2 +" , "+ n1);
			  
		}
			  if (n1 > n2 && n1 > n3) {
			  
			  maior = n1;
			  
			  System.out.println("O maior valor �:" + maior);
			  }
		
			  else if (n2 > n1 && n2 > n3) {
				  
				  maior = n2;
				  
				  System.out.println("O maior valor �:" + maior);
			  }
			  
			  else if (n3 > n1 && n3 > n2) {
				  
				  maior = n3;
				  System.out.println("O maior valor �: " + maior);
			  }
		}
		
		
	}


