package testbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sumador.Agregador;
import writer.Writer;

public class MySpringWriterBeanWithDependency {
    private Writer writer;
    private Agregador agregador;
    @Autowired
    public void setWriter (Writer pWriter){
        this.writer = pWriter;
    }
    public void setAgregador(Agregador pAgregador){
        this.agregador=pAgregador;
    }
    public void run(){
        String s = "Sample string";
        writer.write(s);
        System.out.println("ahora agregamos 3 y 5: "+this.agregador.agregar(3,5));
    }
}
