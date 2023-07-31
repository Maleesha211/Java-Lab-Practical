public class Main {
    public static void main(String[] args)
    {
        Student stu = new Student();
        stu.setname("Prasad Nagoda");
        stu.setId(28507);
        stu.setcourse("Software Engineering");

        Lecture lec = new Lecture();
        lec.setname("Mr. Pramod Silva");
        lec.setId(1056);
        lec.setprogramme("Software Engineering");

        System.out.println("Student Details:");
        System.out.println("Name: " + stu.getname());
        System.out.println("ID: " + stu.getId());
        System.out.println("Course: " + stu.getcourse());
        System.out.println();

        System.out.println("Lecturer Details:");
        System.out.println("Name: " + lec.getname());
        System.out.println("ID: " + lec.getId());
        System.out.println("Programme: " + lec.getprogramme());
    }
}
