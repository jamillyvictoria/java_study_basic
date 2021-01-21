package pessoa;

public class testePessoa 
{

	public static void main(String[] args) 
	{
		 Pessoa mulher = new Pessoa();
		 
		 if (mulher instanceof Pessoa) 
		 {
			 System.out.println ("Sim, é do tipo " + Pessoa.class.getSimpleName());
		 }

	}

}
