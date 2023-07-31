public class Main
{

    public static void main(String[] args)
    {
        Employee E1 = new Employee();

        E1.setname("Maleesha");
        E1.setage(24);
        E1.setsalary(50000.00f);

        System.out.println("Employee name:"+E1.getname());
        System.out.println("Age:"+E1.getage());
        System.out.println("Salary:"+E1.getsalary());

        System.out.println();

        Constructor E2 = new Constructor("Prasad",23,60000.00f);

        System.out.println("Employee name:"+E2.getname());
        System.out.println("Age:"+E2.getage());
        System.out.println("Salary:"+E2.getsalary());
    }
}