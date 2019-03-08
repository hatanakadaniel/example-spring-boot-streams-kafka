package hatanaka.example.kafka.resource;

import hatanaka.example.kafka.domain.User;
import hatanaka.example.kafka.stream.UserSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserSource userSource;

    @GetMapping("/")
    public String processUser() {
        var user = User.builder().name("Hatanaka").age(28L).build();
        userSource.created().send(MessageBuilder.withPayload(user).build());
        return "Usuario enviado";
    }
}
