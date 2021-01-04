package com.ricardo.orangeTalent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.orangeTalent.entities.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
