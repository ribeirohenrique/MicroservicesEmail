package com.ms.email.repositories;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

//Extende a classe JpaRepository para usar os métodos prontos (findAll, findById, ...)
//A entidade será a EmailModel com Id de tipo Long
public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
