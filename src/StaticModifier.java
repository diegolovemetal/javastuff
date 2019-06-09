public class StaticModifier {
    private static int numInstance = 0;

    protected static int getNumInstance() {
        return numInstance;
    }

    private static void addInstance() {
        numInstance++;
    }

    StaticModifier() {
        StaticModifier.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Starting with " + StaticModifier.getNumInstance() + " instance");
        for (int i = 0; i<500; ++i) {
            new StaticModifier();
        }

        System.out.println("Created " + StaticModifier.getNumInstance() + " instances");
    }



}
