// composant
public abstract class Boisson {
    String description = "Boisson inconnue";

    public String getDescription() {
        return this.description;
    }

    public abstract double cout();
}