package com.rodrigo.NovaNoticia.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.NovaNoticia.domain.NewJournal;

public interface NewJournalRepository extends JpaRepository<NewJournal, Integer>{

}
