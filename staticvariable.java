class Student{
    int sid;
    String sname;
    static String clg_name="sri indu";
    void display(){
        System.out.println("details of the student are as follows"+sid+" "+sname+" "+Student.clg_name);
    }
public static void main(String[] args) {
    Student one=new Student();
    one.sid=155;
    one.sname="Sreeja Yemreddy";
    one.display();
    Student two=new Student();
    two.sid=156;
    two.sname="Sindhu";
    two.display();
} 
}