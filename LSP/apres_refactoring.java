public interface FormeGeometrique {
    int getAire();
}

public class Rectangle implements FormeGeometrique {
    public int getAire() { return largeur * hauteur; }
}

public class Carre implements FormeGeometrique {
    public int getAire() { return cote * cote; }
}