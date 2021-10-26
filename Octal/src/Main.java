public class Main {

    public static void main(String[] args) {
        int a;
        String Binary;
        for (int i = 99999; i >= -99999; i--) {
            a = i;
            Binary = Binary.toOctalString(a);
            System.out.println(Binary);
        }
    }
}
