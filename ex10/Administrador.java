public class Administrador implements Autenticavel {
    private String nome;
    private String login;
    private String senha;
    private String nivel;
    
    public Administrador(String nome, String login, String senha, String nivel) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getLogin() {
        return login;
    }
    
    public String getNivel() {
        return nivel;
    }
    
    @Override
    public boolean autenticar(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Administrador " + nome + " autenticado com sucesso!");
            System.out.println("Nivel de acesso: " + nivel);
            return true;
        } else {
            System.out.println("Falha na autenticacao do administrador " + nome);
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Administrador: " + nome + " (Login: " + login + ", Nivel: " + nivel + ")";
    }
}