package org.example;

public class MaitinimoIstaiga implements IMaitninmoIstaiga{
    private String pavadinimas;
    private int kodas;
    private String adresas;
    private String pateikimas;
    private String uzsakymas;

    public MaitinimoIstaiga(String pavadinimas, int kodas, String adresas){
        this.pavadinimas = pavadinimas;
        this.kodas = kodas;
        this.adresas = adresas;
    }

    @Override
    public String getPavadinimas() {
        return null;
    }

    public int getKodas() {
        return kodas;
    }

    public String getAdresas() {
        return adresas;
    }

    @Override
    public String setPateikimas() {
        return null;
    }

    @Override
    public String getUzsakymas() {
        return null;
    }

    @Override
    public void getPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public void getKodas(int kodas) {
        this.kodas = kodas;
    }

    @Override
    public void getAdresas(String adresas) {
        this.adresas = adresas;
    }

    @Override
    public void setPeteikimas(String pateikimas) {
        this.pateikimas = pateikimas;
    }

    @Override
    public void getUzsakymas(String uzsakymas) {
        this.uzsakymas = uzsakymas;
    }

    @Override
    public String toString() {
        return "MaitinimoIstaiga{" +
                "pavadinimas=" + pavadinimas + '\'' +
                ", Kodas='" + kodas +
                ", Adresas='" + adresas + '\'' +
                ", Pateikimas='" + pateikimas + '\'' +
                "Uzsakymas" + uzsakymas + '\'' +
                '}';


    }
}
