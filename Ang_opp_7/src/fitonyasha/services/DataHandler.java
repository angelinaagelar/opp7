package fitonyasha.services;

import java.io.*;
import fitonyasha.models.ProgressList;
import fitonyasha.models.WorkoutList;

public class DataHandler {
    private final String filename = "fitness_data.dat";

    public void saveData(WorkoutList workoutList, ProgressList progressList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(workoutList);
            oos.writeObject(progressList);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public Object[] loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            WorkoutList workoutList = (WorkoutList) ois.readObject();
            ProgressList progressList = (ProgressList) ois.readObject();
            return new Object[]{workoutList, progressList};
        } catch (FileNotFoundException e) {
            System.out.println("Data file not found.");
            return null; // Если файл не найден
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
            return null;
        }
    }
}
