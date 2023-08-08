package br.edu.ifsp.admo.conversormonetario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final double DOLLAR_ = ;
    private final double DOLLAR_VALUE = 4.92;
    private EditText inputEditText;
    private Button mButton;
    private TextView outputTextView;
    /* Definição da constante que representa nosso valor da cotação do dolar.*/

    private final double DOLLAR_VALUE = 5.0;
    /* Definição dos atributos da classe. Definição dos elementos que compõem a activity.
     */
    private EditText inputEditText;
    private Button toDollarButton;
    private Button toRealButton;
    private TextView outputTextview;

    /* Implementação dos métodos de callback, ou seja, métodos que são invocados pelo
    sistema operacional android que altera o estado da activity*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findById();
        setClick();
        /* Implementacão dos métodos das interfaces.*/
        @Override
        public void onClick (View v){
            if (v == toDollarButton) {
                converterParaDolar();
                relse if (v == toRealButton) {
                    converterParaReal();

                    @Override
                    protected void onCreate (Bundle savedInstanceState){
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_main);

                        findViewById();
                        setClick();
                    }
                }
                /*Implementação dos métodos privados da classe*/
                private void findById () {
                    inputEditText = findViewById(R.id.edittext_value);
                    toDollarButton = findViewById(R.id.button_2_dollar);
                    toRealButton = findViewById(R.id.button 2_real);
                    outputTextView = findViewById(R.id.textview_output);
                }
                private void setClick () {
                    torealButton.setOnClickListener(this);
                    toDollarButton.setOnclickListener(this);
                }
                private double leituravalor () {
                    double value = 0;
                    String stringValue;
                    /*Recuperar o valor do edittext e converter para número */
                    stringValue = inputEditText.getText().toString();
                    try {
                        value = Double.value0f(stringValue);

                    } catch (NumberFormatException exception) {
                        value = 0;
                    }
                }
                return value;
                private void converterParaDolar () {
                    double value = leituraValor();
                    value = value / DOLLAR_VALUE;
                    outputTextView.setText(String.value0f(value));
                }
                private void converterParaReal () {
                    ;
                    double value = leituraValor();
                    value *= DOLLAR_ VALUE;
                    outputTextView.setText(String.value0f(value));
                }
            }
        }
    }

    @Override
    public void onClick(View view) {

    }
}