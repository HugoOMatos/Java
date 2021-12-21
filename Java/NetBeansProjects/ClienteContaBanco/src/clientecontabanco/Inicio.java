package clientecontabanco;


public class Inicio {
    
    public static void main(String args[]){
     Cliente cliente1 = new Cliente("Nome Jorge Amado Paixão",  "CPF: 252.478.567-85");
        Cliente cliente2 = new Cliente("Nome Djonga Brown", "CPF: 123.462.223-23");
        Conta Corrente = new ContaCorrente(308, 105, cliente1);
        Conta Poupanca = new ContaPoupanca(214, 59, cliente2);

        System.out.println(Corrente);
        System.out.println(Poupanca);

        System.out.println("------------------------------------------");
        Corrente.depositar(1000);
        Poupanca.depositar(1000);
        System.out.println("------------------------------------------");

        System.out.println(Corrente);
        System.out.println(Poupanca);

         
        Corrente.sacar();
        Poupanca.sacar();

        System.out.println(Corrente);
        System.out.println(Poupanca);
    }
}



