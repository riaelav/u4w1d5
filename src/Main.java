import entities.Audio;
import entities.Img;
import entities.MultimediaElement;
import entities.Video;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MultimediaElement[] elements = new MultimediaElement[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + " - Choose tipe (audio / video / img): ");
            String tipe = scanner.nextLine();

            System.out.println("Title:");
            String title = scanner.nextLine();
            switch (tipe) {
                case "audio":
                    System.out.println("duration: ");
                    int durationAudio = Integer.parseInt(scanner.nextLine());
                    System.out.print("volume: ");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    elements[i] = new Audio(title, durationAudio, volumeAudio);
                    break;
                case "video":
                    System.out.println("duration: ");
                    int durationVideo = Integer.parseInt(scanner.nextLine());
                    System.out.print("volume: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.print("brightness:  ");
                    int brightnessVideo = Integer.parseInt(scanner.nextLine());
                    elements[i] = new Video(title, durationVideo, volumeVideo, brightnessVideo);
                    break;
                case "img":
                    System.out.print("brightness:  ");
                    int brightnessImg = Integer.parseInt(scanner.nextLine());
                    elements[i] = new Img(title, brightnessImg);
                    break;
                default:
                    System.out.println("Tipe not found.");
                    break;

            }


        }

        //esempi statici
        
        Audio audio = new Audio("song", 5, 6);
        Video video = new Video("film", 4, 7, 5);
        Img img = new Img("Sunset", 4);


        System.out.println("Play audio:");
        audio.play();
        System.out.println("Play video:");
        video.play();
        System.out.println("Show img:");
        img.show();

        scanner.close();
    }


}


