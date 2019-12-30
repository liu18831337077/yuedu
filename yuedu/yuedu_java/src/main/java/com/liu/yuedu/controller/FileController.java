package com.liu.yuedu.controller;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Date;
import java.util.UUID;

/**
 * 文件上传
 */
@RestController
public class FileController {


    /**
     * 上传文件
     * @param file
     * @param request
     * @return
     */
    @PostMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {
        String result="true";
        if(!file.isEmpty()) {
            String fileName=UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String path=request.getServletContext().getRealPath("files")+"/"+fileName;
            String path2="files/"+fileName;
            result=path2;
            try {
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
            } catch (IOException e) {
                result="false";
                e.printStackTrace();
            }
        }else{
               result="false";
        }
        System.out.println("fileOK:"+result);
        return result;
    }

    @RequestMapping(value = "/msg",method = RequestMethod.POST)
    public String msg(@RequestBody String msg){
        System.out.println("msg============================:"+msg);
        return "ok";
    }
}