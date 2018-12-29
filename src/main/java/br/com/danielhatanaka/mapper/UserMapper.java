//package br.com.danielhatanaka.mapper;
//
//import br.com.danielhatanaka.model.User;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserMapper implements Mapper<User, UserAvroDTO> {
//
//    @Override
//    public UserAvroDTO toAvroDTO(User model) {
//        return UserAvroDTO.newBuilder().setName(model.getName()).setTeste("teste").setTeste2("teste2").setLastName(model.getLastName()).build();
//    }
//
//    @Override
//    public User fromAvroDTO(UserAvroDTO avroDTO) {
//        return User.builder().name(avroDTO.getName()).lastName(avroDTO.getLastName()).build();
//    }
//}
