package Application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Enter account data");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Cliente: ");
		String cliente = sc.next();
		System.out.print("Saldo Inicial: ");
		Double saldo = sc.nextDouble();
		System.out.print("Limite de Saque: ");
		Double limiteDeSaque = sc.nextDouble();
		
		Account account = new Account(number, cliente, saldo, limiteDeSaque);
		
		System.out.print("Entre com o valor de saque: ");
		Double saque = sc.nextDouble();
		System.out.print("Saldo atualizado: " + (saldo - saque) );
		
		
		sc.close();
	}

}
