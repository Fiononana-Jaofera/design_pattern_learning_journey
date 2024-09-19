public class MiniSimulateur {
    public static void main(String[] args) {

        Canard proto = new PrototypeCanard();
        proto.afficher();
        proto.effectuerVol();
        proto.effectuerCancan();

        System.out.println("Changement du comportement de vol...");
        proto.setComportementVol(new PropulsionAReaction());
        proto.effectuerVol();
    }
}