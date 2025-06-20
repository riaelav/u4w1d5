package entities;

public abstract class MultimediaElement {

    //attributi
    protected String title;
    protected int duration;
    protected int volume;
    protected int brightness;

    //costruttori
    public MultimediaElement(String title, int duration, int volume, int brightness) {
        this.title = title;
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;

    }
    //getter

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    //setter

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
