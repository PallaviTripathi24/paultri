package Collection_Date;

import java.util.*;

public class Ques_4 {
    public static void main(String[] args) {
        List<Employee> al=new ArrayList<Employee>();
        al.add(new Employee("pallavi",21,50000));
        al.add(new Employee("priyanshu",23,100000));
        al.add(new Employee("mishra",20,5000));
        System.out.println("sorting by salary ;");
        Collections.sort(al, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.salary-o2.salary);
            }
        });
        System.out.println(al);
//        Iterator itr=al.iterator();
//        Employee el=(Employee).

    }
}
