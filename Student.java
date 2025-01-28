public class Student{
   
        
        int id;
        String name;


    }
    class TestStudent{
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.id = 1;
            s1.name = "John";
            Student s2 = new Student();
            s2.id = 2;
            s2.name = "Ram";
            System.out.println("Student" + s1.id +  "details:"+":"+ s1.name);
            System.out.println("Student" + s2.id + "details:"+":"+ s2.name);

    }
}