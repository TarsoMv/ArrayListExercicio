public class Livro implements Comparable<Livro>  {
    private String autor;
    private String nome;
    private int ano;

    public Livro(String autor, String nome, int ano) {
        this.autor = autor;
        this.nome = nome;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                '}';
    }

    @Override
    public int compareTo(Livro livro) {
        return this.getNome().compareTo(livro.getNome());
    }
}
