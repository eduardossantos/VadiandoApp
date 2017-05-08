package br.com.vadiando.vadiandoapp.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import br.com.vadiando.vadiandoapp.models.Rodas;

/**
 * Created by Icons4u TI on 08/05/2017.
 */

public class ListaRodasAdapter extends ArrayAdapter {

    private Context contexto;
    private ArrayList<Rodas> lista;


    public ListaRodasAdapter(Context contexto, ArrayList<Rodas> lista){
        super(contexto,0,lista);

        this.contexto = contexto;
        this.lista = lista;


    }
}
