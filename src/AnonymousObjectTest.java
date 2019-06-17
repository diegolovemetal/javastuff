public class AnonymousObjectTest {
    void fact(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }

    public static void main(String[] args) {
        // calling method with anonymous object
        new AnonymousObjectTest().fact(5);
    }
}
