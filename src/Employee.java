public class Employee {
    int age;
    double salary;
    String name;
    String location;

//    constructor
    Employee(int age, double salary, String name, String location){
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.location = location;
    }

//    methods
    void raiseSalary(){
    this.salary = this.salary * 1.2;
    }

}
