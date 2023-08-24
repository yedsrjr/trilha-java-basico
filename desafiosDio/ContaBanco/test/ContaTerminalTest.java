package desafiosDio.ContaBanco.test;

import desafiosDio.ContaBanco.classes.ContaTerminal;

import java.util.Scanner;

public class ContaTerminalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Programa: Por favor, digite o número da Agência!");
        System.out.print("Usuário: ");
        conta.setAgencia(sc.next());
        System.out.println();

        System.out.println("Programa: Por favor, digite o número da Conta!");
        System.out.print("Usuário: ");
        conta.setNumero(sc.nextInt());
        System.out.println();

        System.out.println("Programa: Por favor, digite o seu nome completo!");
        System.out.print("Usuário: ");
        conta.setNome_cliente(sc.next());
        System.out.println();

        System.out.println("Programa: Por favor, digite o saldo!!");
        System.out.print("Usuário: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println(









































        );
        System.out.println( conta.toString());

        sc.close();
    }
}
