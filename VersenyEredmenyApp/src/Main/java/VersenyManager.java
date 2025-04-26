package Main.java;
import java.sql.*;
import java.util.Scanner;

public class VersenyManager 
{
    private final Scanner scanner = new Scanner(System.in);

    public void ujVersenyzo() throws SQLException 
    {
        System.out.print("Név: ");
        String nev = scanner.nextLine();
        System.out.print("Ország: ");
        String orszag = scanner.nextLine();

        String sql = "INSERT INTO versenyzok (nev, orszag) VALUES (?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, nev);
            stmt.setString(2, orszag);
            stmt.executeUpdate();
            System.out.println("Versenyző hozzáadva!");
        }
    }

    public void ujVerseny() throws SQLException 
    {
        System.out.print("Verseny neve: ");
        String nev = scanner.nextLine();
        System.out.print("Dátum (YYYY-MM-DD): ");
        String datum = scanner.nextLine();

        String sql = "INSERT INTO versenyek (nev, datum) VALUES (?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, nev);
            stmt.setString(2, datum);
            stmt.executeUpdate();
            System.out.println("Verseny hozzáadva!");
        }
    }

    public void eredmenyFelvitel() throws SQLException 
    {
        System.out.print("Versenyző ID: ");
        int vid = Integer.parseInt(scanner.nextLine());
        System.out.print("Verseny ID: ");
        int versenyId = Integer.parseInt(scanner.nextLine());
        System.out.print("Pontszám: ");
        int pontszam = Integer.parseInt(scanner.nextLine());
        System.out.print("Helyezés: ");
        int helyezes = Integer.parseInt(scanner.nextLine());

        String sql = "INSERT INTO eredmenyek (versenyzo_id, verseny_id, pontszam, helyezes) VALUES (?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setInt(1, vid);
            stmt.setInt(2, versenyId);
            stmt.setInt(3, pontszam);
            stmt.setInt(4, helyezes);
            stmt.executeUpdate();
            System.out.println("Eredmény rögzítve!");
        }
    }

    public void eredmenyekListazasa() throws SQLException 
    {
        String sql = "SELECT v.nev AS versenyzo, ve.nev AS verseny, e.pontszam, e.helyezes FROM eredmenyek e " +
                "JOIN versenyzok v ON e.versenyzo_id = v.id " +
                "JOIN versenyek ve ON e.verseny_id = ve.id " +
                "ORDER BY e.helyezes ASC";

        try (Connection conn = Database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) 
        {
            System.out.println("\n--- Eredmények ---");
            while (rs.next()) 
            {
                System.out.printf("%s - %s | %d pont | %d. hely\n",
                        rs.getString("versenyzo"),
                        rs.getString("verseny"),
                        rs.getInt("pontszam"),
                        rs.getInt("helyezes"));
            }
        }
    }
}
