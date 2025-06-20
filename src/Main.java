import entities.Audio;
import entities.Img;
import entities.Video;


public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio("song", 5, 6);
        Video video = new Video("film", 4, 7, 5);
        Img img = new Img("Sunset", 4);


        System.out.println("Play audio:");
        audio.play();
        System.out.println("Play video:");
        video.play();
        System.out.println("Show img:");
        img.show();
    }
}
