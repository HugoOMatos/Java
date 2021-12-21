package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Repetil r = new Repetil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro dog = new Cachorro();
        
       
        m.locomover();
        c.locomover();
        dog.locomover();
        c.emitirSom();
        dog.abanarRabo();
        dog.enterrarOsso();
    }
    
}
