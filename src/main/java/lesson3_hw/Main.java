package lesson3_hw;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(2, "Sergey", "Sergeev", 1000);
        Employee employee2 = new Employee(3, "Ivan", "Ivanov", 800);
        Employee employee3 = new Employee(4, "Petr", "Petrov", 1200);
        Director director = new Director(1, "Alex", "Alexeev", 3000);
        List<Employee> workerList = new ArrayList<>();
        workerList.add(employee1);
        workerList.add(employee2);
        workerList.add(employee3);
        workerList.add(director);
        for (Employee worker : workerList){
            System.out.println(worker.toString());
        }
        director.upperSalaryPublic(workerList, 30);
        System.out.println();

        for(Employee worker : workerList){
            System.out.println(worker.toString());
        }

//        DateUs date1 = new DateUs();
//        DateUs date2 = new DateUs();
//
//        List<DateUs> list = new ArrayList<>();
//        list.add(date1);
//        list.add(date2);
//        employee.comporator(list);
//        System.out.println(list.toString());
        //сравниваем 2 строки с датами и та, которая ближе к текущему
        //году встает 1й в листе



    }
}
