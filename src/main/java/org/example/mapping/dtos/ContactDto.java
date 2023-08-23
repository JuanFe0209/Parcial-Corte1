package org.example.mapping.dtos;

import org.example.domain.enums.ContactCategory;

public record ContactDto (String name,
                          String direccion,
                          ContactCategory tipoContacto,
                          String correoElectronico,
                          int telefono){
}
