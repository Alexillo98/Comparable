import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepartoRegalosNiños
{
    public static String repartos (List<Niño> buenosYpesos)
    {
//        String res = "";
//        Collections.sort(buenosYpesos);
//        for (Niño nino: buenosYpesos
//             ) {
//            res += nino + "\n";
//        }
        Collections.sort(buenosYpesos);
        StringBuilder sb = new StringBuilder();
        for (Niño nino: buenosYpesos
             ) {
            sb.append(nino).append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        List<Niño> buenosYPesos = new ArrayList<>();

        buenosYPesos.add(new Niño(80,2));
        buenosYPesos.add(new Niño(100,12));
        buenosYPesos.add(new Niño(100,1));

        System.out.println(repartos(buenosYPesos));
    }
}
