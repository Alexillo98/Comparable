import java.util.ArrayList;
import java.util.Collections;

public class Felipe
{
    public static ArrayList<Tarea> ordenarTareas (ArrayList<Tarea> prioridad)
    {
        String res = "";
        Collections.sort(prioridad);
        for (Tarea t : prioridad) {
            res += t;
        }
        return prioridad;
    }
    public static void main(String[] args)
    {
        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea(30, 7));
        tareas.add(new Tarea(30,2));
        System.out.print(ordenarTareas(tareas));
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
