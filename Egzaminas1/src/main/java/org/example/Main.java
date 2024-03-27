package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Iveskite valgyklos pavadinima");
        String pavadinimas = s.nextLine();
        System.out.println("Iveskite koda: ");
        int kodas = Integer.parseInt(s.nextLine());
        System.out.println("Iveskite adresa: ");
        String adresas = s.nextLine();

        MaitinimoIstaiga valgykla = new MaitinimoIstaiga(pavadinimas, kodas, adresas);

        MaitinimoIstaigaDAO.create(valgykla);

        System.out.println("Iveskite nauja new pavadinima: ");
        String naujaValgykla = s.nextLine();
        MenuDAO.update(naujaValgykla);

        System.out.println("Iveskite valgyklos pavadinima");
        String valgykla2 = s.nextLine();
        KlientasDAO.search(naujaValgykla);

    }
}
