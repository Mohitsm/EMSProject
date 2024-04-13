package com.emsProjects.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.emsProjects.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
