package TraductorBraille;
/**
 * @author ACER-PC
 */
public class Traductor implements ICodigoBraille{
    private String Traduccion;

    public Traductor(String Traduccion) {
        this.Traduccion = Traduccion;
    }

    public String getTraduccion() {
        return Traduccion;
    }

    public void setTraduccion(String Traduccion) {
        this.Traduccion = Traduccion;
    }

    @Override
    public void Mensaje() {
           System.out.println("{ Traduccion = " + Traduccion + '}');
    }

   
    
}
