package hatanaka.example.kafka.listener;

import hatanaka.example.kafka.domain.User;
import hatanaka.example.kafka.stream.UserSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(UserSink.class)
public class UserListener {

    @StreamListener(UserSink.INPUT)
    public void process(User user) {

        // qualquer processamento
        System.out.println(user);
    }
}
