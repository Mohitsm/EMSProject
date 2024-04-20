package com.emsProjects.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsProjects.entity.AssetAllocation;

public interface AssetAllocationRepo extends JpaRepository<AssetAllocation, Integer>{

}
