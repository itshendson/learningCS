package learningJava;

public class Main {

    public static void main(String[] args) {
        Bulbasaur bulba = new Bulbasaur("bulba", 2);
        Bulbasaur bulba2 = new Bulbasaur("bubba", 3);
        Bulbasaur bulba3 = new Bulbasaur("wubba", 7);

        bulba.speak();
        bulba2.speak();
        bulba3.speak();

        bulba.setAge(5);
        bulba.speak();
    }

}
