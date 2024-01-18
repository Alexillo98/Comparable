public class Niño implements Comparable<Niño>
{
    private int bueno;

    public int getBueno() {
        return bueno;
    }

    public void setBueno(int bueno) {
        this.bueno = bueno;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private int peso;

    public Niño(int bueno, int peso)
    {
        this.bueno = bueno;
        this.peso = peso;
    }


    public String toString(){return this.bueno + " " + this.peso;}

    public int compareTo (Niño otro)
    {
        if (this.bueno == otro.getBueno())
        {
            //return this.peso - otro.getPeso();
            if (this.peso == otro.getPeso()) return 0;
            if (this.peso > otro.getPeso()) return 1;
            return -1;
        }else
        {
            return otro.getBueno() - this.bueno;
        }
    }
}
