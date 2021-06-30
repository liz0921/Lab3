package sumador;

public class ConcatenadorAgregadorImpl implements Agregador {
    @Override
    public String agregar(int a, int b) {
        return (a + "")+(b + "");
    }
}

