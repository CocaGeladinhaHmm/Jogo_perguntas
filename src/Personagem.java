public class Personagem {
  protected String nome;
  private final int ID;
    
   //construtor 
  public Personagem(String nome, int ID) {
    this.nome = nome;
    this.ID = ID;
  }

  //Gets
  public String getNome() {
    return nome;
  }

  public int getID() {
    return ID;
  }
}