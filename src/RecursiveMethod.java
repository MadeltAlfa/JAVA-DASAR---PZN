public class RecursiveMethod {

    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
    }

    /**
     *
     * @param value
     * @return
     */

    static int factorialRecursive(int value){
        if (value == 1 || value == 0){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}
