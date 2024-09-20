// Code de test pour commander des boissons
public class StarBuzzCoffee {
    public static void main(String[] args) {
        // Boisson Espresso sans ingrédients
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription() + " €" + boisson.cout());

        // Boisson Colombia, double chocolat avec chatilly
        Boisson boisson2 = new Colombia();
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chatilly(boisson2);
        System.out.println(boisson2.getDescription() + " €" + boisson2.cout());
    }
}