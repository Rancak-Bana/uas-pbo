package uas21no3;

abstract class bangun_ruang {
    final double phi = 3.14;
    double panjang, lebar, tinggi, radius;

    public abstract double Volume();
    public abstract double Luas_Permukaan();
    public abstract double Diagonal();
    public abstract double Diameter();
}