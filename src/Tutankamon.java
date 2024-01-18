import java.util.ArrayList;
import java.util.List;

public class Tutankamon
{
    public static void main(String[] args)
    {
        List<Tumba> objetosTotal = new ArrayList<>();

        objetosTotal.add(new Tumba("flecha",5,1));
        objetosTotal.add(new Tumba("sandalias",10,2));
        objetosTotal.add(new Tumba("sarcofago",1000,1000));
        objetosTotal.add(new Tumba("mascara",1000,10));
        objetosTotal.add(new Tumba("arco",10,2));
    }
}
