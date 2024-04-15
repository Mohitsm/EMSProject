package com.emsProjects.serviceImpl;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.emsProjects.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uplodeImage(String path, MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		//file name
		String name=file.getOriginalFilename();
		
		//full path
		
		String fileName=path+File.separator+name;
		//create folder if not create
		
		File f=new File(path);
		if(!f.exists()) {
			f.mkdir();
		}
		//file copy
		
		Files.copy(file.getInputStream(), Paths.get(fileName));
		return name;
	}

	@Override
	public InputStream getResores(String path, String fileName) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fullPath=path+File.separator+fileName;
		InputStream is=new FileInputStream(fullPath);
		
		//db
		return is; 
		
	}

}
