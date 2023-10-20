package relations;

public class Kamaz extends Car {
    int wheels = 6;

    Radio radio = new Radio();
    void playMusic() {
        radio.playMusic();
    }

}
