package aulacursoemvideosistemabancario;

public class ContaCreuza {
    public int numConta;
    protected String tipoConta;
    private String cliente;
    private float saldo;
    private boolean status;

    public ContaCreuza() {
        this.saldo=0;
        this.status=false;
         
    }
    
    
    public void abrirConta(String tipoConta){
        setTipoConta(tipoConta);
        setStatus(true);
        if(getTipoConta() == "c/c"){
            saldo = 50;
        }else{
            if(tipoConta == "c/p"){
                saldo = 150;
            }
        }
    }
    
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Não é possivel cancelar a conta.");
        }else{
            if(saldo < 0 ){
                System.out.println("Conta em débito");
            }else{
                setStatus(status);
            }
        }
    }
    public void depositar(float v){
        if(getStatus() == true){ 
            setSaldo(getSaldo()+v);  
        }else{
            System.out.println("Impossivel depositar");
        }
        
    }
    public void sacar(float v){
        if(getStatus() == true){
            if(getSaldo() > v){
                setSaldo(getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        }
    }
    public void pagarMensa(){
        float v=0;
        if(getTipoConta() == "c/c"){
            v = 12;
        }else{
            if(getTipoConta() == "c/p"){
                v = 20;
            }else{
                if(status = true){
                    if(saldo > v ){
                        setSaldo(getSaldo() - v);
                    }else{
                        System.out.println("Saldo Insuficiente");
                    }
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
