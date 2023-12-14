package uas22no1;

public class BBIdeal {
    public static double hitungBeratIdeal(double tinggi) {
        return 0.9 * (tinggi - 100);
    }

    public double hitungKalori(int usia, double berat) {
        return 0.8 * berat + 0.2 * usia;
    }
}