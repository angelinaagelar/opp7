package fitonyasha.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WorkoutList implements Serializable {
    private static final long serialVersionUID = 1L; // Для сериализации
    private List<Workout> workouts = new ArrayList<>();

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public void removeWorkout(int workoutId) {
        workouts.removeIf(workout -> workout.getId() == workoutId);
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }
}
