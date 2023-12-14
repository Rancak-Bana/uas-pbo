package uas22no1;

public class Main {

    public static void main(String[] args) {

        double beratIdeal = BBIdeal.hitungBeratIdeal(170);
        System.out.println(beratIdeal);

        BBIdeal body = new BBIdeal();
        double kalori = body.hitungKalori(30, 65);
        System.out.println(kalori);

    }

}