package ru.muffincolor;

public class Main
{
    public static void main(String[] args)
    {
        Employee[] emloyeeList = new Employee[5];
        for(int i = 0; i < emloyeeList.length; i++) {
            emloyeeList[i] = new Employee("Работник " + i, "Должность какая-то", "test@user.ru", "+7 800 88000 888", 456.0d, (int) (Math.random() * 100));
            if(emloyeeList[i].age > 40) {
                emloyeeList[i].printInfo();
            }
        }
    }

    public static class Employee {
        private String fullName;
        private String post;
        private String email;
        private String phone;
        private double salary;
        private int age;

        public Employee(String fullName, String post, String email, String phone, double salary, int age) {
            this.fullName = fullName;
            this.post = post;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        private void printInfo() {
            System.out.println("ФИО: " + fullName + "\nДолжность: "
                    + post + "\nПочта: " + email + "\nТелефон: "
                    + phone + "\nЗарпалата: " + salary + "\nВозраст: " + age);
        }
    }
}