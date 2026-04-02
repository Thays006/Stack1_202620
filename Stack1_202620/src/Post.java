public class Post {
    private String titulo;
    private String mensaje;
    private int contLikes;

    public Post(String titulo, String mensaje) {
        this.mensaje = mensaje;
        this.titulo = titulo;
        contLikes = 0;

    }
    public void aumentarLikes(){
        contLikes++;
    }
    public void ResetearLikes(){
        contLikes = 0;
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
        return "Titulo:'" + titulo + '\'' + ", mensaje:'" + mensaje + '\'' + "\n" + "Likes: " + contLikes+ "\n";
    }
}
