package packages.airbnb.utilisateurs;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nomP, String prenomP, int ageP){
        this.nom = nomP;
        this.prenom = prenomP;
        this.age = ageP;
    }

    @Override
    public String toString() {
        return (this.prenom + " " + this.nom + "(" + this.age + " ans)");
    }
}



