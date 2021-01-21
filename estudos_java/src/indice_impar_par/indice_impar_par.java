package indice_impar_par;
import java.util.Scanner;


public class indice_impar_par
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Digite um nome: ");
		String nome = input.nextLine();
		
		String caracteresPar = "";
		String caracteresImpar = "";
		
		for (int i = 0; i < nome.length(); i++)
		{
		    if (i % 2 == 0) //par
		    {
		        caracteresPar += nome.charAt(i);
		    }
		    else //impar
		    {
		        caracteresImpar += nome.charAt(i);
		    }
		}
		
		System.out.println(caracteresPar);
		System.out.println(caracteresImpar);
	}
}
