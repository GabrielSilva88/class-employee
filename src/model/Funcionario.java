package model;

public class Funcionario {
/*
Classe Funcionário:
Crie uma classe Funcionario com os atributos nome, cargo e salario. 
Implemente métodos para definir e obter os valores dos atributos, bem como um método para aumentar o salário em uma certa porcentagem.
*/
	
	private String nome;
	private String cargo;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
		// redundante pois o aumenta Salario ja pode fazer esse aumento.
	/*
	public double certaProcentagem(double porcentagem) {
		return this.salario * (porcentagem /100);
	}*/
	
	public double aumentarSalario(double porcentagem) {
		double aumentar = this.salario * (porcentagem / 100);
		return aumentar;
	}
	
}
