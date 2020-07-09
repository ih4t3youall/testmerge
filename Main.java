public class Main {


  public static void main(String [] args){
    new Main();
  }

  public Main(){
    System.out.println(sum(2,3));
    System.out.println(resta(2,3));
    System.out.println(mult(2,3));
    System.out.println(division(2,3));
  }

  private int sum(int a, int b){
    return a+b;
  }

  private int resta(int a, int b){
    int vara = a;
    int varb = b;
    int result = vara-varb;
    return result;
  }

  private int mult(int a, int b){
    int vara = a;
    int varb = b;
    int result = vara * varb;
    return result;
  }

  private int division(int a , int b){
    return a/b;
  }
}
