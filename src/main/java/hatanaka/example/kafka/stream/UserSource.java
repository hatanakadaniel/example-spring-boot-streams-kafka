package hatanaka.example.kafka.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserSource {

    String OUTPUT = "streaming-kafka-example-user-created-output";

    @Output(OUTPUT)
    MessageChannel created();
}
