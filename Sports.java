interface Playable {
    void play();
}

class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball!");
    }
}

class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball!");
    }
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football!");
    }
}

public class Sports {
    public static void main(String[] args) {
        Playable v = new Volleyball();
        Playable b = new Basketball();
        Playable f = new Football();

        v.play();
        b.play();
        f.play();
    }
}
