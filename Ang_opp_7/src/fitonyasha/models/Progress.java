package fitonyasha.models;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Progress implements Serializable {
    private static final long serialVersionUID = 1L; // Для сериализации
    private int id;
    private double weight;
    private double bodyFat;
    private LocalDateTime date;
    private double waist;

    public Progress(int id, double weight, double bodyFat, LocalDateTime date, double waist) {
        this.id = id;
        this.weight = weight;
        this.bodyFat = bodyFat;
        this.date = date;
        this.waist = waist;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public double getBodyFat() { return bodyFat; }
    public void setBodyFat(double bodyFat) { this.bodyFat = bodyFat; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
    public double getWaist() { return waist; }
    public void setWaist(double waist) { this.waist = waist; }
}
