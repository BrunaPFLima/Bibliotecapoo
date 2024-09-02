public class UsuarioNormal extends Usuario {

    public UsuarioNormal(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
        } else {
            System.out.println("Usuário Normal: Livro não disponível.");
        }
    }
}
