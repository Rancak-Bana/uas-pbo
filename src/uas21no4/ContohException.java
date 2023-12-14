package uas21no4;

public class ContohException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]); // akses index yang tidak ada
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}