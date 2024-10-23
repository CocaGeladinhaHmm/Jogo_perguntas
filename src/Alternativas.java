public class Alternativas {
  private String enunciado_A;
  private boolean status;
  private char IDA;

  //Metodo construtor
  public Alternativas (char IDA, String enunciado_A, boolean status){
     this.IDA = IDA;
     this.enunciado_A = enunciado_A;
     this.status = status;
  }
  //Get
  public char getIDA() {
    return IDA;
  }
  
  public String getEnunciadoA() {
    return enunciado_A;
  }

  public boolean getStatus() {
     return status;
  }
}