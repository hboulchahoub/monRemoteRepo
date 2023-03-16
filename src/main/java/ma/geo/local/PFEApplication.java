package ma.geo.local;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PFEApplication {
    private final static Logger LOGGER= LoggerFactory.getLogger(PFEApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PFEApplication.class);

        // JPA : Entity
            //1- Mapping d'une clé composé en utilisant les annoations
            //2- Mapping d'une relation d'heritage JPA
            //3- Serialisation/ Déserialisation


    }
}
