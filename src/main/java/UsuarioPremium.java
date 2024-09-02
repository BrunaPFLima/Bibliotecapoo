public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
        } else {
            System.out.println("Usuário Premium: Livro não disponível, mas emprestado com prioridade.");
            livro.emprestar();
        }
    }
}
