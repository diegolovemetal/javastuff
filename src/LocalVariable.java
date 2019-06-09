public class LocalVariable {
    public void dogAge() {
        int age = 0;    //局部变量
//        int age;
//        age += 5;
        System.out.println("Dog age is :" + age);
    }

    public static void main(String[] args) {
        LocalVariable v = new LocalVariable();
        v.dogAge();
    }
}

