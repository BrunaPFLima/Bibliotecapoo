# BibliotecaPOO

Este é um projeto simples de gerenciamento de biblioteca, desenvolvido em Java para praticar os conceitos fundamentais da Programação Orientada a Objetos (POO). 

## Descrição do Projeto

O sistema de biblioteca permite a gestão de livros e usuários. Usuários podem emprestar e devolver livros, e o sistema controla a disponibilidade dos livros na biblioteca.

### Funcionalidades

- **Adicionar Livros**: Adicione novos livros à coleção da biblioteca.
- **Cadastrar Usuários**: Cadastrar usuários como normais ou premium.
- **Empréstimo de Livros**: Usuários podem solicitar o empréstimo de livros.
- **Devolução de Livros**: Usuários podem devolver livros que foram emprestados.
- **Listar Livros e Usuários**: Liste todos os livros e usuários cadastrados na biblioteca.

## Estrutura do Código

O projeto é composto pelas seguintes classes:

- `Livro`: Representa um livro na biblioteca.
- `Usuario`: Classe abstrata que serve como base para os tipos de usuários.
- `UsuarioNormal`: Herda de `Usuario` e representa um usuário padrão.
- `UsuarioPremium`: Herda de `Usuario` e representa um usuário premium com vantagens adicionais.
- `Biblioteca`: Gerencia os livros e usuários, além de controlar os empréstimos e devoluções.
- `Main`: Classe principal que contém o método `main` para executar o sistema.

## Como Executar

1. Clone o repositório para sua máquina local:

   ```bash
   git clone

