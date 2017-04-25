package com.miramicodigo.studyjam_customlistview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetalleActivity extends AppCompatActivity {

    /**
     *
     * @author Gustavo Lizarraga
     * @date 18/04/2017
     *
     * */

    private ImageView ivImagen;
    private TextView tvNombre;
    private TextView tvHAbilidades;

    private Typeface tf_thing;
    private Typeface tf_bold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ivImagen = (ImageView) findViewById(R.id.ivDetalleImagen);
        tvNombre = (TextView) findViewById(R.id.tvDetalleNombre);
        tvHAbilidades = (TextView) findViewById(R.id.tvDetalleHabilidades);

        tf_thing = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_thin.ttf");
        tf_bold = Typeface.createFromAsset(
                getAssets(), "fonts/roboto_black.ttf");

        tvNombre.setTypeface(tf_bold);
        tvHAbilidades.setTypeface(tf_thing);

        Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("poke");
        tvNombre.setText(pokemon.getNombre().toString());
        tvHAbilidades.setText(pokemon.getHabilidades().toString());
        ivImagen.setImageResource(pokemon.getImagen());
    }

}
