package com.example.junio.quizzappnotpicture;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button resposta1, resposta2, resposta3, resposta4; // Criamdo as variavéis dos buttons da view
    TextView pontos, question;
    private Questao mQuestions = new Questao();

    private String mEscolha;
    private int mPontos =0;
    private int mQuestionsLenght = mQuestions.mQuestoes.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        resposta1 = (Button) findViewById(R.id.resposta1);
        resposta2 = (Button) findViewById(R.id.resposta2);
        resposta3 = (Button) findViewById(R.id.resposta3);
        resposta4 = (Button) findViewById(R.id.resposta4);

        pontos = (TextView) findViewById(R.id.pontos);
        question = (TextView) findViewById(R.id.question);

        pontos.setText("Pontos" + mPontos);

        updateQuestao(r.nextInt(mQuestionsLenght));


        resposta1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                if (resposta1.getText() == mEscolha) {
                    mPontos++;
                    pontos.setText("Pontos" + mPontos);
                    updateQuestao(r.nextInt(mQuestionsLenght));
                } else {

                    FimdoJogo();
                }


            }

        });

        resposta2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                if (resposta2.getText() == mEscolha) {
                    mPontos++;
                    pontos.setText("Pontos" + mPontos);
                    updateQuestao(r.nextInt(mQuestionsLenght));
                } else {

                    FimdoJogo();
                }

            }

        });
        resposta3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                if (resposta3.getText() == mEscolha) {
                    mPontos++;
                    pontos.setText("Pontos" + mPontos);
                    updateQuestao(r.nextInt(mQuestionsLenght));
                } else {

                    FimdoJogo();
                }

            }

        });
        resposta4.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                if (resposta4.getText() == mEscolha) {
                    mPontos++;
                    pontos.setText("Pontos" + mPontos);
                    updateQuestao(r.nextInt(mQuestionsLenght));
                } else {

                    FimdoJogo();
                }

            }

        });

    }

    private void updateQuestao(int num) {

        question.setText(mQuestions.getQuestion(num));
        resposta1.setText(mQuestions.getescolha1(num));
        resposta2.setText(mQuestions.getescolha2(num));
        resposta3.setText(mQuestions.getescolha3(num));
        resposta4.setText(mQuestions.getescolha4(num));

        mEscolha= mQuestions.getPerguntaCerta(num);
    }

    public void FimdoJogo() {

        AlertDialog.Builder alertDialogBulder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBulder
                .setMessage("Fim do Jogo! Sua Pontuação é " + mPontos + "Pontos.")
                .setCancelable(false)
                .setPositiveButton("NOVO JOGO",

                        new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                finish();

                            }
                        })
                .setNegativeButton("SAIR",
                        new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }

                        });

        AlertDialog alertDialog = alertDialogBulder.create();
        alertDialog.show();
    }

}