import br.com.lucasnog.IUserInterface;
import br.com.lucasnog.model.Dado;
import br.com.lucasnog.impl.AnaliseDados;
import br.com.lucasnog.ui.UserInterface;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        AnaliseDados analise = new AnaliseDados();
        IUserInterface user = new UserInterface();
        List<Dado> listaDados = new ArrayList<Dado>();

        Dado dado1 = new Dado("Carros", "15/11/2005", 5  );
        listaDados.add(dado1);
        Dado dado2 = new Dado("Vestuario", "15/12/2005", 50  );
        listaDados.add(dado2);
        Dado dado3 = new Dado("Carros", "15/12/2005", 15  );
        listaDados.add(dado3);
        Dado dado4 = new Dado("Carros", "13/12/2005", 25  );
        listaDados.add(dado4);
        Dado dado5 = new Dado("Vestuario", "15/12/2005", 10  );
        listaDados.add(dado5);
        Dado dado6 = new Dado("Carros", "15/12/2005", 20  );
        listaDados.add(dado6);
        Dado dado7 = new Dado("Carros", "15/11/2005", 40  );
        listaDados.add(dado7);
        Dado dado8 = new Dado("Vestuario", "15/12/2005", 50  );
        listaDados.add(dado8);
        Dado dado9 = new Dado("Carros", "13/12/2005", 60  );
        listaDados.add(dado9);
        Dado dado10 = new Dado("Vestuario", "15/11/2005", 90  );
        listaDados.add(dado10);



        user.filtrarPorCategoria(analise.filtrarPorCategoria(listaDados, "Carros"));
        user.somaPorCategoria(analise.somaPorCategoria(listaDados, "Vestuario"));
        user.encontrarValorMaximoLista(analise.encontrarValorMaximoLista(listaDados));
        user.ordenarPorData(analise.ordenarPorData(listaDados));
        user.ordenarPorValor(analise.ordenarPorValor(listaDados));


    }
}