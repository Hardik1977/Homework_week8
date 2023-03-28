package programme25_constructoroverloading;
//Java program to overload constructors

public class Student5 {
    int id;
    String name;
    int age;

    Student5(int i, String n) {     //constructor with change in params

        id = i;
        name = n;

    }

    //creating three arg constructor
    Student5(int i, String n, int a) {  //constructor with change in params
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }  //Method defining

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan");
        Student5 s2 = new Student5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}



