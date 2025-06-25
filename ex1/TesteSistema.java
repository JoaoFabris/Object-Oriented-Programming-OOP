public class TesteSistema {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", 2023, 4, "Flex");
        Moto moto = new Moto("CB 600", 2022, 600, "Disco");

        System.out.println(carro);
        carro.abrirPortaMalas();

        System.out.println(moto);
        moto.empinar();
    }
}