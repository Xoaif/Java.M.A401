package fa.training.entities;

import java.util.Scanner;

public abstract class Multimedia {
    private String name;
    private double durations;

    public Multimedia(String name, double durations) {
        this.name = name;
        this.durations = durations;
    }

    public Multimedia() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurations() {
        return durations;
    }

    public void setDurations(double durations) {
        this.durations = durations;
    }

    // concrete class
    public void creatMultimedia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: "  );
        this.setName(sc.nextLine());
        System.out.println("Enter durations (minutes): " );
        this.setDurations(sc.nextDouble());
    }
}
