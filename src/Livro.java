public class Livro {

    private String nome;
    private Integer codigo;
    private String autor;

    public Livro(String nome, Integer codigo, String autor){
        this.nome = nome;
        this.codigo = codigo;
        this.autor = autor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
