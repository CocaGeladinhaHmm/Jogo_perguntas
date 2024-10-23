public class Jogador extends Personagem {
  
  //Atributos
  private int escolha;
  private int vida;
  private char quiz;

  //Construtor
  public Jogador(String nome) {
    super(nome, 0);
    this.vida = 100;
    this.escolha = 0;
    this.quiz = 'z';
  }

  //Gets
  public String getNome() {
    return nome;
  }
  
  public int getEscolha() {
    return escolha;
  }

  public int getVida() {
    return vida;
  }

  public char getQuiz() {
    return quiz;
  }


  //Sets
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setEscolha(int escolha) {
    this.escolha = escolha;
  }

  public void setQuiz(char quiz) {
    this.quiz = quiz;
  }


  //vida
  public void reduzirVida() {
    vida = (vida - 10);
  }
}