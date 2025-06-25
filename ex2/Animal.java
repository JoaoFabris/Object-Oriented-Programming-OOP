public class Animal {
    protected String nome;
    protected String especie;
    protected int idade;
    protected double peso;
    
    public Animal(String nome, String especie, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }
    
    public void comer() {
        System.out.println(nome + " está comendo...");
    }
    
    @Override
    public String toString() {
        return nome + " (" + especie + ") - " + idade + " anos - " + peso + "kg";
    }
}