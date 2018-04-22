package pacote.trabalho;

import java.util.ArrayList;
import java.util.List;

public class ListaMesas {

    private static List<Mesa> mesas;
    private static int i = 1;

    public static List<Mesa> getInstance() {
        if (mesas == null) {
            mesas = new ArrayList<>();
            mesas.add(new Mesa(i));
            mesas.add(new Mesa(++i));
            mesas.add(new Mesa(++i));
        }
        return mesas;
    }
}
