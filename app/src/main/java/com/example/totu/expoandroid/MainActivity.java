package com.example.totu.expoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // on crée nos object
    private Button myButton;
    private TextView nbClick;
    private int compteur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //On associe notre objet Button au bouton de l'interface graphique
        myButton = findViewById(R.id.button);

        //On associe notre object TextView au textview de l'interface (Hello World!)
        nbClick = findViewById(R.id.textView2);


    }
    // fonction qui va calculer le nombre de clique
    public void btn_tap_Click()
    {
        compteur += 1;
        nbClick.setText(compteur);
    }

    // fonction qui va s'activer a chaque click si on clique sur le boutton on appel la fonction
    public void onClick(View v)
    {
        if (v == myButton)
        {
            btn_tap_Click();
        }
    }
}
