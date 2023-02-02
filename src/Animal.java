/**
 * Animal
 */
// criada a classe animal
public class Animal {
  public void animalSound() {
    System.out.println("O naimal faz barulho ");
  }
}

class Porco extends Animal {
  public void animalSound() {
    System.out.println("O porco faz xii, xii");
  }
}

class Cachorro extends Animal {
  public void animalSound() {
    System.out.println("O cachorro faz au au ");
  }
}