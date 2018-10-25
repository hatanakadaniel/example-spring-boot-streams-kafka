package br.com.danielhatanaka.mapper;

public interface Mapper<T, U> {

    U toAvroDTO(T model);

    T fromAvroDTO(U avroDTO);
}
