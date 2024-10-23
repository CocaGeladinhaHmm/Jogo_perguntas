import java.util.ArrayList;

public class Pergunta {

  //Atributos
  private String enunciado;
  private ArrayList<Alternativas> alternativas;
  char opcaoCorreta;

  //Construtor
  public Pergunta(String enunciado, ArrayList<Alternativas> alternativas, char opcaoCorreta) {
    this.enunciado = enunciado;
    this.alternativas = alternativas;
    this.opcaoCorreta = opcaoCorreta;
  }
    
  //Gets
  public String getEnunciado() {
    return enunciado;
  }

  public ArrayList<Alternativas> getAlternativas() {
    return alternativas;
  }

  public char getOpcaoCorreta() {
    return opcaoCorreta;
  }
}