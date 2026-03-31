import java.util.Stack;
public class Pila {
    private Stack<Post> pila ;

    public Pila(){
        pila = new Stack<>();
    }
    public void push(Post dato){
        pila.push(dato);
    }
    public Post pop() throws Exception{
        if (pila.isEmpty())
            throw new Exception ("No hay elementos en la pila");
        return pila.pop();
    }
    public Post peek() throws Exception {
        if (pila.isEmpty())
            throw new Exception("Pila sin elementos");
        return pila.peek();
    }
    public String listarTodos(){
        String resultado = "";
        for (int i =pila.size()-1;i>=0;i--){
            resultado += pila.get(i).toString();
        }
        return resultado.length()!=0?resultado:"No hay elementos";
    }

}
