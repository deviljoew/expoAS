package com.example.totu.expoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // on crée nos objets et nos variables
    private Button myButton;
    private TextView nbClick;
    private int compteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On associe notre objet Button au bouton de l'interface graphique
        myButton = findViewById(R.id.button);

        //On associe notre objet TextView au textview de l'interface (Hello World!)
        nbClick = findViewById(R.id.textView2);
    }
    // Cette fonction va calculer le nombre de clique et afficher le résultat dans un TextView
    public void btn_tap_Click()
    {
        compteur += 1;
        nbClick.setText("Vous avez cliqué " + compteur + " fois");
    }

    // La fonction onClick va s'activer à chaque click.
    // Dans cette fonction on va rajouter une condition :
    // si on clique sur le bouton on appelle la fonction btn_tap_Click
    public void onClick(View v)
    {
        if (v == myButton)
        { btn_tap_Click();}
    }
}
