public class StaticVariable {
    private static double salary;

    public static final String DEPARTMENT = "研发部";

    public static void main(String[] args) {
        salary = 8888;
        System.out.println(DEPARTMENT + "平均工资" + salary);
    }
}
