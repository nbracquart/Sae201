public class Reservation {
    private String numeroReservation;
    private String dateDebut;
    private String dateFin;
    private String categorieChambre;
    private String numeroChambre;
    private int nombreOccupants;

    public Reservation(String numeroReservation, String dateDebut, String dateFin, String categorieChambre, String numeroChambre, int nombreOccupants) {
        this.numeroReservation = numeroReservation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.categorieChambre = categorieChambre;
        this.numeroChambre = numeroChambre;
        this.nombreOccupants = nombreOccupants;
    }

    // Getters and Setters

    public String getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(String numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getCategorieChambre() {
        return categorieChambre;
    }

    public void setCategorieChambre(String categorieChambre) {
        this.categorieChambre = categorieChambre;
    }

    public String getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public int getNombreOccupants() {
        return nombreOccupants;
    }

    public void setNombreOccupants(int nombreOccupants) {
        this.nombreOccupants = nombreOccupants;
    }
}
