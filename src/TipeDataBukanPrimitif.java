public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        /*
        Tipe Data Primitif adalah tipe bawaan bahasa pemrogaman.
        Tipe data primitif tidak bisa diubah lagi.
        Tipe data number, char, boolean adalah tipe data primtif.
        Tipe data primitif selalu memiliki value.
        Tipe data String bukan tipe data primitif, karena bernilai null.
        Tipe data bukan primitif bisa memiliki method/function.
        Tipe data bukan primitif => Object.
         */

        // Contoh:
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Byte iniByte = null;

        // Konversi Tipe Data yang sama:
        int age = 18;
        Integer ageObject = age;
        int ageAgain = ageObject;

        // Konversi Beda Tipe Data:
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

        /*
        Tipe Data Primitif => Tipe Data Bukan Primitif
        byte => Byte
        short => Short
        int => Integer
        long => Long
        float => Float
        double => Double
        char => Character
        boolean => Boolean
         */

    }
}
