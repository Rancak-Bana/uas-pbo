package uas22no2;

public class Outer {

    class Inner1 {

        class Inner2 {

            public static int Tambah(int a, int b) {
                return a + b;
            }

        }

    }

    public static void main(String[] args) {
        int hasil = Outer.Inner1.Inner2.Tambah(5, 3);
        System.out.println(hasil);
    }

}