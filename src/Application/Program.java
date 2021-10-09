package Application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.entities.exceptions.BussinesException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
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
		
	
		System.out.println();
		System.out.print("Entre com o valor de saque: ");
		Double saque = sc.nextDouble();

		try {
		account.saque(saque);
		System.out.printf("Saldo atualizado: %.2f%n ", account.getSaldo() );
		}
		catch(BussinesException e){
			System.out.println(e.getMessage());
		}
		
				
		sc.close();
	}

}
