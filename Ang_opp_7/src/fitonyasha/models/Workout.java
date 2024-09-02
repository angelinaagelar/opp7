package fitonyasha.models;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Workout implements Serializable {
    private static final long serialVersionUID = 1L; // Для сериализации
    private int id;
    private String type;
    private int duration;
    private LocalDateTime date;
    private int calories;

    public Workout(int id, String type, int duration, LocalDateTime date, int calories) {
        this.id = id;
        this.type = type;
        this.duration = duration;
        this.date = date;
        this.calories = calories;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }
}