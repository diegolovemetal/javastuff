public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("diego");
        Employee empTwo = new Employee("Sasa");

        empOne.setAge(21);
        empOne.setJobPosition("java developer");
        empOne.setSalary(10000);
        empOne.printStaff();

        empTwo.setAge(20);
        empTwo.setJobPosition("designer");
        empTwo.setSalary(7000);
        empTwo.printStaff();
    }
}
