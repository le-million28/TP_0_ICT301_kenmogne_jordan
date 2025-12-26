public interface Appareil {
    void allumer();
}

public class Ampoule implements Appareil {
    public void allumer() { /* ... */ }
}

public class Interrupteur {
    private Appareil appareil; 
    public Interrupteur(Appareil a) { this.appareil = a; }
    public void actionner() { appareil.allumer(); }
}