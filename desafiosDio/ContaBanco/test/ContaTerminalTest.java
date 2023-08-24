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

        System.out.println("Programa: Por favor, digite o seu nome!");
        System.out.print("Usuário: ");
        String texto;
        texto = sc.nextLine();
        texto = sc.nextLine();
        conta.setNome_cliente(texto);
        System.out.println();

        System.out.println("Programa: Por favor, digite o saldo!");
        System.out.print("Usuário: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println(









































        );
        System.out.println( conta.toString());

        sc.close();
    }
}
