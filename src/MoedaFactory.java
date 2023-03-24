public class MoedaFactory {
    public MoedaFactory() {
    }

    public static Moeda gerarMoeda(Pais pais) {
        if (pais.equals(Pais.Brasil)) {
            return new Real();
        } else if (pais.equals(Pais.EstadosUnidos)) {
            return new USDolar();
        } else if (pais.equals(Pais.Japao)) {
            return new Iene();
        } else {
            throw new IllegalArgumentException("Pais não encontrado");
        }
    }
}