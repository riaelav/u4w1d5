package entities;

import interfaces.Play;
import interfaces.Volume;

public class Audio extends MultimediaElement implements Volume, Play {

    // costruttore

    public Audio(String title, int duration, int volume) {
        super(title, duration, volume, 0);
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
        @Override
                public void play() {
            for (int i =0; i < duration; i++) {
                String esclamativo = "";
                for (int x = 0; x<volume; x++) {
                    esclamativo +="!";

                }
                System.out.println(title+" "  ;
            }
        }
    }

}
