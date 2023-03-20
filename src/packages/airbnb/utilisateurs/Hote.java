package packages.airbnb.utilisateurs;

public class Hote extends Personne {

    private int delaiDeReponse;
    public Hote(String nomP, String prenomP, int ageP, int delaiDeReponseV) {
        super(nomP, prenomP, ageP);

        delaiDeReponse = delaiDeReponseV;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
