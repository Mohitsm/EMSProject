package com.emsProjects.service;

import java.util.List;


import com.emsProjects.paylode.BankDetailsDto;

public interface BankDetailsService {
	BankDetailsDto createBankDetails(BankDetailsDto bankDetailsDto);
	BankDetailsDto updateBankDetails(BankDetailsDto bankDetailsDto,Integer bankDetailsId);
	void deleteBankDetails(Integer bankDetailsId);
	BankDetailsDto getBankDetailsById(Integer bankDetailsId);
	List<BankDetailsDto> getAllBankDetails();

}
