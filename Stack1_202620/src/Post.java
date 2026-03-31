public class Post {
    private String titulo;
    private String mensaje;

    public Post(String mensaje, String titulo) {
        this.mensaje = mensaje;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Titulo:'" + titulo + '\'' + ", mensaje:'" + mensaje + '\'' + "\n";
    }
}
