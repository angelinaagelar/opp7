package fitonyasha.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProgressList implements Serializable {
    private static final long serialVersionUID = 1L; // Для сериализации
    private List<Progress> progressRecords = new ArrayList<>();

    public void addProgress(Progress progress) {
        progressRecords.add(progress);
    }

    public List<Progress> getProgress() {
        return progressRecords;
    }
}