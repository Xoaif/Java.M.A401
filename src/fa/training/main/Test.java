package fa.training.main;

import fa.training.entities.Song;
import fa.training.entities.Video;
import fa.training.management.MultimediaManagement;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MultimediaManagement management = new MultimediaManagement();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Choose function:");
            System.out.println("1.Add a new Video");
            System.out.println("2.Add a new Song");
            System.out.println("3.Show all multimedia");
            System.out.println("4.Exit");
            System.out.println("Your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("-----Enter video information-----");
                    Video video = new Video();
                    video.createVideo();
                    management.addMultimedia(video);
                    break;
                case 2:
                    System.out.println("-----Enter song information-----");
                    Song song = new Song();
                    song.creatSong();
                    System.out.println("Enter singer: ");
                    management.addMultimedia(song);
                    break;
                case 3:
                    System.out.println("-----List of Multimedia-----");
                    management.displayMultimedia();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;

            }
        }

    }
}
