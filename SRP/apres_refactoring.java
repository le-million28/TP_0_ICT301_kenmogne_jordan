public class Employe { // Gère uniquement les données de l'employé
    private String nom;
    private double salaire;
}

public class EmployeRepository { // Gère la persistance
    public void sauvegarder(Employe e) { /* ... */ }
}

public class EmployeRapporteur { // Gère le reporting
    public void genererRapport(Employe e) { /* ... */ }
}