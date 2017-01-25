package helloclient;

/**
 * Created by MACYLIA on 25/01/2017.
 */




        import javax.xml.namespace.QName;
        import javax.xml.ws.Service;
        import java.net.URL;

public class HelloWorldClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/bonjour?wsdl");
        QName qname = new QName("http://exercice1.procs.miage.paris10.fr/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        fr.paris10.miage.procs.exercice1.HelloWorld hello = service.getPort(fr.paris10.miage.procs.exercice1.HelloWorld.class);
        System.out.println(hello.bonjour("Bob"));
    }
}