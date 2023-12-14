package uas22no3;

class Motor implements Kendaraan {
    double v;
    double f;
    double p;

    Motor(double v, double f, double p) {
        this.v = v;
        this.f = f;
        this.p = p;
    }

    public double HargaKendaraan() {
        double k1 = 2000000;
        double k2 = 20000000;
        double k3 = 10000000;
        return (1+p)*(k1*v + k2 + k3*f);
    }
}