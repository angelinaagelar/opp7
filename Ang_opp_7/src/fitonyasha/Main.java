package fitonyasha;

import java.time.LocalDateTime;
import fitonyasha.models.ProgressList;
import fitonyasha.models.WorkoutList;
import fitonyasha.services.FitnessService;
import fitonyasha.services.DataHandler;
import fitonyasha.views.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        FitnessService service = new FitnessService();
        DataHandler dataHandler = new DataHandler();

        while (true) {
            view.showMenu();
            String option = view.getOption();

            switch (option) {
                case "1":
                    String workoutType = view.getWorkoutType();
                    int duration = view.getDuration();
                    int calories = view.getCalories();
                    service.addWorkout(workoutType, duration, LocalDateTime.now(), calories);
                    view.showMessage("Workout added successfully.");
                    break;

                case "2":
                    // Удаление тренировки (необходимо добавить логику)
                    break;

                case "3":
                    WorkoutList workouts = service.getWorkoutList();
                    for (var workout : workouts.getWorkouts()) {
                        System.out.println("ID: " + workout.getId() + ", Type: " + workout.getType() +
                                ", Duration: " + workout.getDuration() + " minutes, Date: " +
                                workout.getDate() + ", Calories: " + workout.getCalories());
                    }
                    break;

                case "4":
                    double weight = view.getWeight();
                    double bodyFat = view.getBodyFat();
                    double waist = view.getWaist();
                    service.addProgress(weight, bodyFat, LocalDateTime.now(), waist);
                    view.showMessage("Progress added successfully.");
                    break;

                case "5":
                    ProgressList progress = service.getProgressList();
                    for (var record : progress.getProgress()) {
                        System.out.println("ID: " + record.getId() + ", Weight: " + record.getWeight() +
                                " kg, Body Fat: " + record.getBodyFat() + "%, Waist: " + record.getWaist() + " cm");
                    }
                    break;

                case "6":
                    // Генерация отчета (необходимо добавить логику)
                    break;

                case "7":
                    dataHandler.saveData(service.getWorkoutList(), service.getProgressList());
                    view.showMessage("Data saved successfully.");
                    break;

                case "8":
                    Object[] data = dataHandler.loadData();
                    if (data != null) {
                        service.setWorkoutList((WorkoutList) data[0]);
                        service.setProgressList((ProgressList) data[1]);
                        view.showMessage("Data loaded successfully.");
                    } else {
                        view.showMessage("Failed to load data.");
                    }
                    break;

                case "9":
                    System.out.println("Exiting the application. Goodbye!");
                    return;

                default:
                    view.showMessage("Invalid option. Please try again.");
                    break;
            }
        }
    }
}