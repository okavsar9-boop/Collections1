package Task4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/employees.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }

        employees.sort(Collections.reverseOrder());

        System.out.println("Employees reverse alphabetical, duplicates kept :");
        for (String emp : employees) {
            System.out.println(emp);
        }
    }
}
