package Collection_Date;

import java.util.Comparator;

public class Employee {
    String name;
    double age;
    double salary;
    Employee(String name,double age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
//    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>(){
//

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
//        @Override
//        public int compare(Employee o1, Employee o2) {
//            return o1.salary - o2.salary;
//        }

    }

