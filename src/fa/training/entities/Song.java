package fa.training.entities;

import java.util.Scanner;

public class Song extends Multimedia{
    private String singer;

    public Song() {
        super();
    }

    public Song(String name, double durations, String singer) {
        super(name, durations);
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void creatSong(){
        creatMultimedia();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter singer: ");
        this.setSinger(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Song:    " + getName()+ "   " +getDurations() + "   " +getSinger();
    }
}
