package com.emsProjects.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	String uplodeImage(String path,MultipartFile file) throws IOException;

}
