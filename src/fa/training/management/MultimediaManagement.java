package fa.training.management;

import fa.training.entities.Multimedia;

import java.util.ArrayList;
import java.util.List;

public class MultimediaManagement {
    private List<Multimedia> listOfMultimedia;

    public MultimediaManagement() {
        this.listOfMultimedia = new ArrayList<>();
    }

    public void addMultimedia(Multimedia multimedia) {
        this.listOfMultimedia.add(multimedia);
    }

    public void displayMultimedia() {
        for (Multimedia multimedia : this.listOfMultimedia) {
            System.out.println(multimedia);
        }
    }
}
