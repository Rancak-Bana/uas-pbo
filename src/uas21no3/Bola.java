package uas21no3;

class Bola extends bangun_ruang {
    double radius;

    public Bola(double radius) {
        this.radius = radius;
    }

    @Override
    public double Volume() {
        return 4/3 * phi * Math.pow(radius, 3);
    }

    @Override
    public double Luas_Permukaan() {
        return 4 * phi * Math.pow(radius, 2);
    }

    @Override
    public double Diagonal() {
        return 0;
    }

    @Override
    public double Diameter() {
        return 2 * radius;
    }
}