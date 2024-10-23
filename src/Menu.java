import java.util.Scanner;
  
public class Menu {

  public static void main(String[] args) {

    Scanner Input = new Scanner(System.in);

    int menu = 0;
    while(menu != 4) {
      System.out.println();
      System.out.println();
      System.out.println("-----------------------");
      System.out.println("| VOCÊ FAZ PROGRAMA?? |");
      System.out.println("-----------------------");
      System.out.println();
      System.out.println("1: Iniciar jogo.");
      System.out.println("2: informações dos devs.");
      System.out.println("3: Explicação do jogo.");
      System.out.println("4: Sair do jogo.");
      System.out.println();
      
      menu = Input.nextInt();

      switch(menu) {
        case 1:
          System.out.println();
          System.out.println();
          Jogo.main(args);
          break;
          
        case 2:
          System.out.println();
          System.out.println();
          Devs.main(args);
          break;
          
        case 3:
          System.out.println();
          System.out.println();
          Infos.main(args);
          break;
          
        case 4:
          break;
          
        default:
          System.out.println();
          System.out.println();
          System.out.println("Opção invalida.");
          System.out.println();
          System.out.println();
          break;
      }
    }
  }
}