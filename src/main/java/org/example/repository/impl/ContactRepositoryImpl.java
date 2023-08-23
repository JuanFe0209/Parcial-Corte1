package org.example.repository.impl;

import org.example.domain.enums.ContactCategory;
import org.example.domain.models.Contact;
import org.example.mapping.dtos.ContactDto;
import org.example.repository.ContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository {
private List <Contact> contacts;
public ContactRepositoryImpl(){
    contacts = new ArrayList<Contact>();
    contacts.add(new Contact("Pablo","Castellana", ContactCategory.Amigos, "pablo21@gmail.com", 310221134));
    contacts.add(new Contact("Daniel","Ocobos", ContactCategory.Amigos, "dorozco22@gmail.com", 341221345));
    contacts.add(new Contact("Miriam", "Sorrento", ContactCategory.Familia, "mir32@gmail.com", 310323470));
    contacts.add(new Contact("Ricardo", "Colors", ContactCategory.Familia,"Richy221@gmail.com",314621334));
    contacts.add(new Contact("Martin", "Nogal", ContactCategory.Trabajo, "Mvillegaz22@gmail.com", 322104432));
    contacts.add(new Contact("Jose", "Proviteq", ContactCategory.Trabajo,"Joselito22@gmail.com",351221102));
}
    @Override
    public List<ContactDto> GetAllContact() {
        return null;
    }
}
