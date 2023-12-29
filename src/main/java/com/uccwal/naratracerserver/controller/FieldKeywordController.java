package com.uccwal.naratracerserver.controller;


import com.uccwal.naratracerserver.entity.FieldKeyword;
import com.uccwal.naratracerserver.repository.FieldKeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fieldKeywords")
public class FieldKeywordController {

    private final FieldKeywordRepository fieldKeywordRepository;

    @Autowired
    public FieldKeywordController(FieldKeywordRepository fieldKeywordRepository) {
        this.fieldKeywordRepository = fieldKeywordRepository;
    }

    @GetMapping("/keyword")
    public String keyword() {
        return "/page/keyword.html";
    }

    @GetMapping("/getKeyword")
    public List<FieldKeyword> getAllFieldKeywords() {
        return fieldKeywordRepository.findAll();
    }
}
