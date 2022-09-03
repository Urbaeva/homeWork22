package presentationWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Burulai", 20);
        Student student2 = new Student("Kulen", -19);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                System.out.println("Name: " + arrayList.get(i).getName());
                if (arrayList.get(i).getAge() > 0)
                    System.out.println("Age: " + arrayList.get(i).getAge());
                else
                    throw new MyException("Age should not be a negative number");
            } catch (MyException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
