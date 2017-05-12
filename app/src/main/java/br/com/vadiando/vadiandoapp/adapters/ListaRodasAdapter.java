package br.com.vadiando.vadiandoapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.vadiando.vadiandoapp.R;
import br.com.vadiando.vadiandoapp.models.Rodas;

/**
 * Created by Icons4u TI on 08/05/2017.
 */

public class ListaRodasAdapter extends ArrayAdapter {

    private Context contexto;
    private ArrayList<Rodas> listaRodas;


    public ListaRodasAdapter(Context contexto, ArrayList<Rodas> listaRodas){
        super(contexto,0,listaRodas);

        this.contexto = contexto;
        this.listaRodas = listaRodas;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Rodas rodaPosicao = this.listaRodas.get(position);
        convertView = LayoutInflater.from(this.contexto).inflate(R.layout.lista_de_rodas,null);

        ImageView imagem = (ImageView) convertView.findViewById(R.id.lista_rodas_imagem);
        imagem.setImageResource(rodaPosicao.getImagem());

        ImageView favorito = (ImageView) convertView.findViewById(R.id.imageView);
        favorito.setImageResource(rodaPosicao.getImagem());

        TextView km = (TextView) convertView.findViewById(R.id.lista_rodas_kilometros);
        km.setText(rodaPosicao.getKm());

        TextView responsavel = (TextView) convertView.findViewById(R.id.lista_rodas_responsavel);
        responsavel.setText(rodaPosicao.getResponsavel());

        TextView endereco = (TextView) convertView.findViewById(R.id.lista_rodas_local);
        endereco.setText(rodaPosicao.getEndereco());

        TextView dataHora = (TextView) convertView.findViewById(R.id.lista_rodas_datainicio);
        dataHora.setText(rodaPosicao.getDataHora());

        Button confirmar = (Button) convertView.findViewById(R.id.lista_rodas_confirmar);
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button visualizar = (Button) convertView.findViewById(R.id.lista_rodas_visualizar);
        visualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

        return convertView;
    }
}
