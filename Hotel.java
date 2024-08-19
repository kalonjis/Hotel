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
}
