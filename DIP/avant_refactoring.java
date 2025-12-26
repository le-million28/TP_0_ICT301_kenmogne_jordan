public class Ampoule {
    public void allumer() { /* ... */ }
}

public class Interrupteur {
    private Ampoule ampoule = new Ampoule(); 
    public void actionner() { ampoule.allumer(); }
}