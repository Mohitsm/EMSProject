package com.emsProjects.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsProjects.entity.BasicDetails;
import com.emsProjects.exception.ResourceNotFoundException;
import com.emsProjects.paylode.BasicDetailsDto;
import com.emsProjects.repositry.BasicDetailsRepo;
import com.emsProjects.service.BAsicDetailsService;
@Service
public class BasicDetailsServiceImpl implements BAsicDetailsService {
	
	@Autowired
	private BasicDetailsRepo basicDetailsRepo;
	
	@Autowired 
	private ModelMapper modelMapper;

	@Override
	public BasicDetailsDto createBasicDetails(BasicDetailsDto basicDetailsDto) {
		// TODO Auto-generated method stub
		BasicDetails basicDetails=this.modelMapper.map(basicDetailsDto, BasicDetails.class);
		BasicDetails createBasicDetails=this.basicDetailsRepo.save(basicDetails);
		return this.modelMapper.map(createBasicDetails, BasicDetailsDto.class);
	}

	@Override
	public BasicDetailsDto updateBasicDetails(BasicDetailsDto basicDetailsDto, Integer basicDetailsId) {
		// TODO Auto-generated method stub
		BasicDetails basicDetails=this.basicDetailsRepo.findById(basicDetailsId).orElseThrow(()-> new ResourceNotFoundException("basicDetails", "Id", basicDetailsId));
		
		return null;
	}

	@Override
	public void deleteBasicDetails(Integer basicDetailsId) {
		// TODO Auto-generated method stub
		BasicDetails basicDetails=this.basicDetailsRepo.findById(basicDetailsId).orElseThrow(()-> new ResourceNotFoundException("basicDetails", "Id", basicDetailsId));

		this.basicDetailsRepo.delete(basicDetails);

	}

	@Override
	public BasicDetailsDto getBasicDetailsById(Integer basicDetailsId) {
		// TODO Auto-generated method stub
		BasicDetails basicDetails=this.basicDetailsRepo.findById(basicDetailsId).orElseThrow(()-> new ResourceNotFoundException("basicDetails", "Id", basicDetailsId));

		
		return this.modelMapper.map(basicDetails, BasicDetailsDto.class);
	}

	@Override
	public List<BasicDetailsDto> getAllBasicDetails() {
		// TODO Auto-generated method stub
		List<BasicDetails> basicDetails=this.basicDetailsRepo.findAll();
		List<BasicDetailsDto> getAllBasicDetailsDtos=basicDetails.stream().map((bs)-> this.modelMapper.map(bs, BasicDetailsDto.class)).collect(Collectors.toList());
		return getAllBasicDetailsDtos;
	}

}
