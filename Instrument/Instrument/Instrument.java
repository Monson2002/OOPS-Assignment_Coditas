package Instrument.Instrument;
import java.util.Random;
abstract class Instrument {
    public abstract void play();
}
class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
class Flute extends Instrument {
    @Override
    public void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(3) + 1;
            if (randomNumber == 1)
                instruments[i] = new Piano();
            else if (randomNumber == 2)
                instruments[i] = new Flute();
            else if (randomNumber == 3)
                instruments[i] = new Guitar();
            instruments[i].play();
        }
        for (int i = 0; i < 10; i++) {
            String typeOfInstrument = "";
            if (instruments[i] instanceof Piano) {
                typeOfInstrument = "Piano";
            } else if (instruments[i] instanceof Flute) {
                typeOfInstrument = "Flute";
            } else if (instruments[i] instanceof Guitar) {
                typeOfInstrument = "Guitar";
            }
            System.out.println(i + " " + typeOfInstrument);
        }
    }
}