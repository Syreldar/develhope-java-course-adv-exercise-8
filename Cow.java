public class Cow extends Animal
{
    public Cow(String animalName)
    {
        super(animalName);
    }

    @Override
    public void animalSound()
    {
        System.out.printf("The %s moos.%n", animalName);
    }
}
