public class Main {
    public static void main(String[] args) {
        // Cria uma nova instância da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adiciona alguns livros à biblioteca
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "1234567890");
        Livro livro2 = new Livro("1984", "George Orwell", "0987654321");
        Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", "1122334455");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Cadastra usuários
        Usuario usuario1 = new UsuarioNormal("Alice", "alice@email.com");
        Usuario usuario2 = new UsuarioPremium("Bob", "bob@email.com");

        biblioteca.cadastrarUsuario(usuario1);
        biblioteca.cadastrarUsuario(usuario2);

        // Lista os livros e usuários cadastrados
        biblioteca.listarLivros();
        biblioteca.listarUsuarios();

        // Realiza empréstimos e devoluções
        usuario1.emprestarLivro(livro1); // Alice tenta pegar "O Senhor dos Anéis"
        usuario2.emprestarLivro(livro1); // Bob tenta pegar "O Senhor dos Anéis" já emprestado
        usuario1.devolverLivro(livro1); // Alice devolve "O Senhor dos Anéis"
        usuario2.emprestarLivro(livro1); // Bob tenta novamente pegar "O Senhor dos Anéis"

        biblioteca.listarLivros(); // Lista os livros novamente para ver o status atualizado
    }
}
