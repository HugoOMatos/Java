package lacosderepeticoes2;
public class LacosDeRepeticoes2 {
    public static void main(String[] args) {
        for(int linha = 1; linha <10; linha++){
            for(int coluna =0; coluna <=linhab; coluna++){
                if(coluna > linha){
                    break;// FORÇANDO A PARADA
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
