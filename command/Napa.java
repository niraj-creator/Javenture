public class Napa {
    public void subtract(int x, int y) {
        int z = x - y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Napa a = new Napa();
        a.subtract(5, 6);  
    }
}

