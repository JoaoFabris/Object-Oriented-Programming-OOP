# Object-Oriented-Programming-OOP
📚 Exercícios de Programação Orientada a Objetos (POO) em Java
Este repositório contém uma série de exercícios práticos de Programação Orientada a Objetos desenvolvidos em Java, abordando conceitos fundamentais como herança, polimorfismo, encapsulamento, interfaces e classes abstratas.

🎯 Objetivos
Demonstrar conceitos fundamentais de POO
Aplicar herança e polimorfismo em cenários reais
Implementar interfaces e classes abstratas
Desenvolver sistemas práticos com Java
📋 Lista de Exercícios
1. Sistema de Veículos Básico
Conceitos: Herança, Encapsulamento

Classe base Veiculo
Subclasses Carro e Moto
Métodos específicos para cada tipo de veículo
2. Catálogo de Animais
Conceitos: Herança, Polimorfismo

Classe base Animal
Subclasses Mamifero, Ave e Peixe
Características específicas de cada espécie
3. Sistema Bancário
Conceitos: Herança, Encapsulamento

Classe base ContaBancaria
Subclasses ContaCorrente e ContaPoupanca
Operações bancárias específicas
4. Impressão de Veículos
Conceitos: Polimorfismo, Sobrescrita de métodos

Extensão do exercício 1
Método toString() personalizado
Sistema de impressão de informações
5. Sons dos Animais
Conceitos: Polimorfismo, Sobrescrita de métodos

Extensão do exercício 2
Método emitirSom() específico para cada animal
Demonstração de comportamentos únicos
6. Calculadora com Polimorfismo
Conceitos: Sobrecarga de métodos (Method Overloading)

Múltiplas versões dos métodos de cálculo
Suporte a diferentes tipos de dados
Flexibilidade na utilização
7. Formas Geométricas
Conceitos: Classes abstratas, Métodos abstratos

Classe abstrata FormaGeometrica
Subclasses Circulo, Retangulo e Triangulo
Cálculos matemáticos específicos
8. Lista de Sons de Animais
Conceitos: Collections, Polimorfismo

Uso de ArrayList para armazenar animais
Iteração e polimorfismo em coleções
Sistema interativo de reconhecimento
9. Aplicação de Juros Bancários
Conceitos: Classes abstratas, Polimorfismo

Extensão do exercício 3
Método abstrato aplicarJuros()
Diferentes estratégias de juros por tipo de conta
10. Sistema de Autenticação
Conceitos: Interfaces, Polimorfismo

Interface Autenticavel
Classes Usuario e Administrador
Sistema de segurança e controle de acesso
🚀 Como Executar
Pré-requisitos
Java JDK 8 ou superior
Terminal/Prompt de comando
Executando um exercício
bash
Copiar

# Navegue até a pasta do exercício desejado
cd ex1

# Compile todos os arquivos Java
javac *.java

# Execute a classe principal
java TesteSistema
Classes principais por exercício:
ex1: java TesteSistema
ex2: java CatalogoAnimais
ex3: java SistemaBancario
ex4: java TesteImpressaoVeiculos
ex5: java TesteSonsAnimais
ex6: java TesteCalculadora
ex7: java CalculadoraGeometrica
ex8: java ListaSonsAnimais
ex9: java SistemaJurosBancarios
ex10: java SistemaAutenticacao
📁 Estrutura do Projeto
📦 poo-exercicios-java
├── 📁 ex1/
│   ├── Veiculo.java
│   ├── Carro.java
│   ├── Moto.java
│   └── TesteSistema.java
├── 📁 ex2/
│   ├── Animal.java
│   ├── Mamifero.java
│   ├── Ave.java
│   ├── Peixe.java
│   └── CatalogoAnimais.java
├── 📁 ex3/
│   ├── ContaBancaria.java
│   ├── ContaCorrente.java
│   ├── ContaPoupanca.java
│   └── SistemaBancario.java
└── ... (demais exercícios)
🔧 Conceitos Abordados
Pilares da POO
Encapsulamento: Proteção de dados com modificadores de acesso
Herança: Reutilização de código através de hierarquia de classes
Polimorfismo: Comportamentos diferentes para métodos com mesmo nome
Abstração: Classes abstratas e interfaces
Recursos Java
Classes e Objetos
Herança com extends
Interfaces com implements
Classes abstratas
Sobrescrita de métodos (@Override)
Sobrecarga de métodos
Collections (ArrayList)
Operador instanceof
Modificadores de acesso
🎓 Objetivos de Aprendizagem
Ao completar estes exercícios, você será capaz de:

✅ Criar hierarquias de classes eficientes
✅ Implementar polimorfismo em cenários reais
✅ Utilizar interfaces para definir contratos
✅ Trabalhar com classes abstratas
✅ Aplicar encapsulamento adequadamente
✅ Desenvolver sistemas orientados a objetos
✅ Utilizar collections com polimorfismo
🌟 Destaques dos Exercícios
🚗 Sistema de Veículos
Demonstra herança básica com características específicas de carros e motos.

🐾 Catálogo de Animais
Explora polimorfismo com diferentes espécies e seus comportamentos únicos.

🏦 Sistema Bancário
Implementa lógica de negócio real com diferentes tipos de contas.

🔢 Calculadora Polimórfica
Mostra sobrecarga de métodos para flexibilidade de uso.

📐 Formas Geométricas
Utiliza classes abstratas para cálculos matemáticos precisos.

🔐 Sistema de Autenticação
Implementa interfaces para controle de acesso e segurança.

🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para:

Reportar bugs
Sugerir melhorias
Adicionar novos exercícios
Melhorar a documentação
📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

👨‍💻 Autor
Desenvolvido como material didático para estudo de Programação Orientada a Objetos em Java.
