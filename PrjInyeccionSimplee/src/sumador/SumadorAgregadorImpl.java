package sumador;

public class SumadorAgregadorImpl implements Agregador {
    @Override
    public String agregar(int a, int b) {
        return (a + b) + "";
    }
}
