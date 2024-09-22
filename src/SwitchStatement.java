public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = "A";

        // Switch Case Statement
        switch (nilai){
            case "A":
                System.out.println("Selamat A");
                break;
            case "B", "C":
                System.out.println("Selamat B");
                break;
            case "D":
                System.out.println("Selamat C");
                break;
            default:
                System.out.println("Yahhhh");
        }

        // Lambda Switch
        switch (nilai){
            case "A" -> System.out.println("Selamat A in Lambda Switch");
            case "B" -> System.out.println("Selamat B in Lambda Switch");
            case "C" -> System.out.println("Selamat C in Lambda Switch");
            case "D" -> System.out.println("Selamat D in Lambda Switch");
        }

        // Switch dengan yield
        String ucapan = switch (nilai){
            case "A":
                yield "Selamat A";
            case "B", "C":
                yield "Selamat";
            case "D":
                yield "Selamat D";
            default:
                yield "Hmmmmm";
        };

    }

}
