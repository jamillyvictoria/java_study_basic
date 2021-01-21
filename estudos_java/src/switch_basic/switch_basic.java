package switch_basic;
import java.util.Scanner;


public class switch_basic 
{


		public static void main(String[] args) 
		{
			Scanner input = new Scanner (System.in);
			
			
			System.out.println("Digite um número da semana: ");
			int nSemana = input.nextInt();
			
			switch (nSemana) 
			{
			    case 1:
			        System.out.println(" O seu dia da semana foi Domingo!");
			        break;
			    case 2:
			        System.out.println(" O seu dia da semana foi Segunda!");
			        break;
			    case 3:
			        System.out.println(" O seu dia da semana foi Terça!");
			        break;
			    case 4:
			        System.out.println(" O seu dia da semana foi Quarta!");
			        break;
			    case 5:
			        System.out.println(" O seu dia da semana foi Quinta!");
			        break;
			    case 6:
			        System.out.println(" O seu dia da semana foi Sexta!");
			        break;
			    case 7:
			        System.out.println(" O seu dia da semana foi Sábado!");
			        break;
			    default:
			        System.out.println("Dia Inválido");
			        
			}
			
			
		}
	}

