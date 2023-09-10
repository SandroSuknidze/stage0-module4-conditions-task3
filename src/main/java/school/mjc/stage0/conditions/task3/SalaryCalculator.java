package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000) {
            System.out.println(salary - salary * 15 / 100);
        } else if (10000 < salary && salary <= 20000) {
            System.out.println(salary - salary * 18 / 100);
        } else if (20000 > salary) {
            System.out.println(salary - salary * 28 / 100);
        } else {
            System.out.println("wrong input!");
        }
    }
}
