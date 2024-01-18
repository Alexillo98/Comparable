public class Tarea implements Comparable<Tarea>
{
    private int prioridad;

    private int duracion;

    public Tarea (int prioridad, int duracion)
    {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    //public int getTarea() {return this.prioridad;}

    //public int getDuracion() {return this.duracion;}

    public String toString ()
    {
        return this.prioridad + " -> " + this.duracion;
    }
    public int compareTo (Tarea otro)
    {
        if (this.prioridad == otro.prioridad)
        {
            return this.duracion - otro.duracion;
        }else
        {
            return otro.prioridad - this.prioridad;
        }
    }
}
