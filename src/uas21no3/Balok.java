package uas21no3;

class Balok extends bangun_ruang {
    double panjang;
    double lebar;
    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double Volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double Luas_Permukaan() {
        return 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);
    }

    @Override
    public double Diagonal() {
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2) + Math.pow(tinggi, 2));
    }

    @Override
    public double Diameter() {
        return 0;
    }
}