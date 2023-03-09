import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros = new ArrayList<Livro>();
    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean addLivros(Livro livro){
        try{
            this.livros.add(livro);
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public Boolean delLivros(Integer cod){
        for (Livro livro: livros){
            if (livro.getCodigo() == cod){
                livros.remove(livro);
                return true;
            }
        }
        return false;
    }

    public void getLivros(){
        for (Livro livro: livros){
            System.out.println(livro.getNome());
        }
    }
}
