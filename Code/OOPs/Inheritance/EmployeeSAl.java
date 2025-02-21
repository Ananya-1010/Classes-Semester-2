/*Design a class Employee with fields name, age, and salary. Create a subclass
Manager that extends Employee and adds an additional field department. Implement
a constructor in both classes and demonstrate constructor chaining by initializing the
values using super() in the Manager class.
 */

 // super.ab is used to call varibles of the parent inside the child
 // super() used to initialize the constructor 

 class Employee {
    String name;
    int age;
    int salary;
    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}
class Manager extends Employee{
    String department;
    public Manager(String name, int age, int salary, String department){
        super(name, age, salary);
        this.department = department;
    }
}

public class EmployeeSAl {
    public static void main(String[] args) {
        Manager manager = new Manager("Grey Matter", 18, 50000, "PH");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
    }
}