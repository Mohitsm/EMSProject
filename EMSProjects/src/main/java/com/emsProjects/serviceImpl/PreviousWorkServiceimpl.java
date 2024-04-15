package com.emsProjects.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsProjects.entity.PreviousWork;
import com.emsProjects.exception.ResourceNotFoundException;
import com.emsProjects.paylode.PreviousWorkDto;
import com.emsProjects.repositry.PreviousWorkRepo;
import com.emsProjects.service.PreviousWorkService;
@Service
public class PreviousWorkServiceimpl implements PreviousWorkService {
	
	@Autowired 
	private PreviousWorkRepo previousWorkRepo;
	
	@Autowired 
	private ModelMapper modelMapper;

	@Override
	public PreviousWorkDto createPreviousWork(PreviousWorkDto previousWorkDto) {
		// TODO Auto-generated method stub
		PreviousWork previousWork=this.modelMapper.map(previousWorkDto, PreviousWork.class);
		PreviousWork createPreviousWork=this.previousWorkRepo.save(previousWork);
		return this.modelMapper.map(createPreviousWork, PreviousWorkDto.class);
	}

	@Override
	public PreviousWorkDto updatePreviousWork(PreviousWorkDto previousWorkDto, Integer previousWorkId) {
		// TODO Auto-generated method stub
		PreviousWork previousWork=this.previousWorkRepo.findById(previousWorkId).orElseThrow(()-> new ResourceNotFoundException("PreviousWork", "Id", previousWorkId));
		return null;
	}

	@Override
	public void deletePreviousWork(Integer previousWorkId) {
		// TODO Auto-generated method stub
		PreviousWork previousWork=this.previousWorkRepo.findById(previousWorkId).orElseThrow(()-> new ResourceNotFoundException("PreviousWork", "Id", previousWorkId));

		this.previousWorkRepo.delete(previousWork);
		
	}

	@Override
	public PreviousWorkDto getPreviousWorkById(Integer previousWorkId) {
		// TODO Auto-generated method stub
		PreviousWork previousWork=this.previousWorkRepo.findById(previousWorkId).orElseThrow(()-> new ResourceNotFoundException("PreviousWork", "Id", previousWorkId));

		return this.modelMapper.map(previousWork, PreviousWorkDto.class);
	}

	@Override
	public List<PreviousWorkDto> getAllPreviousWork() {
		// TODO Auto-generated method stub
		List<PreviousWork> previousWorks=this.previousWorkRepo.findAll();
		List<PreviousWorkDto> getAllPreviousWorkDtos=previousWorks.stream().map((pw)->this.modelMapper.map(pw, PreviousWorkDto.class)).collect(Collectors.toList());
		return getAllPreviousWorkDtos;
	}

}
