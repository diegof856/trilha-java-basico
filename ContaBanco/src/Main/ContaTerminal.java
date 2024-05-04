package Main;

import java.util.Scanner;

import entidade.Conta;

import java.util.Locale;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		// TODO: "inserir dados do cliente"

		Conta contaInserida = inserirCliente(scanner);

		// imprimir dados
		imprimirDados(contaInserida);
		scanner.close();
	}

	public static Conta inserirCliente(Scanner scanner) {
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Digite a agencia: ");
		String agencia = scanner.nextLine();
		System.out.print("Insira o numero da conta: ");
		int numeroConta = scanner.nextInt();
		System.out.print("Insira agora o saldo inicial: ");
		double saldoInicial = scanner.nextDouble();
		return new Conta(numeroConta, agencia, nome, saldoInicial);
	}

	public static void imprimirDados(Conta contaInserida) {
		System.out.println("Olá " + contaInserida.getNomeCliente() + ", obrigado por "
				+ "criar uma conta em nosso banco, sua agência é " + contaInserida.getAgencia() + ", conta "
				+ contaInserida.getNumero() + " e seu saldo " + contaInserida.getSaldo()
				+ " já está disponível para saque");
	}

}
