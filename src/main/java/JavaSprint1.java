public class JavaSprint1 {

    public Object animals;
    public int calculateFuel;
    public String checkEnding;
    public int points;

    public static void main(String[] args) {
        System.out.println(animals(5, 2, 8));
        System.out.println(calculateFuel(3));
        System.out.println(checkEnding("abs", "s"));
        System.out.println(points(13,12));

    }

    public static int animals(int chic, int cows, int pigs) {
        return chic * 2 + cows * 4 + pigs * 4;
    }

    public static int calculateFuel(double a) {
        if (a > 10) {
            return (int) (a * 10);
        }
        return 100;
    }

    public static boolean checkEnding(String a, String b) {
        if (a.length() < 2 || b.length() < 2) {
            return false;
        }
        if (a.substring(a.length() - 2).equals(b.substring(b.length() - 2))) {
            return true;
        }
        return false;
    }

    public static int points(int a, int b) {
        return a * 2 + b * 3;
    }

}




