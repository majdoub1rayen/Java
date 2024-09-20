import java.util.Scanner;
public class TuniProd {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Produit produitVide = new Produit();
            produitVide.Afficher();

            Produit produit1 = new Produit(1021, "Lait", "Delice", 0);
            Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0);
            Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.20);

            produit1.Afficher();
            produit2.Afficher();
            produit3.Afficher();
        }


}
