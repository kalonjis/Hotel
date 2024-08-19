import java.util.ArrayList;
import java.util.List;

public class Hotel {
    // region Champs
    private List <Chambre> listeChambres;
    private List <Reservation> listeReservations;
    // endregion

    // region Constructeurs
    public Hotel() {
        listeChambres = new ArrayList<>();
        listeReservations = new ArrayList<>();
    }

    public Hotel(List<Chambre> listeChambres) {
        this.listeChambres = listeChambres;
    }

    public Hotel(List<Chambre> listeChambres, List<Reservation> listeReservations) {
        this.listeChambres = listeChambres;
        this.listeReservations = listeReservations;
    }
    //endregion

    // region Encapsulation

    public List<Chambre> getListeChambres() {
        return listeChambres;
    }

    public void setListeChambres(List<Chambre> listeChambres) {
        this.listeChambres = listeChambres;
    }

    public List<Reservation> getListeReservations() {
        return listeReservations;
    }

    public void setListeReservations(List<Reservation> listeReservations) {
        this.listeReservations = listeReservations;
    }
    // endregion
}
