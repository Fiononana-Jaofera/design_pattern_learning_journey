// Décorateur concret
public class Caramel extends DecorateurIngredient {
    Boisson boisson;

    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return this.boisson.getDescription() + ", Caramel";
    }

    public double cout() {
        return 0.15 + this.boisson.cout();
    }
}