package com.emsProjects.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsProjects.entity.AssetAllocation;
import com.emsProjects.exception.ResourceNotFoundException;
import com.emsProjects.paylode.AssetAllocationDto;
import com.emsProjects.repositry.AssetAllocationRepo;
import com.emsProjects.service.AssetAllocationService;

@Service
public class AssetAllocationServiceImpl implements AssetAllocationService {
	
	@Autowired
	private AssetAllocationRepo assetAllocationRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public AssetAllocationDto createAssetAllocation(AssetAllocationDto assetAllocationDto) {
		// TODO Auto-generated method stub
		AssetAllocation assetAllocation=this.modelMapper.map(assetAllocationDto, AssetAllocation.class);
		AssetAllocation createAssetAllocation=this.assetAllocationRepo.save(assetAllocation);
		return this.modelMapper.map(createAssetAllocation, AssetAllocationDto.class);
	}

	@Override
	public AssetAllocationDto updateAssetAllocation(AssetAllocationDto assetAllocationDto, Integer assetAllocationId) {
		// TODO Auto-generated method stub
		AssetAllocation allocation=this.assetAllocationRepo.findById(assetAllocationId).orElseThrow(()->new ResourceNotFoundException("AssetAllocation", "Id", assetAllocationId));
		
		return null;
	}

	@Override
	public void deleteAssetAllocation(Integer assetAllocationId) {
		// TODO Auto-generated method stub
		AssetAllocation allocation=this.assetAllocationRepo.findById(assetAllocationId).orElseThrow(()->new ResourceNotFoundException("AssetAllocation", "Id", assetAllocationId));

		this.assetAllocationRepo.delete(allocation);

	}

	@Override
	public AssetAllocationDto getAssetAllocationById(Integer assetAllocationId) {
		// TODO Auto-generated method stub
		AssetAllocation allocation=this.assetAllocationRepo.findById(assetAllocationId).orElseThrow(()->new ResourceNotFoundException("AssetAllocation", "Id", assetAllocationId));

		return this.modelMapper.map(allocation, AssetAllocationDto.class);
	}

	@Override
	public List<AssetAllocationDto> getAllAssetAllocation() {
		// TODO Auto-generated method stub
		List<AssetAllocation> allocations=this.assetAllocationRepo.findAll();
		List<AssetAllocationDto> getAllAssetAllocation=allocations.stream().map((al)->this.modelMapper.map(al, AssetAllocationDto.class)).collect(Collectors.toList());
		return getAllAssetAllocation;
	}

}
