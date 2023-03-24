public class MoedaFactoryTest {
    public MoedaFactoryTest() {
    }

    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.gerarMoeda(Pais.Brasil);
        System.out.println(moeda.getSimbolo());
    }
}