package com.example.Atm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Atm.Entity.Bankname;

@Repository
public interface BankRepository extends JpaRepository<Bankname, Integer> {

}
