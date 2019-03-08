package hatanaka.example.kafka.configuration;

import hatanaka.example.kafka.stream.UserSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.schema.client.ConfluentSchemaRegistryClient;
import org.springframework.cloud.stream.schema.client.SchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(UserSource.class)
public class CloudConfig {

    @Bean
    public SchemaRegistryClient schemaRegistryClient(@Value("${spring.kafka.properties.schema.registry.url}") String endpoint) {
        ConfluentSchemaRegistryClient confluentSchemaRegistryClient = new ConfluentSchemaRegistryClient();
        confluentSchemaRegistryClient.setEndpoint(endpoint);
        return confluentSchemaRegistryClient;
    }
}
