public class Employee {
    String name;
    int age;
    String jobPosition;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void setAge(int empAge) {
        age = empAge;
    }

    public void setJobPosition(String position) {
        jobPosition = position;
    }

    public void setSalary(double empsalary) {
        salary = empsalary;
    }

    public void printStaff() {
        System.out.println("==================");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("JobPosition" + jobPosition);
        System.out.println("Salary" + salary);
    }

}
