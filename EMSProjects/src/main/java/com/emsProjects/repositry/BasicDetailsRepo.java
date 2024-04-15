package com.emsProjects.repositry;

import org.springframework.data.jpa.repository.JpaRepository;


import com.emsProjects.entity.BasicDetails;

public interface BasicDetailsRepo extends JpaRepository<BasicDetails, Integer> {

}
