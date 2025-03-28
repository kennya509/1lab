import java.util.UUID;

public class Task {
    private String id;
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.id = UUID.randomUUID().toString().substring(0, 4); // Коротший ID
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public String toString() {
        return "Задача [" + id + "] - " + title + "\n" +
                "  Опис: " + description + "\n" +
                "  Статус: " + (completed ? "Виконано" : "Не виконано");
    }
}