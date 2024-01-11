import java.util.ArrayList;

public class ComparacionSalarios
{
    public static void main(String[] args)
    {
        ArrayList<Human> humanos = new ArrayList<>();

        humanos.add(new Human("Ana",1300));
        humanos.add(new Human("Paco",1200));
        humanos.add(new Human("Pepe",1900));
        humanos.add(new Human("Maria",1700));

        humanos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
