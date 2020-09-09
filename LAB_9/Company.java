import  java.util.*;

public class Company
{
    int MinDepartment = 0;
    int MaxDepartment = 5;
    List<Department> depList = null;
    List<Employee> empList = null;
    Company objCompany = new Company();

    public static void main()
    {
        int MinDepartment = 0;
        int MaxDepartment = 5;
        
        Company objCompany = new Company();
        //objCompany.depList = new ArrayList<>();
        objCompany.empList = new ArrayList<>();
        
        for(MinDepartment=0;MinDepartment<MaxDepartment;MinDepartment++)
        objCompany.depList.add(new Department());
        
        objCompany.depList.get(0).empList.add(new Contract());
        objCompany.depList.get(0).empList.add(new Permanent());
    }
    

    public Company()
    {
        objCompany.depList = new ArrayList<>();
        objCompany.empList = new ArrayList<>();
        objCompany.depList.get(0).empList.add(new Contract());
    }

}
