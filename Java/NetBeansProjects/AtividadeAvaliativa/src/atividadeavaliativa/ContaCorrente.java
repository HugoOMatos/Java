package atividadeavaliativa;


public class ContaCorrente {
    private int numeroConta;
    private int agencia;
    private String cliente;
    private float saldo;
    
    public void setNumeroConta(int numeroConta){
        if(numeroConta >0){
            this.numeroConta=numeroConta;
        }else{
            System.out.println("Conta Inválida");
        }
    }
    public int getNumeroConta(){
       return  this.numeroConta;
    }
    public void setAgencia(int agencia){
            if(agencia >0){
                this.agencia=agencia;
            }else{
                System.out.println("Agencia Inválida");
            }
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setCliente(String cliente ){
        this.cliente=cliente;
    }
    public String getCliente(){
        return this.cliente;
    }
    public void setSaldo(float saldo){
        if(saldo == 0){
            this.saldo=saldo;
        }
    }
    public float getSaldo(){
        return this.saldo;
    }
    
    
    
}
