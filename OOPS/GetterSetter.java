package OOPS;

class Student{
    private int age;
    // private String name = "mohit";

    int getage(){
        return age;
    }

    void setage(int age){
        this.age = age; 
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Student s = new Student();
        s.setage(20);
        System.out.print(s.getage());
    }
    
}