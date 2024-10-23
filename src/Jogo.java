import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

public static void pausarPorSegundo() {
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

  
  public static void main(String[] args) {

    Scanner Input = new Scanner(System.in);
    Random random = new Random();


    boolean Finalizar = true;
    while(Finalizar) {
      
      Jogador Jogador1 = new Jogador("Jogador 1");
      Jogador Jogador2 = new Jogador("Jogador 2");

      
      Personagem Personagem1 = new Personagem("Ada Lovelace", 1);
      Personagem Personagem2 = new Personagem("Jacquard", 2);
      Personagem Personagem3 = new Personagem("Alan Turing", 3);
      Personagem Personagem4 = new Personagem("Mary Kenneth Keller", 4);
      
      
      ArrayList<Personagem> personagens = new ArrayList<Personagem>();
      personagens.add(Personagem1);
      personagens.add(Personagem2);
      personagens.add(Personagem3);
      personagens.add(Personagem4);
      
        System.out.println("O jogador mais velho será o Jogador 1, ou seja, o jogador mais velho ira começar.");
        System.out.println("");
        System.out.println("Caso os dois jogadores possuirem a mesma idade, devem decidir quem ira começar jogando cara ou coroa.");
        
        System.out.println("");
        System.out.println("");

        pausarPorSegundo();
        pausarPorSegundo();

      //Jogador1 escolhe o personagem
      System.out.println(Jogador1.getNome());
      System.out.println("Os personagens disponiveis são:");
      System.out.println();
      for(Personagem i : personagens) {
        System.out.println(i.getID() + ": " + i.getNome());
      }
      
      System.out.println();
      
      Jogador1.setEscolha(Input.nextInt());
      for(Personagem i : personagens) {
        if(Jogador1.getEscolha() == i.getID()) {
          Jogador1.setNome(i.getNome());  
        }
      }
      
      if(Jogador1.getEscolha() > 4 || Jogador1.getEscolha() < 1) {
        System.out.println();
        System.out.println("Opção invalida.");
        System.out.println();
        System.out.println();
        continue;
      }
      
      System.out.println();
      System.out.println("O Jogador 1 escolheu: " + Jogador1.getNome());
      System.out.println();
      System.out.println();

      
      //jogador2 ecolhe o personagem
      System.out.println(Jogador2.getNome());
      System.out.println("Os personagens disponiveis são:");
      System.out.println();
      for(Personagem i : personagens) {
        if(Jogador1.getNome() != i.getNome()) {
          System.out.println(i.getID() + ": " + i.getNome());
        }
      }
      
      System.out.println();

      Jogador2.setEscolha(Input.nextInt());
      for(Personagem i : personagens) {
        if(Jogador2.getEscolha() == i.getID()) {
          Jogador2.setNome(i.getNome());
        }
      }
      
      if(Jogador2.getEscolha() > 4 || Jogador2.getEscolha() < 1 || Jogador2.getNome() == Jogador1.getNome()) {
        System.out.println();
        System.out.println("Opção invalida.");
        System.out.println();
        System.out.println();
        continue;
      }
      
      System.out.println();
      System.out.println("O Jogador 2 escolheu: " + Jogador2.getNome());
      System.out.println();
      System.out.println();


      //criação das perguntas
      ArrayList<Alternativas> P00 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P01 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P02 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P03 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P04 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P05 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P06 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P07 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P08 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P09 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P10 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P11 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P12 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P13 = new ArrayList<Alternativas>();
      ArrayList<Alternativas> P14 = new ArrayList<Alternativas>();
      
      Pergunta[] perguntas = new Pergunta[15];
      
      perguntas[0] = new Pergunta("Qual é a forma correta de declarar uma variável em Java?", P00, 'c');
      Alternativas P00A1 = new Alternativas('a', "var nomeVariavel = 10;", false);
      Alternativas P00A2 = new Alternativas('b', "string nomeVariavel = ''Hello'';", false);
      Alternativas P00A3 = new Alternativas('c', "int nomeVariavel = 5;", true);
      P00.add(P00A1);
      P00.add(P00A2);
      P00.add(P00A3);

      perguntas[1] = new Pergunta("O que é um método em Java?", P01, 'a');
      Alternativas P01A1 = new Alternativas('a', "Um bloco de código que realiza uma tarefa específica.", true);
      Alternativas P01A2 = new Alternativas('b', "Uma instrução condicional.", false);
      Alternativas P01A3 = new Alternativas('c', "Uma variável que armazena um valor.", false);
      P01.add(P01A1);
      P01.add(P01A2);
      P01.add(P01A3);

      perguntas[2] = new Pergunta("Como você cria um loop ''for'' em Java?", P02, 'b');
      Alternativas P02A1 = new Alternativas('a', "loop (int i = 0; i < 10; i++) { }", false);
      Alternativas P02A2 = new Alternativas('b', "for (int i = 0; i < 10; i++) { }", true);
      Alternativas P02A3 = new Alternativas('c', "for (i = 0; i < 10; i++) { }", false);
      P02.add(P02A1);
      P02.add(P02A2);
      P02.add(P02A3);

      perguntas[3] = new Pergunta("Qual é a diferença entre os operadores de comparação ''=='' e ''.equals()'' em Java?", P03, 'c');
      Alternativas P03A1 = new Alternativas('a', "Ambos os operadores comparam o conteúdo de duas strings.", false);
      Alternativas P03A2 = new Alternativas('b', "O operador ''=='' compara o conteúdo de duas strings, enquanto ''.equals()'' compara as referências dos objetos.", false);
      Alternativas P03A3 = new Alternativas('c', "O operador ''=='' compara as referências dos objetos, enquanto ''.equals()'' compara o conteúdo de duas strings.", false);
      P03.add(P03A1);
      P03.add(P03A2);
      P03.add(P03A3);

      perguntas[4] = new Pergunta("O que é um array em Java?", P04, 'c');
      Alternativas P04A1 = new Alternativas('a', "Uma classe que representa uma estrutura de dados.", false);
      Alternativas P04A2 = new Alternativas('b', "Uma variável que armazena um único valor.", false);
      Alternativas P04A3 = new Alternativas('c', "Uma coleção de elementos do mesmo tipo.", true);
      P04.add(P04A1);
      P04.add(P04A2);
      P04.add(P04A3);

      perguntas[5] = new Pergunta("Qual é a forma correta de chamar um método em Java?", P05, 'b');
      Alternativas P05A1 = new Alternativas('a', "methodname;", false);
      Alternativas P05A2 = new Alternativas('b', "methodname();", true);
      Alternativas P05A3 = new Alternativas('c', "methodname{}", false);
      P05.add(P05A1);
      P05.add(P05A2);
      P05.add(P05A3);

      perguntas[6] = new Pergunta("O que é um objeto em Java?", P06, 'c');
      Alternativas P06A1 = new Alternativas('a', "Um bloco de código que realiza uma tarefa específica", false);
      Alternativas P06A2 = new Alternativas('b', "Uma variável que armazena um valor inteiro.", false);
      Alternativas P06A3 = new Alternativas('c', "Uma instância de uma classe que possui propriedades e comportamentos.", true);
      P06.add(P06A1);
      P06.add(P06A2);
      P06.add(P06A3);

      perguntas[7] = new Pergunta("Como você lê dados de entrada do usuário em Java?", P07, 'c');
      Alternativas P07A1 = new Alternativas('a', "readLine();", false);
      Alternativas P07A2 = new Alternativas('b', "nextLine();", false);
      Alternativas P07A3 = new Alternativas('c', "Scanner.nextLine();", true);
      P07.add(P07A1);
      P07.add(P07A2);
      P07.add(P07A3);

      perguntas[8] = new Pergunta("Qual é o operador lógico correto para ''ou'' em Java?", P08, 'b');
      Alternativas P08A1 = new Alternativas('a', "&&", false);
      Alternativas P08A2 = new Alternativas('b', "||", true);
      Alternativas P08A3 = new Alternativas('c', "//", false);
      P08.add(P08A1);
      P08.add(P08A2);
      P08.add(P08A3);

      perguntas[9] = new Pergunta("Como você converte um valor inteiro para uma string em Java?", P09, 'a');
      Alternativas P09A1 = new Alternativas('a', "Integer.toString(valor);", true);
      Alternativas P09A2 = new Alternativas('b', "valor.toString();", false);
      Alternativas P09A3 = new Alternativas('c', "String.valueOf(valor);", false);
      P09.add(P09A1);
      P09.add(P09A2);
      P09.add(P09A3);

      perguntas[10] = new Pergunta("Qual é o resultado da expressão 10 % 3 em Java?", P10, 'a');
      Alternativas P10A1 = new Alternativas('a', "1", true);
      Alternativas P10A2 = new Alternativas('b', "2", false);
      Alternativas P10A3 = new Alternativas('c', "3", false);
      P10.add(P10A1);
      P10.add(P10A2);
      P10.add(P10A3);

      perguntas[11] = new Pergunta("Qual é a diferença entre uma classe abstrata e uma interface em Java?", P11, 'c');
      Alternativas P11A1 = new Alternativas('a', "Uma classe abstrata pode ser instanciada, enquanto uma interface não pode.", false);
      Alternativas P11A2 = new Alternativas('b', "Uma classe abstrata pode implementar métodos, enquanto uma interface não pode.", false);
      Alternativas P11A3 = new Alternativas('c', "Uma classe abstrata pode ter métodos implementados e campos, enquanto uma interface só pode ter métodos não implementados.", true);
      P11.add(P11A1);
      P11.add(P11A2);
      P11.add(P11A3);

      perguntas[12] = new Pergunta("O que é um construtor em Java?", P12, 'a');
      Alternativas P12A1 = new Alternativas('a', "Um método especial para inicializar um objeto.", true);
      Alternativas P12A2 = new Alternativas('b', "Uma estrutura de controle condicional.", false);
      Alternativas P12A3 = new Alternativas('c', "Uma classe que estende outra classe.", false);
      P12.add(P12A1);
      P12.add(P12A2);
      P12.add(P12A3);

      perguntas[13] = new Pergunta("Qual é o tipo de retorno do método ''main''' em Java?", P13, 'b');
      Alternativas P13A1 = new Alternativas('a', "int", false);
      Alternativas P13A2 = new Alternativas('b', "void", true);
      Alternativas P13A3 = new Alternativas('c', "String", false);
      P13.add(P13A1);
      P13.add(P13A2);
      P13.add(P13A3);

      perguntas[14] = new Pergunta("Como você compila um programa Java a partir da linha de comando?", P14, 'b');
      Alternativas P14A1 = new Alternativas('a', "java programa.java", false);
      Alternativas P14A2 = new Alternativas('b', "javac programa.java", true);
      Alternativas P14A3 = new Alternativas('c', "run programa.java", false);
      P14.add(P14A1);
      P14.add(P14A2);
      P14.add(P14A3);


      pausarPorSegundo();


      //Inicialização do jogo
      System.out.println("Comecemos o jogo então.");
      System.out.println();
      System.out.println();

      HashSet<Integer> perguntasFeitas = new HashSet<>();
      
      HashSet<Pergunta> perguntasDisponiveis = new HashSet<>();
      for(int i = 0; i < 15; i++) {
        perguntasDisponiveis.add(perguntas[i]);
      }

      
      while(Jogador1.getVida() > 0 && Jogador2.getVida() > 0 || !perguntasDisponiveis.isEmpty() && perguntasFeitas.size() < perguntasDisponiveis.size()) {
        int indexPergunta;
        do {
          indexPergunta = random.nextInt(perguntas.length);
        } while(perguntasFeitas.contains(indexPergunta));

        perguntasFeitas.add(indexPergunta);

        
        Pergunta pergunta = perguntas[indexPergunta];

        System.out.println(Jogador1.getNome());
        System.out.println("Vida: " + Jogador1.getVida() + "%");
      
        System.out.println();

        System.out.println(Jogador2.getNome());
        System.out.println("Vida: " + Jogador2.getVida() + "%");
        
        System.out.println();

        int enviarResposta = 1;
        while(enviarResposta != 0) {
          System.out.println("Pergunta:");
          System.out.println(pergunta.getEnunciado());

          pausarPorSegundo();
        
          System.out.println();

          System.out.println("Opções:");
          for(Alternativas j : pergunta.getAlternativas()) {
            System.out.println(j.getIDA() + ")" + j.getEnunciadoA());
          
            System.out.println();
          }
        
          System.out.println();
        
          System.out.println(Jogador1.getNome() + " faça sua escolha:");
          Jogador1.setQuiz(Input.next().charAt(0));
        
          System.out.println();

          System.out.println(Jogador2.getNome() + " faça sua escolha:");
          Jogador2 .setQuiz(Input.next().charAt(0));
        
          System.out.println();
          System.out.println();

          System.out.println("Ambos os jogadores desejam enviar as respostas? Digite 0 para sim e qualquer outro numero para não.");
          enviarResposta = Input.nextInt();

          System.out.println();
          System.out.println();
        }

        pausarPorSegundo();

        for(Alternativas j : pergunta.getAlternativas()) {
          if(j.getIDA() == pergunta.getOpcaoCorreta()) {
            System.out.println("A opção correta era:");
            System.out.println(j.getIDA() + ") " + j.getEnunciadoA());
          }
        }

        if(Jogador1.getQuiz() != pergunta.getOpcaoCorreta()) {
          Jogador1.reduzirVida();
        }

        if(Jogador2.getQuiz() != pergunta.getOpcaoCorreta()) {
          Jogador2.reduzirVida();
        }
        
        System.out.println();
        System.out.println();

        pausarPorSegundo();

        if(Jogador1.getVida() <= 0 && Jogador2.getVida() > 0) {
          System.out.println("O " + Jogador1.getNome() + (" perdeu toda sua vida."));
          System.out.println("A vitoria é do " + Jogador2.getNome());
        }

        if(Jogador2.getVida() <= 0 && Jogador1.getVida() > 0) {
          System.out.println("O " + Jogador2.getNome() + (" perdeu toda sua vida."));
          System.out.println("A vitoria é do " + Jogador1.getNome());
        }
        pausarPorSegundo();

      if(Jogador1.getVida() <= 0 && Jogador2.getVida() > 0) {
        break;
      }

      if(Jogador2.getVida() <= 0 && Jogador1.getVida() > 0) {
        break;
      }
    }

      System.out.println();
      System.out.println();

      //caso empate
      if(Jogador1.getVida() <= 0 && Jogador2.getVida() <= 0 || !perguntasDisponiveis.isEmpty() && perguntasFeitas.size() < perguntasDisponiveis.size()) {
        System.out.println("O jogo terminou em empate.");
      }
      

      //finalização ou restart
      int confirmar = 2;
      
      while(confirmar != 0 || confirmar != 1) {
        System.out.println("Deseja finalizar o jogo e voltar ao menu inicial?");
        System.out.println();
        System.out.println("Digite 1(um) para voltar e 0(zero) para jogar novamente.");
        System.out.println();
      
        confirmar = Input.nextInt();
        System.out.println();

        if(confirmar == 1) {
          Finalizar = false;
          break;
        } else if(confirmar != 0 && confirmar != 1) {
            System.out.println("Opção invalida.");
            System.out.println();
            System.out.println();
        }
      }   
    }    
  }      
}