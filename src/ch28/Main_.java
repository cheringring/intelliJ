package ch28;

public class Main_ {
    public static void main(String[] args) {

        Tell tell = new Cat();
        Animal animal = new Cat();
        Pet pet = new Cat();

      var main=   new Main_();
      main.runCry(new Cat());
      main.runPlay(new Cat());

    }



    // Animal animal 변수는 animal만 가능하다고 딱 못박는거임.
    public void runCry(Animal animal) {

    }

    public void runPlay(Pet pet) {

    }
}