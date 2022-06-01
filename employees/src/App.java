import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nHow many employees will be registered? ");
        int n = sc.nextInt();

        boolean flag1 = true;
        boolean flag2 = true;

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i=0; i<n; i++) {
            
            System.out.println();
            System.out.println("Employee #" + (i+1) + ':');
            System.out.print("Id: ");
            int id = sc.nextInt();
            if (flag1) {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                employees.add(new Employee(id, name, salary));
                flag1 = false;
            } else if (flag2) {
                for (Employee obj : employees) {
                    if (obj.getId() == id) {
                        System.out.println("ERROR! Id already registered!");
                        flag2 = false;
                        break;
                    }
                } if (flag2) {
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    employees.add(new Employee(id, name, salary));
                }
                flag2 = true;
            }  
        }

        System.out.printf("%nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			emp.increaseSalary(sc.nextDouble());
		}

        System.out.printf("%nList of employees:%n");
        for (Employee obj : employees) {
            System.out.println(obj.toString());
        }

        sc.close();
    }
}