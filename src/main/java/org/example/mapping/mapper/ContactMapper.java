package org.example.mapping.mapper;

import org.example.domain.models.Contact;
import org.example.mapping.dtos.ContactDto;

import java.util.List;

public class ContactMapper {
    public static ContactDto mapFrom (Contact source){
        return new ContactDto(source.getNombre(),
                source.getDireccion(),
                source.getTipoContacto(),
                source.getCorreoElectronico(),
                source.getTelefono());
    }
    public static Contact mapFrom (ContactDto source){
        return new Contact(source.name(),
                source.direccion(),
                source.tipoContacto(),
                source.correoElectronico(),
                source.telefono());
    }
    public static List <ContactDto> mapFrom(List<Contact> source){
        return source.parallelStream().map(e -> mapFrom(e)).toList();
    }
    public static List <Contact> mapFromDto(List<ContactDto> source){
        return source.parallelStream().map(e -> mapFrom(e)).toList();
    }

}
