public class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();// criada o objeto animal
    Animal myPorco = new Porco();// criado o objeto porco
    Animal myCachorro = new Cachorro();// criado o objeto cachorro
    myAnimal.animalSound();
    myPorco.animalSound();
    myCachorro.animalSound();
  }
}
