package com.emsProjects.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsProjects.entity.Qulification;
import com.emsProjects.exception.ResourceNotFoundException;
import com.emsProjects.paylode.QulificationDto;
import com.emsProjects.repositry.QulificationRepo;
import com.emsProjects.service.QulificationService;

@Service
public class QulificationServiceImpl implements QulificationService {
	
	@Autowired
	private QulificationRepo qulificationRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public QulificationDto createQulification(QulificationDto qulificationDto) {
		// TODO Auto-generated method stub
		Qulification qulification=this.modelMapper.map(qulificationDto, Qulification.class);
		Qulification createQulification=this.qulificationRepo.save(qulification);
		return this.modelMapper.map(createQulification, QulificationDto.class);
	}

	@Override
	public QulificationDto updateQulification(QulificationDto qulificationDto, Integer qulificationId) {
		// TODO Auto-generated method stub
		Qulification qualification=this.qulificationRepo.findById(qulificationId).orElseThrow(()-> new ResourceNotFoundException("Qualification", "Id", qulificationId));
		
		qualification.setQulificationType(qulificationDto.getQulificationType());
		qualification.setUniversity(qulificationDto.getUniversity());
		qualification.setCollege(qulificationDto.getCollege());
		qualification.setObtentMarks(qulificationDto.getObtentMarks());
		qualification.setPassingYear(qulificationDto.getPassingYear());
		qualification.setTotalMarks(qulificationDto.getTotalMarks());
		Qulification updateQulification=this.qulificationRepo.save(qualification);
		return this.modelMapper.map(updateQulification, QulificationDto.class);
	}

	@Override
	public void deleteQulification(Integer qulificationId) {
		// TODO Auto-generated method stub
		Qulification qualification=this.qulificationRepo.findById(qulificationId).orElseThrow(()-> new ResourceNotFoundException("Qualification", "Id", qulificationId));

		this.qulificationRepo.delete(qualification);

	}

	@Override
	public QulificationDto getQulificationById(Integer qulificationId) {
		// TODO Auto-generated method stub
		Qulification qualification=this.qulificationRepo.findById(qulificationId).orElseThrow(()-> new ResourceNotFoundException("Qualification", "Id", qulificationId));

		return this.modelMapper.map(qualification, QulificationDto.class);
	}

	@Override
	public List<QulificationDto> getaAllQulification() {
		// TODO Auto-generated method stub
		List<Qulification> qualifications=this.qulificationRepo.findAll();
		List<QulificationDto> getAllQualificationDtos=qualifications.stream().map((qu)-> this.modelMapper.map(qu, QulificationDto.class)).collect(Collectors.toList());
		
		return getAllQualificationDtos;

	}

}
