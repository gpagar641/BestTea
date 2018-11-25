package com.maverick.besttea.common;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class VpsImageUpload {

	
	/*public static final String doctorProfile = "doctorProfile\\";
	public static final String patientProfile = "patientProfile\\";
	public static final String labImages = "labImages\\";
	*/
	//public static final String report="reports/";
	//public static final String report="/usr/local/tomcat8/apache-tomcat-8.5.34/apache-tomcat-8.5.34/webapps/reports/";
	
	public static final String doctorImages="F:\\Ganesh ShareFolder\\";
//	public static final String labImages="/usr/local/tomcat8/apache-tomcat-8.5.34/webapps/images/lab/";
//	public static final String pharmacy="/usr/local/tomcat8/apache-tomcat-8.5.34/webapps/images/pharmacy/";
	
//	public static final String patientImages="image//";
//	public static final String DOCTOR_CERTIFICATE="/usr/local/tomcat8/apache-tomcat-8.5.34/webapps/images/doctor/";

	
	
	
	
	
	public void saveUploadedFiles(MultipartFile files,int imageType, String imageName, int userId) throws IOException {

		/*for (MultipartFile file : files) {*/

			/*if (file.isEmpty()) {

				continue;

			}*/
			Path path =null;
			byte[] bytes = files.getBytes();
			if(imageType==1) {
			  
			
			path = Paths.get(doctorImages+imageName);
			
			}
			
				
			Files.write(path, bytes);
		/*}*/
	}

}
