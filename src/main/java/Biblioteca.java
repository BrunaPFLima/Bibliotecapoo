import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    public void listarLivros() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            String status = livro.isDisponivel() ? "Disponível" : "Indisponível";
            System.out.println("- " + livro.getTitulo() + " por " + livro.getAutor() + " (" + status + ")");
        }
    }

    public void listarUsuarios() {
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println("- " + usuario.getNome() + " (" + usuario.getEmail() + ")");
        }
    }
}
