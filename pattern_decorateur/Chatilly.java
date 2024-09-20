// Décorateur concret
public class Chatilly extends DecorateurIngredient {
    Boisson boisson;

    public Chatilly(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return this.boisson.getDescription() + ", Chatilly";
    }

    public double cout() {
        return 0.10 + this.boisson.cout();
    }
}