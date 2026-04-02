import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel panel;
    private JTextField txtTitulo;
    private JTextArea txtMensaje;
    private JButton btnInsertar;
    private JButton btnEliminar;
    private JButton btnCima;
    private JButton btnListar;
    private JTextArea txtListarTodos;
    private JButton btnLikes;
    private JButton btnResetear;
    Pila pila1=new Pila();


    public Ventana() {
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo=txtTitulo.getText();
                String mensaje=txtMensaje.getText();
                Post obj=new Post(titulo,mensaje);
                pila1.push(obj);
                txtListarTodos.setText(pila1.listarTodos());
            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                   Post eliminar = pila1.pop();
                   JOptionPane.showMessageDialog(null, "Se eliminó"+eliminar.toString());
               }catch (Exception ex){
                   JOptionPane.showMessageDialog(null, ex.getMessage());
               }
            }
        });
        btnCima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Post mostrar=pila1.peek();
                    txtListarTodos.setText("Cima: "+mostrar.toString());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }

            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListarTodos.setText(pila1.listarTodos());
            }
        });
        btnLikes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pila1.peek().aumentarLikes();
                    txtListarTodos.setText(pila1.listarTodos());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        btnResetear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pila1.peek().ResetearLikes();
                    txtListarTodos.setText(pila1.listarTodos());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
