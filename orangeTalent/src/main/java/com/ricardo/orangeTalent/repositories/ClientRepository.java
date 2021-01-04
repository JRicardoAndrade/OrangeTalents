package com.ricardo.orangeTalent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.orangeTalent.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
