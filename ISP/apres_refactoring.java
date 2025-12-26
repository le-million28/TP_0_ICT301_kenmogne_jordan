public interface Imprimante { void imprimer(); }
public interface Scanner { void scanner(); }

public class ImprimanteSimple implements Imprimante {
    public void imprimer() { /* OK */ }
}

public class Photocopieuse implements Imprimante, Scanner {
    public void imprimer() { /* OK */ }
    public void scanner() { /* OK */ }
}