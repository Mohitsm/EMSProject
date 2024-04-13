package com.emsProjects.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsProjects.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
