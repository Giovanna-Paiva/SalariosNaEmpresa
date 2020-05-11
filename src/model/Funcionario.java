package model;

public class Funcionario {
	
	protected String nome;
	protected String email;
	protected float salario;
	
	public void aumentarSalario(float percentual) {
		this.salario += salario * percentual/100;
	}
	
	public void imprimirInfo() {
		System.out.println("Funcionário: "+nome+" ("+email+")");
		System.out.println("Salário: R$  "+salario);
	}
	
	// GETS E SETS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// FIM GETS E SETS
	
	/*
	// CONSTRUTOR
	public Funcionario(String nome, String email, float salario) {
		super();
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	// FIM CONSTRUTOR
	*/
	
}
