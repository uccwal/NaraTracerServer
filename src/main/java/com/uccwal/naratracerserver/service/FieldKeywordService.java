package com.uccwal.naratracerserver.service;


import com.uccwal.naratracerserver.entity.FieldKeyword;
import com.uccwal.naratracerserver.repository.FieldKeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldKeywordService {

    private final FieldKeywordRepository fieldKeywordRepository;

    @Autowired
    public FieldKeywordService(FieldKeywordRepository fieldKeywordRepository) {
        this.fieldKeywordRepository = fieldKeywordRepository;
    }

    public List<FieldKeyword> findAllFieldKeywords( ) {
        return fieldKeywordRepository.findAll();
    }
}
