package com.example.junio.quizzappnotpicture;

public class Questao {

    public String mQuestoes[] ={

              "Em qual seriado existe essa frase: O norte se lembra?",
              "Em qual ano foi lançado o filme matrix??",
              "Qual ano foi lançado o filme Star War?",
              "Qual nome do personagem principal da saga do Senhor dos Aneis?",
              "Qual nome do personagem principal do quadrinho hellblazer?",
              "Qual personagem  matou todo seu clã em no manga Naruto?",
              "Qual nome do personagem Principal do anime OnePushMan?",
               "Qual foi o primeiro pais que o Ragnar Lothbrok invadiu?",
               "Qual o nome do Planeta que o mestre Yoda Ficou em Exilio?",
               "Qual Personagem Anti-heroi que é conhecido como: Soldado do Inferno"

    };

      public  String mChoice[] [] = {

              {"Popey","Fantastico mundo de Bob","Game Of Thrones", "Barrados no Baile"},
              {"1999","2000","2010","2008"},
              {"1977","1978","1960","1980"},
              {"Frodo","Gandalf","Legolas", "Smigol"},
              {"Constantine","Papa Meia Noite","Sarah", "Sandman"},
              {"Sasuke","Madara","Kakashi Hitake", "Itachi Uchiha"},
              {"Saitama","Mumen Rider","Máscara Doce", "Cão de Guarda"},
              {"Brasil","França","Espanha", "Inglaterra"},
              {"Plutão","Saturno","Nebirus", "Dagobah "},
              {"Super -Homem","Batman","Spawn", "Comediante"},

      };

      public String mrespostaCertas [] ={"Game Of Thrones","1999","1977","Frodo","Constantine",
              "Itachi Uchiha","Saitama","Inglaterra","Dagobah","Spawn"};

    public String getQuestion(int a){
        String question = mQuestoes[a];

        return question;
    }

    public String getescolha1(int a){

        String escolha = mChoice[a][0];
        return escolha;
    }
    public String getescolha2(int a){

        String escolha = mChoice[a][1];
        return escolha;
    }
    public String getescolha3(int a){

        String escolha = mChoice[a][2];
        return escolha;
    }
    public String getescolha4(int a){

        String escolha = mChoice[a][3];
        return escolha;
    }

    public String getPerguntaCerta(int a){
        String perguntacerta = mrespostaCertas[a];

        return perguntacerta;
    }
}
