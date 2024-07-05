package com.example.jpaexam;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

public interface BoardRepository extends JpaAttributeConverter<Board, Integer> {

}
