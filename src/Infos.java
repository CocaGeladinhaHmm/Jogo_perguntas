import java.util.Scanner;

class Infos {
  public static void main(String[] args) {

    Scanner Input = new Scanner(System.in);


    //informações do jogo
    System.out.println("Este é um jogo de perguntas e respostas sobre conhecimentos gerais sobre programação entre 2(dois) jogadores, ao inicio do jogo os jogadores escolherão um personagem e a partir dai os jogadores serão referidos pelos nomes dos personagens escolhidos, cada jogador possui 100% de vida e a cada resposta que um jogador responder errado ele perdera 10% de vida, o mesmo vale caso o jogador escolha uma opção invalida(inexistente), quando um jogador zera sua vida ele perde e seu adversario vence. Caso as perguntas acabem e nenhum dos jogadores tiver zerado a vida, o jogo termina em empate independente da porcentagem de vida restante.");
    System.out.println();
    System.out.println();


    //volta ao menu inicial
    int menu = 1;
    while(menu != 0) {
      System.out.println("Digite 0(zero) para voltar ao menu inicial.");
      System.out.println();
      menu = Input.nextInt();

      switch(menu) {
        case 0:
          break;

        default:
          System.out.println();
          System.out.println("Opção invalida.");
          System.out.println();
          break;
      }
    }
  }
}