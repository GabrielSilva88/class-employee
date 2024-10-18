package view;

import java.util.Scanner;

import model.Funcionario;

public class Main {
	/*
	Classe Funcionário:
	Crie uma classe Funcionario com os atributos nome, cargo e salario. 
	Implemente métodos para definir e obter os valores dos atributos, bem como um método para aumentar o salário em uma certa porcentagem.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionario f = new Funcionario();
		
		f.setSalario(1500.50);
	
		System.out.println("Digite o valor de porcentagem: ");
		double salarioNovo = f.aumentarSalario(scan.nextDouble());
		
			
		System.out.println("Valor do salário: "+ f.getSalario() + "\nNovo Salário: " + salarioNovo);
	}
}
