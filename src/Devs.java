import java.util.Scanner;

class Devs {
  public static void main(String[] args) {

    Scanner Input = new Scanner(System.in);


    //informaçoes dos devs
    System.out.println("devs:");
    System.out.println();
    System.out.println("João Gabriel");
    System.out.println("Marcelo barbudo");
    System.out.println("Marcelo Augusto");
    System.out.println("Breno Grant");
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