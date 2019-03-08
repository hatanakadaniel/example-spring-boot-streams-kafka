package hatanaka.example.kafka.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface UserSink {

    String INPUT = "streaming-kafka-example-user-created-input";

    @Input(INPUT)
    SubscribableChannel processMessage();
}
