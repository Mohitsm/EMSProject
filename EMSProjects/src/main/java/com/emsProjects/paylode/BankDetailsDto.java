package com.emsProjects.paylode;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BankDetailsDto {
	private Integer bankDetailsId;
	@Column(length = 255)
	private String  acHolderName_1;
	@Column(length = 255)
	private String  ifsc_1;
	@Column(length = 255)
	private String acNumber_1;
	@Column(length = 255)
	private String bankName_1;
	@Column(length = 255)
	private String  bankAddress_1;
	@Column(length = 255)
	private String acHolderName_2;
	@Column(length = 255)
	private String  ifsc_2;
	@Column(length = 255)
	private String acNumber_2;
	@Column(length = 255)
	private String  bankName_2;
	@Column(length = 255)
	private String  bankAddress_2;

}
