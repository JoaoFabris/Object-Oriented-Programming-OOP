import java.util.ArrayList;
import java.util.List;

public class SistemaAutenticacao {
    public static void main(String[] args) {
        // Criando usuarios e administradores
        List<Autenticavel> usuarios = new ArrayList<>();
        
        usuarios.add(new Usuario("João Silva", "joao", "123456"));
        usuarios.add(new Usuario("Maria Santos", "maria", "senha123"));
        usuarios.add(new Administrador("Carlos Admin", "carlos", "admin123", "Master"));
        usuarios.add(new Administrador("Ana Gerente", "ana", "gerente456", "Supervisor"));
        usuarios.add(new Usuario("Pedro Costa", "pedro", "pedro789"));
        
        System.out.println("=== SISTEMA DE AUTENTICACAO ===");
        System.out.println("Empresa de Tecnologia XYZ");
        System.out.println("Total de usuarios cadastrados: " + usuarios.size());
        System.out.println();
        
        // Listando todos os usuarios
        System.out.println("=== USUARIOS CADASTRADOS ===");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + ". " + usuarios.get(i).toString());
        }
        
        // Testando autenticacao com senhas corretas
        System.out.println("\n=== TESTE DE AUTENTICACAO - SENHAS CORRETAS ===");
        String[] senhasCorretas = {"123456", "senha123", "admin123", "gerente456", "pedro789"};
        
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.print((i + 1) + ". ");
            usuarios.get(i).autenticar(senhasCorretas[i]);
        }
        
        // Testando autenticacao com senhas incorretas
        System.out.println("\n=== TESTE DE AUTENTICACAO - SENHAS INCORRETAS ===");
        String[] senhasIncorretas = {"wrong", "123", "admin", "super", "000"};
        
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.print((i + 1) + ". ");
            usuarios.get(i).autenticar(senhasIncorretas[i]);
        }
        
        // Simulando login no sistema
        System.out.println("\n=== SIMULACAO DE LOGIN ===");
        simularLogin(usuarios);
        
        // Contando tipos de usuario
        System.out.println("\n=== ESTATISTICAS ===");
        contarTiposUsuario(usuarios);
    }
    
    public static void simularLogin(List<Autenticavel> usuarios) {
        System.out.println("Tentando fazer login com usuarios...");
        
        // Senhas para teste
        String[] senhasTeste = {"123456", "wrong", "admin123", "wrong", "pedro789"};
        
        int sucessos = 0;
        int falhas = 0;
        
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("\nTentativa de login " + (i + 1) + ":");
            boolean sucesso = usuarios.get(i).autenticar(senhasTeste[i]);
            
            if (sucesso) {
                System.out.println("-> ACESSO LIBERADO");
                sucessos++;
            } else {
                System.out.println("-> ACESSO NEGADO");
                falhas++;
            }
        }
        
        System.out.println("\nResultado:");
        System.out.println("Logins bem-sucedidos: " + sucessos);
        System.out.println("Logins falharam: " + falhas);
    }
    
    public static void contarTiposUsuario(List<Autenticavel> usuarios) {
        int usuariosComuns = 0;
        int administradores = 0;
        
        for (Autenticavel user : usuarios) {
            if (user instanceof Usuario) {
                usuariosComuns++;
            } else if (user instanceof Administrador) {
                administradores++;
            }
        }
        
        System.out.println("Usuarios comuns: " + usuariosComuns);
        System.out.println("Administradores: " + administradores);
        System.out.println("Total: " + usuarios.size());
    }
}