package presentationWork;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
//        try {
//            if (age > 0)
                this.age = age;
//            else
//                throw new MyException();
//        } catch (MyException e) {
//            System.out.println("Age should not be a negative number");
//        }
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
