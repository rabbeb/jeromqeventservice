package mom.eventservice.jeromq;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({ "jero", "jerotest" })
public class JeroMqAddresses {

    @Bean(name = "inAddresses")
    @Profile("jerotest")
    public JeroMqAddressContainer testInAddresses() {
        return new JeroMqAddressContainer(Arrays.asList("tcp://localhost:5000", "tcp://localhost:5001", "tcp://localhost:5002", "tcp://localhost:5003"));
    }

    @Bean(name = "outAddress")
    @Profile("jerotest")
    public JeroMqAddressContainer testOutAddress() {
        return new JeroMqAddressContainer(Arrays.asList("tcp://localhost:6000"));
    }

    @Bean(name = "inAddresses")
    @Profile("jero")
    public JeroMqAddressContainer inAddresses() {
        return new JeroMqAddressContainer(Arrays.asList("tcp://localhost:5000", "tcp://localhost:5001", "tcp://localhost:5002", "tcp://localhost:5003"));
    }

    @Bean(name = "outAddress")
    @Profile("jero")
    public JeroMqAddressContainer outAddress() {
        return new JeroMqAddressContainer(Arrays.asList("tcp://localhost:6000"));
    }
}