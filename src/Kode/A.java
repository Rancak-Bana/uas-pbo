package Kode;

public class A {
    int x = 10;
    class B{
        int x = 20;
        class C{
            int x = 30;
            void cetak(){
                System.out.println("x punya A : " + A.this.x);
                System.out.println("x punya B : " + A.B.this.x);
                System.out.println("x punya C : " + A.B.C.this.x);
            }
        }
    }
}

class main{
    public static void main(String[] args) {
        A.B.C obj = new A().new B().new C();
        obj.cetak();
    }
}
