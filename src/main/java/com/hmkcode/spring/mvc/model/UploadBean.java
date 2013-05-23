/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hmkcode.spring.mvc.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author lenovo
 */
public class UploadBean {
private CommonsMultipartFile filedata;
private String name;

    public CommonsMultipartFile getFiledata() {
        return filedata;
    }

    public void setFiledata(CommonsMultipartFile filedata) {
        this.filedata = filedata;
    }

    

}
