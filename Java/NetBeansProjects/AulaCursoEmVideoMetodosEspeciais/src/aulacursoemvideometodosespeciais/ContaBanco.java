package aulacursoemvideometodosespeciais;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String cliente;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("----------------------------------------------");
        System.out.println("Conta " + getNumConta());
        System.out.println("tipo conta " + getTipoConta());
        System.out.println("cliente da conta " + getCliente());
        System.out.println("saldo " + getSaldo());
        System.out.println("status da conta " + getStatus());
        System.out.println("----------------------------------------------");
        
    }

    public ContaBanco() {
        this.saldo=0;
        this.status=false;
         
    }
    
    
    public void abrirConta(String tipoConta){
        this.setTipoConta(tipoConta);
        setStatus(true);
        if ("c/c".equals(tipoConta)) {
            this.setSaldo(50);
        } else if("c/p".equals(tipoConta)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta(){
        if(this.getSaldo()  > 0){
            System.out.println("Não é possivel cancelar a conta.");
        }else {
            if(this.getSaldo() < 0 ){
                System.out.println("Conta em débito");
            }else{
                this.setStatus(status);
                System.out.println("Conta fechada com sucesso");
            }
        }
    }
    public void depositar(float v){
        if(this.getStatus() ){  
           this. setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizadocom sucesso na conta " + this.getCliente());
        }else{
            System.out.println("Impossivel depositar");
        }
        
    }
    public void sacar(float v){
        if(this.getStatus() ){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado da conta ");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        }
    }
    public void pagarMensa(){
        float v = 0;
        if(this.getTipoConta() == "c/c"){
            v = 12;
        }else{
            if(getTipoConta() == "c/p"){
                v = 20;
            }else{
                if(this.getStatus()){
                   this.setSaldo(this.getSaldo() - v); 
                        System.out.println("Mensalidade paga com sucesso");
                }else{
                    System.out.println("Impossivel pagar");
                }
            }
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = false;
    }
    
    
    
}


