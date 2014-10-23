package com.zjj.controller.annotation.upload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("/file")
public class UploadController {
	@RequestMapping("/upload")
	public String upload(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request)
	{
		System.out.println("fileName---->"+file.getOriginalFilename());
		
		if(!file.isEmpty()) {
			try {
				FileOutputStream fos = new FileOutputStream("D:/"+file.getOriginalFilename());
				InputStream is = file.getInputStream();
				int b = 0;
				while((b=is.read()) != -1){
					fos.write(b);
				}
				fos.flush();
				fos.close();
				is.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "/fileUploadSuccess";
	}
	
	@RequestMapping("/upload2")
	public String upload2(HttpServletRequest request,HttpServletResponse response)
	{
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		if(multipartResolver.isMultipart(request)){
			MultipartHttpServletRequest multiRequset = (MultipartHttpServletRequest) request;
			Iterator<String> iterator = multiRequset.getFileNames();
			while(iterator.hasNext()){
				MultipartFile file = multiRequset.getFile(iterator.next());
				if(file != null){
					String fileName = "demoUpload" + file.getOriginalFilename();
					String path = "D:/" + fileName;
					
					File localFile = new File(path);
					try {
						file.transferTo(localFile);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return "/fileUploadSuccess";
	}
	
	@RequestMapping("/toUpload")
	public String toUpload() {
		return "/upload";
	}
}
