package lesson3_hw;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{


    private int ID; //ID руководителя
    private String name;  //Имя руководителя
    private String surname;//Фамилия руководителя
    private int salary;// Зарплата руководителя
    private int percent; // % увелечения зп

    public Director(int ID, String name, String surname, int salary) {
        super(ID, name, surname, salary);
    }

    public List<Employee> upperSalaryPublic(List<Employee> list, int percent){
        return upperSalary(list,percent);
    }

    private static List<Employee> upperSalary(List<Employee> list, int percent){
        for (Employee worker : list) {
            if (worker.getClass() != Director.class) {
                 worker.setSalary((worker.getSalary() * percent)/100 + worker.getSalary());
            }
        }
        return list;
    }
}
