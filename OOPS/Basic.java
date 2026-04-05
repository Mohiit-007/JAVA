package OOPS;

class Student{
    
    void sleep(){
        System.out.println("Student is sleeping");
    }
    void study(){
        System.out.println("Student is studying");
    }
}

public class Basic {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
    }
}
