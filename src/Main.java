import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("employees.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        System.out.println("Number of employees: " + employees.size());


        System.out.println("\nUsing normal for loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nUsing for-each loop:");
        for (String emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\nUsing Iterator:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}