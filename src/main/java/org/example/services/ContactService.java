package org.example.services;

import org.example.domain.enums.ContactCategory;
import org.example.mapping.dtos.ContactDto;

import java.util.List;

public interface ContactService {
    List<ContactDto> ListAllContacts();
    List<ContactDto> FilterContactsByCategory(ContactCategory category);
    Double CountAllContactsByCategory();
    List<ContactDto> FilterCategoryByNameAndPhone(ContactCategory category);
}
