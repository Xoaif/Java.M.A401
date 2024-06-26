package fa.training.entities;

public class Video extends Multimedia{
    public Video() {
        super();
    }

    public Video(String name, double durations) {
        super(name, durations);
    }


    public void createVideo(){
        creatMultimedia();
    }

    @Override
    public String toString() {
        return "Video :   " + getName()+ "   "+ getDurations();
    }
}
