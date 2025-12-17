package Task2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/employees.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("Number of unique employees: " + employees.size());

        System.out.println("\nEmployees:");
        for (String emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\nChecking if 'Omina Kavsar' exists:");
        if (employees.contains("Omina Kavsar")) {
            System.out.println("Omina Kavsar is in the collection");
        } else {
            System.out.println("Omina Kavsar is NOT in the collection");
        }
    }
}
