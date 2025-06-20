package entities;

import interfaces.Bright;

public class Img extends MultimediaElement implements Bright {


    public Img(String title, int brightness) {
        super(title, 0, 0, brightness);

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

    // show
    public void show() {
        String stars = "";
        for (int i = 0; i < brightness; i++) {
            stars += "*";
        }
        System.out.println(title + stars);
    }

}
