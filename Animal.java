public class Animal
{
    protected String animalName;

    public Animal(String animalName)
    {
        this.animalName = animalName;
    }

    public void animalSound()
    {
        System.out.printf("The %s makes a sound.%n", animalName);
    }
}
