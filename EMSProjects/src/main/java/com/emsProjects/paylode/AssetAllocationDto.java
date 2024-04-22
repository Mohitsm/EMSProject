package com.emsProjects.paylode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "AssetAllocation")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AssetAllocationDto {
	private Integer assetAllocationId;

	@Column(length = 255)
    private String  assetName;
	@Column(length = 255)
    private String  assetModel;
    @Column(length = 255)
    private String  assetSerial;
    @Column(length = 255)
    private String  assetDOA;

}
