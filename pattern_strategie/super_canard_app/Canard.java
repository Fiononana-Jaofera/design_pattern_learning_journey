public abstract class Canard {
    ComportementCancan comportementCancan;
    ComportementVol comportementVol;

    public abstract void afficher();

    public void nager() {
        System.out.println("Tous les canards flottent, même les leurres!");
    }

    // Effectuer les comportement du Canard
    public void effectuerCancan() {
        comportementCancan.cancaner();
    }

    public void effectuerVol() {
        comportementVol.voler();
    }

    // Pour Modifier le comportement dynamiquement
    public void setComportementVol(ComportementVol cv) {
        comportementVol = cv;
    }

    public void setComportementCancan(ComportementCancan cc) {
        comportementCancan = cc;
    }
}