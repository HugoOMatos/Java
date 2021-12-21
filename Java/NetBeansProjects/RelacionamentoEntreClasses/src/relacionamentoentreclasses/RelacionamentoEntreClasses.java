package relacionamentoentreclasses;
public class RelacionamentoEntreClasses {

    public static void main(String[] args) {
            Lutador l[] = new Lutador[6];
            l[0] = new Lutador("James", "Holandes", 25, 1.89f, 90f, 43, 6,8  );
            l[1] = new Lutador("Tomas", "Afegao", 27, 1.87f, 99f, 22, 1, 0);
            l[2] = new Lutador("Maik", "Canadense", 38, 176f, 90f,15, 0, 0);
            l[3] = new Lutador("Tchuco", "Brasileiro", 23, 1.60f, 58f, 13,2,2);
                    
           Luta lu = new Luta();
           lu.marcarLuta(l[1], l[2]);
           lu.lutar();
           l[1].status();
           
                  
           
           
            
           
    }
    
}
