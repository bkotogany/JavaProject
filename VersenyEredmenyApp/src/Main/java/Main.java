package Main.java;
import java.sql.SQLException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        VersenyManager manager = new VersenyManager();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) 
            {
                System.out.println("\n--- Verseny Eredményhirdető ---");
                System.out.println("1. Versenyző hozzáadása");
                System.out.println("2. Verseny hozzáadása");
                System.out.println("3. Eredmény rögzítése");
                System.out.println("4. Eredmények listázása");
                System.out.println("0. Kilépés");
                System.out.print("Választás: ");

                String valasztas = scanner.nextLine();
                try 
                {
                    switch (valasztas) 
                    {
                        case "1": manager.ujVersenyzo(); break;
                        case "2": manager.ujVerseny(); break;
                        case "3": manager.eredmenyFelvitel(); break;
                        case "4": manager.eredmenyekListazasa(); break;
                        case "0": System.exit(0); break;
                        default: System.out.println("Érvénytelen választás!");
                    }
                } catch (SQLException e) 
                {
                    System.out.println("Hiba: " + e.getMessage());
                }
            }
        }
    }
}
