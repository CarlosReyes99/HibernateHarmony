package main;

import Util.UtilEntity;
import entity.Employee;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManager em= UtilEntity.getEntityManager();
        List<Employee> employeeList= em.createQuery("SELECT e from Employee e", Employee.class).getResultList();
        System.out.println("-----Listar todos-----");
        employeeList.forEach(System.out::println);

    }
}
