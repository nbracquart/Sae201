public class Chambre {
    private String numeroChambre;
    private String categorie;
    private String etat;

    public Chambre(String numeroChambre, String categorie, String etat) {
        this.numeroChambre = numeroChambre;
        this.categorie = categorie;
        this.etat = etat;
    }

    // Getters and Setters

    public String getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
