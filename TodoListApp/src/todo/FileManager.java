package todo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static final String FILE_NAME = "tasks.txt";

    // Save Tasks
    public void saveTasks(List<Task> tasks) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Task t : tasks) {

                bw.write(
                        t.getId() + "," +
                        t.getTitle() + "," +
                        t.getDescription() + "," +
                        t.getPriority() + "," +
                        t.getDueDate() + "," +
                        t.isCompleted());

                bw.newLine();
            }

            System.out.println("Tasks Saved Successfully.");

        } catch (Exception e) {

            System.out.println("Error Saving File : " + e.getMessage());

        }

    }

    // Load Tasks
    public List<Task> loadTasks() {

        List<Task> tasks = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String title = data[1];
                String description = data[2];
                Priority priority = Priority.valueOf(data[3]);
                LocalDate dueDate = LocalDate.parse(data[4]);
                boolean completed = Boolean.parseBoolean(data[5]);

                Task task = new Task(id, title, description, priority, dueDate);

                task.setCompleted(completed);

                tasks.add(task);

            }

            System.out.println("Tasks Loaded Successfully.");

        } catch (Exception e) {

            System.out.println("No Previous File Found.");

        }

        return tasks;

    }

}