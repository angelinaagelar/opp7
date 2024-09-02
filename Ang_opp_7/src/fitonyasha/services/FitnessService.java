package fitonyasha.services;

import fitonyasha.models.Workout;
import fitonyasha.models.WorkoutList;
import fitonyasha.models.Progress;
import fitonyasha.models.ProgressList;

import java.time.LocalDateTime;

public class FitnessService {
    private WorkoutList workoutList = new WorkoutList();
    private ProgressList progressList = new ProgressList();

    public void addWorkout(String type, int duration, LocalDateTime date, int calories) {
        int workoutId = workoutList.getWorkouts().size() + 1;
        Workout workout = new Workout(workoutId, type, duration, date, calories);
        workoutList.addWorkout(workout);
    }

    public void addProgress(double weight, double bodyFat, LocalDateTime date, double waist) {
        int progressId = progressList.getProgress().size() + 1;
        Progress progress = new Progress(progressId, weight, bodyFat, date, waist);
        progressList.addProgress(progress);
    }

    public WorkoutList getWorkoutList() {
        return workoutList;
    }

    public void setWorkoutList(WorkoutList workoutList) {
        this.workoutList = workoutList;
    }

    public ProgressList getProgressList() {
        return progressList;
    }

    public void setProgressList(ProgressList progressList) {
        this.progressList = progressList;
    }
}
