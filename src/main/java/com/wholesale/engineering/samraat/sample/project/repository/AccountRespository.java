package com.wholesale.engineering.samraat.sample.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wholesale.engineering.samraat.sample.project.entity.Account;

@Repository
public interface AccountRespository extends JpaRepository<Account,Long>{

}
