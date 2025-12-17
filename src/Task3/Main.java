package Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> employees = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Number of unique employees: " + employees.size());

        System.out.println("\nEmployees in alphabetical order:");
        for (String emp : employees) {
            System.out.println(emp);
        }
    }
}

