import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LocalidadesYPremios
{
//    public static String ordenarLoteria (List<Loteria> dineroYPremios)
//    {
//        String res = "";
//        Collections.sort(dineroYPremios);
//        for (Loteria l: dineroYPremios)
//        {
//            res += l + "\n";
//        }
//        return res;
//    }

    public static boolean esJusto (List<Loteria> comprobarRepartos)
    {
        Collections.sort(comprobarRepartos);
        for (int i = 0; i < comprobarRepartos.size()-1;i++)
        {
            if (comprobarRepartos.get(i).getPremio() <= comprobarRepartos.get(i+1).getPremio()
                    && comprobarRepartos.get(i).getDinero() > comprobarRepartos.get(i+1).getDinero())
            {
                return  false;
            }
//            if (comprobarRepartos.get(i).getPremio() > comprobarRepartos.get(i+1).getPremio() && comprobarRepartos.get(i).getDinero() < comprobarRepartos.get(i+1).getDinero())
//            {
//                justo = false;
//                break;
//            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        List<Loteria> loterias = new ArrayList<>();

        loterias.add(new Loteria(9,4));
        loterias.add(new Loteria(10,6));
        loterias.add(new Loteria(9,5));
        loterias.add(new Loteria(1,3));


        if(esJusto(loterias))
        {
            System.out.println("SI ES JUSTO");
        }else
        {
            System.out.println("NO ES JUSTO");
        }

        loterias = new ArrayList<>();

        loterias.add(new Loteria(10,5));
        loterias.add(new Loteria(20,5));
        loterias.add(new Loteria(30,5));

        if(esJusto(loterias))
        {
            System.out.println("SI ES JUSTO");
        }else
        {
            System.out.println("NO ES JUSTO");
        }
    }
}
