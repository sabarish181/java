class Student {
    int id;
    String name;
    Student(int i,String n) {
        id=i;
        name=n;
    }
    void display() {
        System.out.println(id+" "+ name);
    }
}
public class q1{
    public static void main(String[] args) {
        Student[]s= new Student[3];
        s[0] = new Student(1,"A");
        s[1] = new Student(2,"B");
        s[2] = new Student(3,"C");
        for (int i=0;i<s.length;i++){
            s[i].display();
        }
    }
}
