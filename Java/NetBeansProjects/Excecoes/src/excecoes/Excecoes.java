package excecoes;
public class Excecoes {
    public static void main(String[] args) {
 System.out.println("Incicio do man");
        metodo1();
        System.out.println("Fim do main");
        
    }
    private static void metodo1(){
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }
    private static void metodo2(){
        System.out.println("Inicio do metodo 2");
        for(int i = 1; i <=5; i++){
            System.out.println(i);
            try{//EXPLICA QUE O METODO É PERIGOSO SER EXECUTADO E QUE PODE SER EXECUTADO MESMO ASSIM
                  //          int a = i /0;
                  Fluxo f = null;
                  f.deposita();
            }catch(ArithmeticException ex){// PEGA O TIPO DE EXCESSAO E TRATA O ERRO QUE O JAVA DÁ
            //    System.out.println("ArithmeticException ");
            //ex.printStackTrace(); // EX. TRAS TODAS REFERENCIAS POR EXCEÇOES 
            } catch (NullPointerException ex){
                ex.printStackTrace();
            }
    }
        System.out.println("Fim do metodo 2 ");
    } 
        
    }


