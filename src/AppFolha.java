import model.Diretor;
import model.Funcionario;

public class AppFolha {
	public static void main(String args[]) {
	
	Funcionario f = new Funcionario();
	Diretor 	d = new Diretor();

	f.setNome("Giovanna");
	f.setEmail("giovanna@email.com");
	f.setSalario(4000.00f);
	
	d.setNome("Felipe");
	d.setEmail("felipe@gmail.com");
	d.setSalario(7000.00f);
	d.setBeneficio(1000.00f);
	
	f.imprimirInfo();
	
	System.out.print("\n \n");
	
	d.imprimirInfo();
	
	}
}