public class Employee
{
    private int empID;
    private String  empName;
    private String empDesignation;

    public void setempid(int empID)
    {
        this.empID = empID;
    }

    public void setname(String empName)
    {
        this.empName = empName;
    }

    public void setdesignation(String empDesignation)
    {
        this.empDesignation = empDesignation;
    }

    public int getempid()
    {
        return empID;
    }

    public String getname()
    {
        return empName;
    }

    public String getdesignation()
    {
        return empDesignation;
    }
}

