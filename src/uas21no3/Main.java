package uas21no3;

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok(4, 5, 8);
        System.out.println(balok.Volume());

        Bola bola = new Bola(10);
        System.out.println(bola.Luas_Permukaan());
    }
}