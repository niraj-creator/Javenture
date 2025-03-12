public class Lava {
    public void subtract(int x, int y) {
        int z = x - y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Lava a = new Lava(); // Correct instantiation of the Lava class
        a.subtract(5, 6);    // Correct method call with proper arguments
    }
}

