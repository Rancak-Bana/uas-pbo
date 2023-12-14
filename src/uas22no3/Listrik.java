package uas22no3;

class Listrik implements Kendaraan {
    double v;
    double f;

    Listrik(double v, double f) {
        this.v = v;
        this.f = f;
    }

    public double HargaKendaraan() {
        double k1 = 2000000;
        double k2 = 20000000;
        double k3 = 10000000;
        return k1*v + k2 + k3*f;
    }
}