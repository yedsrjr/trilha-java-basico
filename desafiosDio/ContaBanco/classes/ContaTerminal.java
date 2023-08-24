package desafiosDio.ContaBanco.classes;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nome_cliente;
    private double saldo;

    public ContaTerminal() {
    }

    @Override
    public String toString() {
        return "Olá " + this.nome_cliente + ", " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + this.agencia + ", conta " +
                this.numero + " e seu saldo " + this.saldo +
                " já está disponível para saque.";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
