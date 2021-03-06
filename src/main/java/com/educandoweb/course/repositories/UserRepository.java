package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.User;

//nessa interface de repository nao é necessario colocar a anotação para registrar o componente de dependencia pois o jpa repository 
//ja é por si proprio registrado

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
