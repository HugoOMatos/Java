package clientecontabanco;

public class ContaCorrente extends Conta{
    
  final double valorSaque = 620 +0.10;

    public ContaCorrente(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }

    
    public void sacar() {
        if (valorSaque > saldo) {
            System.out.println("Saldo Insulficiente\nTransação não permitida.");
        } else {
            this.saldo -= valorSaque;

            System.out.println("Saque no valor de R$620.00 reais (TAXA DE R$0.10) feito da Conta Corrente Realizado com Sucesso!!");

        }
    }
}