package com.emsProjects.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsProjects.entity.Permissions;

public interface PermissionsRepo extends JpaRepository<Permissions, Integer> {

}
