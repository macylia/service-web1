package fr.paris10.miage.procs.exercice1;

/**
 * Created by MACYLIA on 25/01/2017.
 */
import javax.xml.ws.Endpoint;

public class HelloWorldLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/bonjour", new HelloWorldImpl());
    }
}
