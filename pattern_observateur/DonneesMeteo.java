import java.util.ArrayList;

public class DonneesMeteo implements Sujet {

    private ArrayList<Observateur> observateurs;
    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo() {
        this.observateurs = new ArrayList<Observateur>();
    }

    public void enregisterObservateur(Observateur o) {
        this.observateurs.add(o);
    }

    public void supprimerObservateur(Observateur o) {
        int i = this.observateurs.indexOf(o);
        if (i >= 0) {
            this.observateurs.remove(o);
        }
    }

    public void notifierObservateurs() {
        for (int i = 0; i < this.observateurs.size(); i++) {
            Observateur observateur = (Observateur)this.observateurs.get(i);
            observateur.actualiser(this.temperature, this.humidite, this.pression);
        }
    }
    
    public void actualiserMesures() {
        this.notifierObservateurs();
    }

    public void setMesures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;

        this.actualiserMesures();
    }
}