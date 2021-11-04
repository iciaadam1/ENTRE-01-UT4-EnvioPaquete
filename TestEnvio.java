
/**
 * Write a description of class TestEnvio here.
 * 
 * @author IKER CIA 
 * @version (a version number or a date)
 */
public class TestEnvio
{

    /**
     *  
     */
    public void Main()
    {
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40,60,40);
        Envio envio =new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        envio.print();
        Paquete paquete3 = new Paquete(50,50,70);
        envio.addPaquete(paquete3);
        envio.print();
        
    }
}
