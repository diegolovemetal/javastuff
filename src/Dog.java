public class Dog {
    int dogAge;

    public Dog(String name) {
        System.out.println("Dog's name is set:" + name);
    }

    public void setAge(int age){
        dogAge = age;
    }

    public int getDogAge() {
        System.out.println("Dog's age is:" + dogAge);
        return dogAge;
    }

    public static void main(String[] args) {
        //创建对象
        Dog mydog = new Dog("DD");
        //调用对象方法
        mydog.setAge(3);

        mydog.getDogAge();

        System.out.println("Another method get its age: " + mydog.dogAge );

    }
}

