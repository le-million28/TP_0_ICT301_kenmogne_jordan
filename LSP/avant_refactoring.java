public class Rectangle {
    public void setLargeur(int l) { this.largeur = l; }
    public void setHauteur(int h) { this.hauteur = h; }
}
public class Carre extends Rectangle {
    @Override
    public void setLargeur(int l) { super.setLargeur(l); super.setHauteur(l); } 