public class Tumba implements Comparable<Tumba>
{
    private String objeto;

    private int valor;

    private int peso;

    public Tumba (String objeto, int valor, int peso)
    {
        this.objeto = objeto;
        this.valor = valor;
        this.peso = peso;
    }

    public String getObjeto()
    {
        return objeto;
    }

    public int getValor()
    {
        return valor;
    }

    public int getPeso()
    {
        return peso;
    }

    public String toString ()
    {
        return this.objeto + " " + this.valor + " " + this.peso;
    }

    public int compareTo (Tumba otro)
    {
        if (otro.getValor() == this.valor)
        {
            if (otro.getPeso() == this.peso)
            {
                return 0;
            }else
            {
                return this.peso - otro.getPeso();
            }
        }else
        {
            return otro.getValor() - this.valor;
        }
    }
}
