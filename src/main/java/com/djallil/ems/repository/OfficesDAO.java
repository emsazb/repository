package com.djallil.ems.repository;


import com.djallil.ems.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficesDAO extends JpaRepository<Office, Integer> {

}
