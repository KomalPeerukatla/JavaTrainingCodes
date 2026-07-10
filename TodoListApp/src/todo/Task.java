package todo;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Serializable {

    private int id;
    private String title;
    private String description;
    private Priority priority;
    private LocalDate dueDate;
    private boolean completed;

    public Task() {

    }

    public Task(int id,
                String title,
                String description,
                Priority priority,
                LocalDate dueDate) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.completed = false;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Priority getPriority() {
        return priority;
    }


    public void setPriority(Priority priority) {
        this.priority = priority;
    }


    public LocalDate getDueDate() {
        return dueDate;
    }


    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }


    public boolean isCompleted() {
        return completed;
    }


    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {

        return "\n----------------------------------" +
                "\nTask ID      : " + id +
                "\nTitle        : " + title +
                "\nDescription  : " + description +
                "\nPriority     : " + priority +
                "\nDue Date     : " + dueDate +
                "\nCompleted    : " + completed +
                "\n----------------------------------";

    }

}