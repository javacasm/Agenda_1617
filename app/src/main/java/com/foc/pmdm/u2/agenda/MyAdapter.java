package com.foc.pmdm.u2.agenda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by javacasm on 15/12/2016.
 */



public class MyAdapter extends BaseAdapter {

    private Persona []lista;
    private Context myContexto;
    public MyAdapter(Context contexto,Persona[] l)
    {
        lista=l;
        myContexto=contexto;
    }

    @Override
    public int getCount() {
        return lista.length;
    }

    @Override
    public Object getItem(int i) {
        return lista[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int posicion, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=
                (LayoutInflater) myContexto.getSystemService( Context.LAYOUT_INFLATER_SERVICE);
        View vFila=inflater.inflate(R.layout.fila_layout,null);
        TextView tvNombre=(TextView)vFila.findViewById(R.id.tvNombre);
        TextView tvApellido=(TextView)vFila.findViewById(R.id.tvApellido);
        TextView tvEdad=(TextView)vFila.findViewById(R.id.tvEdad);

        // TODO: mostrar imagen según la edad
        // TODO: diseño diferente para las filas pares y las impares

        tvNombre.setText(lista[posicion].nombre);
        tvApellido.setText(lista[posicion].apellido);
        tvEdad.setText(Integer.toString(lista[posicion].edad));
        return vFila;
    }
}
