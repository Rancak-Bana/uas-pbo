interface HewanA {
    void bunyiA();
}

interface HewanB {
    void bunyiB();
}

class Burung implements HewanA, HewanB {
    public void bunyiA() {
        System.out.println("cukurukuk");
    }

    public void bunyiB() {
        System.out.println("kugeruk");
    }
}