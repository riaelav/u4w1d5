package entities;

import interfaces.Bright;
import interfaces.Play;
import interfaces.Volume;

public class Video extends MultimediaElement implements Volume, Bright, Play {

    //costruttore
    public Video(String title, int duration, int volume, int brightness) {
        super(title, duration, volume, brightness);
    }

    @Override
    public void upVolume() {
        volume++;
    }

    @Override
    public void downVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public void brightUp() {
        brightness++;
    }

    @Override
    public void brightDown() {
        if (brightness > 0) {
            brightness--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            String esclamations = "";
            for (int x = 0; x < volume; x++) {
                esclamations += "!";
            }
            String stars = "";
            for (int y = 0; y < brightness; y++) {
                stars += "*";

            }
            System.out.println(title + esclamations + stars);
        }
    }


}
