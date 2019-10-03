// import Animal class

public class Main {

    public static void main(String[] args) {

        //Instantiate new Animal
        Animal animal = new Animal(4, 10, false, "Penguin");

        String name;
        int topSpeed;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);

        //Set new name, speed, and endangered properties values using setters
        animal.setName("Amur Leopard");
        animal.setTopSpeed(37);
        animal.setEndangered(true);

        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);

        System.out.println(animal.getFact());

        Animal elephant = new Animal(4, 25, false, "Elephant");
        Animal lion = new Animal(4, 50, false, "Lion");

        System.out.println(elephant.getFact());
        System.out.println(lion.getFact());

    }
}
