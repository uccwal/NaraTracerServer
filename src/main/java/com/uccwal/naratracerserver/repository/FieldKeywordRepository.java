package com.uccwal.naratracerserver.repository;

import com.uccwal.naratracerserver.entity.FieldKeyword;
import com.uccwal.naratracerserver.entity.FieldKeywordId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldKeywordRepository extends JpaRepository<FieldKeyword, FieldKeywordId> {
}
