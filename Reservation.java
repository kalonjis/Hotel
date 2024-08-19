import java.time.LocalDate;


public class Reservation {
    private String nomClient;
    private Chambre chambre;
    private LocalDate date;

    public Reservation(String nomClient, Chambre chambre, LocalDate date) {
        this.nomClient = nomClient;
        this.chambre = chambre;
        this.date = date;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "nomClient='" + nomClient + '\'' +
                ", chambre=" + chambre +
                ", date=" + date +
                '}';
    }
}
