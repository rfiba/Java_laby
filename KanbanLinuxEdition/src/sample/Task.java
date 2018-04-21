package sample;
import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate expirationDate;
    private Priority priority;
    private String description;

    public Task(String title, LocalDate expirationDate, Priority priority, String description) {
        this.title = title;
        this.expirationDate = expirationDate;
        this.priority = priority;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return title;
    }

}