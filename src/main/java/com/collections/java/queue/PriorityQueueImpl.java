package com.collections.java.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(34);
        pq.add(67);
        pq.add(-87);
        pq.add(589);
        System.out.println(pq.size());

        //Priority Queue has a natural ascending order for storing the elements
        //so the least value is stored and printed when we peek
        System.out.println(pq.peek()); //->Retrieves, but does not remove, the head of this queue
        System.out.println(pq.poll()); //->Retrieves and removes the head of this queue
        System.out.println(pq.peek()); //now that least value is removed as head, the next least value occupies that least value place


        EmployeeComparator empComp = new EmployeeComparator();
        PriorityQueue<Employee> pr = new PriorityQueue<>(45, empComp); //this fetches the least salaried employee


        pr.add(new Employee("A", 78));
        pr.add(new Employee("B", 89));
        pr.add(new Employee("F", 5677));
        pr.add(new Employee("O", 353));
        pr.add(new Employee("I", 535));
        pr.add(new Employee("T", 63));
        pr.add(new Employee("R", 4450));
        pr.add(new Employee("P", 4850));
        pr.add(new Employee("U", 4550));

        System.out.println(pr.poll()); //->throws ClassCastException,
        // so we have implement own compare() inorder to overcome this exception

        System.out.println(pr);
    }
}

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary - e2.salary; //this gives the lowest salary, for highest salary make e2.Salary - e1.Salary
    }
}