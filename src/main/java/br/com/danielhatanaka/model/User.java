package br.com.danielhatanaka.model;

import lombok.*;
import org.apache.avro.reflect.Nullable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String lastName;
    @Nullable
    private String lastName2;
    @Builder.Default
    private String lastName3 = "Default LastName3";

}
