package org.example.repository;

import org.example.mapping.dtos.ContactDto;

import java.util.List;

public interface ContactRepository {
    public List<ContactDto> GetAllContact();
}
