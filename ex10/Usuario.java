public class Usuario implements Autenticavel {
    private String nome;
    private String login;
    private String senha;
    
    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getLogin() {
        return login;
    }
    
    @Override
    public boolean autenticar(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Usuario " + nome + " autenticado com sucesso!");
            return true;
        } else {
            System.out.println("Falha na autenticacao do usuario " + nome);
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Usuario: " + nome + " (Login: " + login + ")";
    }
}