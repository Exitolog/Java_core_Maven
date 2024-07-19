package lesson3_hw;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.*;

public class Employee {
   private final int ID; //ID сотрудника
   private final String name;  //Имя сотрудника
   private final String surname;  //Фамилия сотрудника
   private int salary; //Зарплата сотрудника

   @Override
   public String toString() {
      return "Employee{" +
              "ID=" + ID +
              ", name='" + name + '\'' +
              ", surname='" + surname + '\'' +
              ", salary=" + salary +
              '}';
   }

   public Employee(int ID, String name, String surname, int salary) {
      this.ID = ID;
      this.name = name;
      this.surname = surname;
      this.salary = salary;
   }

   public List<DateUs> comporator(List<DateUs> list){
      Comparator yearComporator = new OldYearComporator();
      Collections.sort(list, yearComporator);
      return list;
   }


   public void setSalary(int salary) {
      this.salary = salary;
   }

   public int getSalary() {
      return salary;
   }


}


