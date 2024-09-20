// Décorateur concret
public class Chocolat extends DecorateurIngredient {
    Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return this.boisson.getDescription() + ", chocolat";
    }

    public double cout() {
        return 0.20 + this.boisson.cout();
    }
}