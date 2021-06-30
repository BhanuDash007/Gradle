package com.javasampleapproach.s3.services;

import org.springframework.stereotype.Service;

@Service
public interface S3Services {
	public void downloadFile(String keyName);
	public void uploadFile(String keyName, String uploadFilePath);
}
