public class ThisTest {
    //实例变量
    int num = 10;
    ThisTest() {
        System.out.println("this is an example program on keyword this");
    }

    ThisTest(int num) {
        //调用默认构造方法
        this();

        this.num = num;
    }

    public void greet() {
        System.out.println("Hi, my friend");
    }

    public void print() {
        //local variable
        int num = 20;
        System.out.println("value of local variable is :" + num);
        System.out.println("Value of instance variable is " + this.num);

        this.greet();
    }

    public static void main(String[] args) {
        ThisTest obj1 = new ThisTest();
        obj1.print();
    //通过参数化构造函数将新值传递给 num 变量
        ThisTest obj2 = new ThisTest(30);
        obj2.print();
    }
}
