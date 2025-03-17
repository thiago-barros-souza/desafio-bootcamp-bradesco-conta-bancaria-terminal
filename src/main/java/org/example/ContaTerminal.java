package org.example;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		double saldo = 0.0;
		Scanner input = new Scanner(System.in);

		saudacaoBanco();
		System.out.println("Seja bem vindo(a)!, Preencha as informações solicitadas para criarmos sua conta.\n");

		System.out.print("Por favor, digite o número da conta: ");
		int conta = input.nextInt();

		System.out.print("Por favor, digite o número da agência: ");
		String agencia = input.next();

		System.out.print("Por favor, digite o seu nome: ");
		String nomeCliente = input.next();

		System.out.println("\nDeseja fazer um depósito inicial na sua conta: ");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Informe a opção: ");
		String realizarDeposito = input.next();

		if (realizarDeposito.equals("1")) {
			System.out.print("Informe o valor do depósito: ");
			saldo += input.nextDouble();
		}

		saudacaoBanco();
		System.out.printf(
				"\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!",
				nomeCliente, agencia, conta, saldo);
	}

	private static void saudacaoBanco() {
		System.out.println("#".repeat(30));
		System.out.println("# Banco BradesTeste ##########");
		System.out.println("#".repeat(30));
	}
}