package com.rodrigo.NovaNoticia.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.NovaNoticia.domain.NewJournal;
import com.rodrigo.NovaNoticia.domain.DTO.NewJournalDTO;

public interface NewJournalRepository extends JpaRepository<NewJournal, Integer>{



}
