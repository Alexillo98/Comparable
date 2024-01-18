public class Loteria implements Comparable<Loteria>
{
    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    private int dinero;

    private int premio;

    public Loteria (int dinero, int premio)
    {
        this.dinero = dinero;
        this.premio = premio;
    }

    public String toString () {return this.dinero + "->" + this.premio;}

    public int compareTo (Loteria otro)
    {
        if (this.dinero == otro.getDinero())
        {
            return otro.getPremio() - this.premio;
        }else
        {
            return otro.getDinero() - this.getDinero();
        }
    }
}
