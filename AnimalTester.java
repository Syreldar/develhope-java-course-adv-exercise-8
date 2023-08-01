public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal animal = new Animal("Animal");
        Animal lion = new Lion("Lion");
        Animal cow = new Cow("Cow");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
