package org.example;

import java.sql.*;
public class MaitinimoIstaigaDAO {
    public static void create(MaitinimoIstaiga maitinimoistaiga) {
        String querry = "INSERT INTO maitinimoistaiga (, address, city) VALUES (?, ?, ?);";
        String url = "jdbc:mysql://localhost:3306/maitinimo_istaiga";
        try {
            Connection connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(querry);
            preparedStatement.setString(1, maitinimoistaiga.getPavadinimas());
            preparedStatement.setString(2, maitinimoistaiga.getAdresas());
            preparedStatement.executeUpdate();
            System.out.println("Pavyko sukurti naują įrašą!");
        } catch (SQLException a) {
            System.out.println("Nepavyko sukurti naujo įrašo!" + " Plačiau: " + a.getMessage());
        }
    }
    public static void update(MaitinimoIstaiga maitinimoistaiga) {
        String querry = "UPDATE Maitinimo_Istaiga set pavadinimas = ?, adresas = ?) VALUES (?, ?);";
        String url = "jdbc:mysql://localhost:3306/maitinimo_istaiga";
        try {
            Connection connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(querry);
            preparedStatement.setString(1, maitinimoistaiga.getPavadinimas());
            preparedStatement.setString(2, maitinimoistaiga.getAdresas());
            preparedStatement.executeUpdate();
            System.out.println("Pavyko sukurti naują įrašą!");
        } catch (SQLException e) {
            System.out.println("Duomenų atnaujinti nepavyko, nes: " + e.getMessage());
        }
    }
    public static void delete(int valgiarastis) {
        String querry = "DELETE FROM Maitinimo_Istaiga WHERE biz_id = ?;";
        String url = "jdbc:mysql://localhost:3306/maitinimo_istaiga";
        try {
            Connection connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(querry);
            preparedStatement.setInt(1, valgiarastis);
            preparedStatement.executeUpdate();
            System.out.println("Įrašas ištrintas sėkmingai.");
        } catch (Exception e) {
            System.out.println("Duomenų ištrinti nepavyko, nes: " + e.getMessage());
        }
    }
    }
