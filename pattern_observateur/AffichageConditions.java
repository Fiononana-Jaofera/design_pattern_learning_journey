public class AffichageConditions implements Observateur, Affichage {

    private float temperature;
    private float humidite;
    private Sujet donneesMeteo;

    public AffichageConditions(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        this.donneesMeteo.enregisterObservateur(this);
    }

    public void actualiser(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.afficher();
    }

    public void afficher() {
        System.out.println("Conditions actuelles : " + this.temperature + " degrés C et " + this.humidite + " % d'humidité.");
    }    
    
}
