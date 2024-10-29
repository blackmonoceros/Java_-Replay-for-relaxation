class Produkt {
    private String nazwa;
    private double cena;
    private int liczbaSztuk;

    public Produkt(String nazwa, double cena, int liczbaSztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.liczbaSztuk = liczbaSztuk;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }
}