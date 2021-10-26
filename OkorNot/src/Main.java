public class Main {

    public static void main(String[] args) {
	int a = 10;
    int b = 19;
    int c = 10;
    if (a == b) {
        System.out.println("OK");
    }
        if (a == c) {
            System.out.println("OK");
        }
        if (c == b) {
            System.out.println("OK");
        }
        else{
            System.out.println("Not OK");
        }
    }
}
