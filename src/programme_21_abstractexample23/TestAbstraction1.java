package programme_21_abstractexample23;

class TestAbstraction1 {
    ////In real scenario, method is called by programmer or user

    public static void main(String[] args) {
        Shape s = new Circle1();  // In a real scenario, object is provided through  method, e.g., getShape() method
        s.draw();
    }
}
