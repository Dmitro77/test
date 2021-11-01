package construktor.oop.hometask;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Johan", "Programmer", 60000);
        String info1 = employee1.info(12);
        System.out.println(info1);

        Employee employee2 = new Employee("Gusein Gasanov", "Ingener", 30000);
        String info2 = employee2.info(6);
        System.out.println(info2);

        Employee employee3 = new Employee("Abdul", "работяга", 10000);
        String info3 = employee3.info(6);
        System.out.println(info3);

    }
}
