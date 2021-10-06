public class Test 
{
    String name;
    int age;
    String designation;
    double salary;


    public void setDesignation(String designation)
    {
        this.designation = designation;
    }
    public String getDesignation()
    {
        return designation;
    }

    public double getsalary()
    {
        return salary;
    }

    public void setsalary(double salary)
    {
        this.salary = salary;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }



    public static void main(String[] args)
    {
        Test N = new Test();
        Test N1 = new Test();


        N.setname("Loic");
        N1.setname("Kobe");

        N.setAge(20);
        N1.setAge(30);

        N.setsalary(5000000);
        N1.setsalary(2000000);

        N1.setDesignation("boss");
        N.setDesignation("Bum");

        System.out.println("My name is: " + N.getname() + ", I am : " + N.getAge() + " my job is to be a : " + N.getDesignation() + " and my salary is: " + N.getsalary());

        System.out.println("My name is: " + N1.getname() + ", I am : " + N1.getAge() + " my job is to be a : " + N1.getDesignation() + " and my salary is: " + N1.getsalary());

    }
    
}
