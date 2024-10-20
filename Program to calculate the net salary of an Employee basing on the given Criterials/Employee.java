package Quiz1;

import java.util.Scanner;

public class Employee {
    private int ID;
    private String name;
    private String Lname;
    private int age;
    private double basicSalary;
    private double bonus;
    private double transportAllowance;
    private double houseAllowance;
    double netSalary;


    // Getter Methods

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return Lname;
    }

    public int getAge() {
        return age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    public double getHouseAllowance() {
        return houseAllowance;
    }

    public double getNetSalary() {
        return netSalary;
    }


    // Setter Methods

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 200000 || basicSalary > 210000) {
            System.out.println("Invalid Basic Salary input.");
            System.out.println("The amount must be between 200000 and 210000.");
            System.out.println("System will now terminate. Thank you!");
            System.exit(1);
        }
        this.basicSalary = basicSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setTransportAllowance(double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public void setHouseAllowance(double houseAllowance) {
        this.houseAllowance = houseAllowance;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        System.out.println("PROGRAM TO DISPLAY NET SALARY ACCORDING TO THE GIVEN INFOS");
        System.out.print("Enter Id: ");
        int id = scanner.nextInt();
        employee1.setID(id);

        System.out.print("Enter First Name: ");
        String fname = scanner.nextLine();
        employee1.setName(fname);

        scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lname = scanner.nextLine();
        employee1.setLname(lname);

        System.out.print("Enter Age: ");
        int ag = scanner.nextInt();
        employee1.setAge(ag);

        System.out.print("Enter Basic Salary: ");
        double bSalary = scanner.nextDouble();
        employee1.setBasicSalary(bSalary);

        double bns = bSalary * 5 / 100;
        employee1.setBonus(bns);

        double transpAllow = bSalary * 9 / 100;
        employee1.setTransportAllowance(transpAllow);

        double hsAllow = bSalary * 4 / 100;
        employee1.setHouseAllowance(hsAllow);

        double ntSalary = bSalary + bns + transpAllow + hsAllow;
        employee1.setNetSalary(ntSalary);


        System.out.println("BASIC DETAILS FOR THE FIRST EMPLOYEE\n------------------------------");
        System.out.println("Your names: " + employee1.getName() + "" + employee1.getLname());
        System.out.println("Your Id: " + employee1.getID());
        System.out.println("Your Age: " + employee1.getAge());
        System.out.println("Your Basic Salary: " + employee1.getBasicSalary());
        System.out.println("Your Bonus: " + bns);
        System.out.println("Your Transport Allowance: " + transpAllow);
        System.out.println("Your House Allowance: " + hsAllow);
        System.out.println("Your Net Salary: " + employee1.getNetSalary());
        System.out.println("----------------------------------------------------------------\n\n");

        System.out.print("Enter Id: ");
        int id2 = scanner.nextInt();
        employee2.setID(id2);

        System.out.print("Enter First Name: ");
        String fname2 = scanner.nextLine();
        employee2.setName(fname2);

        scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lname2 = scanner.nextLine();
        employee2.setLname(lname2);

        System.out.print("Enter Age: ");
        int ag2 = scanner.nextInt();
        employee2.setAge(ag2);

        System.out.print("Enter Basic Salary: ");
        double bSalary2 = scanner.nextDouble();
        employee2.setBasicSalary(bSalary2);

        double bns2 = bSalary * 5 / 100;
        employee2.setBonus(bns2);

        double transpAllow2 = bSalary2 * 9 / 100;
        employee2.setTransportAllowance(transpAllow2);

        double hsAllow2 = bSalary2 * 4 / 100;
        employee2.setHouseAllowance(hsAllow2);

        double ntSalary2 = bSalary2 + bns2 + transpAllow2 + hsAllow2;
        employee2.setNetSalary(ntSalary2);


        System.out.println("BASIC DETAILS FOR THE SECOND EMPLOYEE\n------------------------------");
        System.out.println("Your names: " + employee2.getName() + "" + employee2.getLname());
        System.out.println("Your Id: " + employee2.getID());
        System.out.println("Your Age: " + employee2.getAge());
        System.out.println("Your Basic Salary: " + employee2.getBasicSalary());
        System.out.println("Your Bonus: " + bns2);
        System.out.println("Your Transport Allowance: " + transpAllow2);
        System.out.println("Your House Allowance: " + hsAllow2);
        System.out.println("Your Net Salary: " + employee2.getNetSalary());
        System.out.println("----------------------------------------------------------------\n\n");

        System.out.print("Enter Id: ");
        int id3 = scanner.nextInt();
        employee3.setID(id3);

        System.out.print("Enter First Name: ");
        String fname3 = scanner.nextLine();
        employee3.setName(fname3);

        scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lname3 = scanner.nextLine();
        employee3.setLname(lname3);

        System.out.print("Enter Age: ");
        int ag3 = scanner.nextInt();
        employee3.setAge(ag3);

        System.out.print("Enter Basic Salary: ");
        double bSalary3 = scanner.nextDouble();
        employee3.setBasicSalary(bSalary3);

        double bns3 = bSalary3 * 5 / 100;
        employee3.setBonus(bns3);

        double transpAllow3 = bSalary3 * 9 / 100;
        employee3.setTransportAllowance(transpAllow3);

        double hsAllow3 = bSalary3 * 4 / 100;
        employee3.setHouseAllowance(hsAllow3);

        double ntSalary3 = bSalary3 + bns3 + transpAllow3 + hsAllow3;
        employee3.setNetSalary(ntSalary3);


        System.out.println("BASIC DETAILS FOR THE THIRD EMPLOYEE\n------------------------------");
        System.out.println("Your names: " + employee3.getName() + "" + employee3.getLname());
        System.out.println("Your Id: " + employee3.getID());
        System.out.println("Your Age: " + employee3.getAge());
        System.out.println("Your Basic Salary: " + employee3.getBasicSalary());
        System.out.println("Your Bonus: " + bns3);
        System.out.println("Your Transport Allowance: " + transpAllow3);
        System.out.println("Your House Allowance: " + hsAllow3);
        System.out.println("Your Net Salary: " + employee3.getNetSalary());
        System.out.println("----------------------------------------------------------------");

    }
}
