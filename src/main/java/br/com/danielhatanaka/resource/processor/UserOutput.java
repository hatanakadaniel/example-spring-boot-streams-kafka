package br.com.danielhatanaka.resource.processor;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserOutput {

    String OUTPUT = "user-output";

    @Output(OUTPUT)
    MessageChannel output();
}
