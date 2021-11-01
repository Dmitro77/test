package construktor.oop.hometask;

public class Employee {
    String name;
    String post;
    int salary;


    public Employee(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    String info(int i) {
        return "Сотрудник \"" + name + "\" \n Доллжность \"" + post + "\" \n получил за последние " + i + " месяцев " + salary * i + " руб. ";
    }
}
