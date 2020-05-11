package model;

public class Diretor extends Funcionario {
	private float beneficio;

	// GETs e SETs
	public float getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(float beneficio) {
		this.beneficio = beneficio;
	}
	// FIM GETs e SETs

	public void imprimirInfo() {
		System.out.println("Diretor      " + super.nome + " (" + super.email + ")");
		System.out.println("Salario R$   " + super.salario);
		System.out.println("Benefício R$ " + beneficio);

	}
}
