import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Felipe
{
    public static ArrayList<Tareas> ordenarTareas (ArrayList<Tareas> prioridad)
    {
        String res = "";
        Collections.sort(prioridad);
        for (Tareas t : prioridad) {
            res += t;
        }
        return prioridad;
    }
    public static void main(String[] args)
    {
        ArrayList<Tareas> prioridades = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);

        int priority;
        int duration;

        do
        {
            System.out.print("Introduce la prioridad: ");
            priority = escaner.nextInt();
            System.out.print("Introduce la duracion: ");
            duration = escaner.nextInt();
            if (priority != 0  || duration != 0)
            {
                prioridades.add(new Tareas(priority, duration));
            }
        }while (priority != 0 || duration != 0);

        System.out.print(ordenarTareas(prioridades));
    }
        /*public static ArrayList<Tareas> ordenarDuracion (ArrayList<Tareas> duracion)
    {
        String res = "";
        Collections.sort(duracion);
        for (Tareas d : duracion)
        {
            res += d;
        }
        return duracion;
    }*/
}
