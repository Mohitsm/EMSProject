package com.emsProjects.controler;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.emsProjects.paylode.FileResponse;
import com.emsProjects.service.FileService;

@RestController
@RequestMapping("/api/file")
public class FileControll {
	
	@Autowired
	private FileService fileService;
	
	@Value("${project.image}")
	private String path;
	
	@PostMapping("/uplode")
	public ResponseEntity<FileResponse> fileUplode(@RequestParam("image") MultipartFile image){
		String fileName=null;
		try {
			fileName = this.fileService.uplodeImage(path, image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<FileResponse>(new FileResponse(fileName, "file is not uploded!!"),HttpStatus.OK);

		}
		return new ResponseEntity<FileResponse>(new FileResponse(fileName, "file is uploded!!"),HttpStatus.OK);
	}

}
