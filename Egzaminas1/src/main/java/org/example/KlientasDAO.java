package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KlientasDAO {
    public static ArrayList<MaitinimoIstaiga> search(String username) {
        List<MaitinimoIstaiga> naujaValgykla = new ArrayList<>();
        String querry = "SELECT * FROM users WHERE  username = ?;";
        String url = "jdbc:mysql://localhost:3306/db";
        ArrayList<MaitinimoIstaiga> logins = new ArrayList<>();
        String pavadinimas = null;
        try {
            Connection connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(querry);
            preparedStatement.setString(1, username);
            try {
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    naujaValgykla.add(new MaitinimoIstaiga(
                            resultSet.getString("pavadinimas"),
                            resultSet.getInt("kodas"),
                            resultSet.getString("adresas")));
                }
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Vykdoma pajieska pagal pavadinima" + pavadinimas);
            }
        } catch (SQLException e) {
            System.out.println("Ivyko klaida vykdanta paieska pagal ID" + pavadinimas);
            e.printStackTrace();
            KlientasDAO.search(naujaValgykla.toString());
        }
        return naujaValgykla(0);
    }

    private static ArrayList<MaitinimoIstaiga> naujaValgykla(int i) {
        return null;
    }
}
