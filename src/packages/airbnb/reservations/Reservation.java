package packages.airbnb.reservations;

import packages.airbnb.utilisateurs.Personne;
import packages.airbnb.utilisateurs.Voyageur;

import java.util.Date;

public class Reservation {
    private Sejour sejour;
    private Voyageur client;
    private boolean estValide;
    private Date dateDeReservation;

    public Reservation(Sejour sejour, Voyageur voyageur){
        this.sejour = sejour;
        this.client = voyageur;
        this.dateDeReservation = new Date();
        this.estValide = true;
    }
    public String toString(){
        return client.toString() + " a fait une réservation chez "
                + sejour.toString();
    }
    public void afficher(){
        System.out.println(toString());
    }

}
