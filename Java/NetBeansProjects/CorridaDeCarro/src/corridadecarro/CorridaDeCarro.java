package corridadecarro;

public class CorridaDeCarro {

    public static void main(String[] args) {
    Piloto p[] = new Piloto[6];
    p[0] = new Piloto("Hugo", "Russia", "Honda", "Formula1", 30, 35 );
    p[1] = new Piloto("Lucas","Irlanda","Suzuki","Vstron", 20, 26);
    
    Corrida c = new Corrida();
    c.marcarCorrida(p[0], p[1]);
    c.corrida();
    
    
    
    }
    
}
