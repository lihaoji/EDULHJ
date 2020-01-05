package com.edu.oss.service;

import org.springframework.web.multipart.MultipartFile; /**
 * @author lihaoji
 * @create 2019-12-08 16:41
 */
public interface FileService {
    String upload(MultipartFile file);
}
