package fr.paris10.miage.procs.exercice1;

/**
 * Created by MACYLIA on 25/01/2017.
 */
import javax.jws.WebService;

@WebService(endpointInterface = "fr.paris10.miage.procs.exercice1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String bonjour(String name) {
        return "Bonjour "+name+"\n";
    }
}
