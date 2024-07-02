package com.example.Atm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Atm.Entity.Userdetails;

@Repository
public interface UserdetRepository extends JpaRepository<Userdetails,Long> {

}
