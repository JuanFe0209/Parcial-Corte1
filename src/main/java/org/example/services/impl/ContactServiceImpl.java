package org.example.services.impl;

import org.example.domain.enums.ContactCategory;
import org.example.mapping.dtos.ContactDto;
import org.example.services.ContactService;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;


public class ContactServiceImpl implements ContactService {
    List<ContactDto> contacts;
    @Override
    public List<ContactDto> ListAllContacts() {
        return null;
    }

    @Override
    public List<ContactDto> FilterContactsByCategory(ContactCategory category) {
        return contacts.stream()
                .filter(e -> e.tipoContacto().equals(category))
                        .anyMatch(cont -> cont.tipoContacto().equals(category)
                .collect(Collectors.toList()));
    }

    @Override
    public Double CountAllContactsByCategory() {
        return null;
    }

    @Override
    public List<ContactDto> FilterCategoryByNameAndPhone(ContactCategory category) {
            return contacts.stream()
                    .filter(contact -> contact.name().equals("Pablo"))
                    .filter(contact -> contact.telefono() == 310221134)
                    .collect(Collectors.toList());
        }
    }

