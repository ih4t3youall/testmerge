public class Main {


  public static void main(String [] args){
  
    new Main();
  }

  public Main(){
  
    int a = 2;
    int b = 3;
    int result = sum(a,b);
    System.out.println(result);
  
  }

  private int sum(int a, int b){
  
    int vara = a;
    int varb = b;
    int result = vara + varb;
    return result;
  
  }


}
