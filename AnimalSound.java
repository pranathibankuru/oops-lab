abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Lion is roaring");
    }
}

class Tiger extends Animal {
    public void sound() {
        System.out.println("Tiger is roaring");
    }
}

public class AnimalSound{
    public static void main(String[] args) {
        
        System.out.println("Student Name: B. Pranathi");
        System.out.println("Roll No: AV.SC.U4CSE24022");
        System.out.println("Section: CSE-A");
        System.out.println("----------------------------------");
        System.out.println("Animal Sounds Demonstration");
        System.out.println("----------------------------------");
        
        Animal lion = new Lion();
        lion.sound();
        
        Animal Tiger = new Tiger();
        Tiger.sound();
    }
}