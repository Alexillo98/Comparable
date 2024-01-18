public class Niño implements Comparable<Niño>
{
    private int bueno;

    private int peso;

    public Niño(int bueno, int peso)
    {
        this.bueno = bueno;
        this.peso = peso;
    }

    public String toString(){return this.bueno + " " + this.peso;}

    public int compareTo (Niño otro)
    {
        if (this.bueno == otro.bueno)
        {
            return this.peso - otro.peso;
        }else
        {
            return otro.bueno - this.bueno;
        }
    }
}
