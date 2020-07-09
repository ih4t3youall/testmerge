import java.util.LinkedList;

public class inicio{


  public inicio(){
    List<String> lista = new LinkedList<>();
    lista.add("elemento1");
    lista.add("elemento2");
    lista.add("elemento3");
    doSomething()
  }

  private void doSomething(List<String> lista){
    lista.forEach(s-> System.out.println(s));
  }

}
