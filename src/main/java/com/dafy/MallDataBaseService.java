package com.dafy;

import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName MallDataBaseService
 * @Description:TODO
 * @Author Albert
 * Version v0.9
 */

@Controller
@RequestMapping("MallDataBaseService")
public class MallDataBaseService {

    @RequestMapping(value = "baseDataService")
    public void webInfoDataService(String jsonstr, HttpServletRequest request, HttpServletResponse response){
        System.out.println("Hello " + jsonstr + "! Welcome to  Spring boot!" );
    }
}
