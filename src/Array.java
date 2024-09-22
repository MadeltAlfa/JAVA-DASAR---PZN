public class Array {

    public static void main(String[] args) {

        // Inisialisasi Array
        String[] arrayString;
        arrayString = new String[3];

        // Mengambil data Array
        arrayString[0] = "Nanda";
        arrayString[1] = "Bagus";
        arrayString[2] = "Ramadhani";

        // Print
        System.out.print(arrayString[0]);
        System.out.print(arrayString[1]);
        System.out.print(arrayString[2]);

        String[] fullName = {
          "Nanda", "Bagus", "Ramadhani"
        };

        int[] arrayInt = new int[]{
                10, 90, 80, 67, 29
        };

        int[] arrayInt2 = {
                10, 80, 88, 67
        };

        // Menghapus
        arrayInt2[0] = 0;

        // Panjang Array
        System.out.println(arrayInt2.length);

    }

}
