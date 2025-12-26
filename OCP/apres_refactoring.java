public interface Forme {
    double calculerAire();
}

public class Rectangle implements Forme {
    public double calculerAire() { return largeur * hauteur; }
}

public class Cercle implements Forme {
    public double calculerAire() { return Math.PI * rayon * rayon; }
}

public class CalculateurAire {
    public double calculer(Forme forme) {
        return forme.calculerAire(); 
    }
}