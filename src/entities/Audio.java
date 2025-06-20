package entities;

import interfaces.Volume;

public class Audio extends MultimediaElement implements Volume {

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
    }

}
