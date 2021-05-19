package com.ug.admonitor.web.controller;

import com.ug.admonitor.web.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class HelloController {

    @Autowired
    Car car;

    @GetMapping("/goto")
    public String gotoPage(HttpServletRequest request){
        request.setAttribute("msg","跳转");
        return "forward:/home";
    }

    @ResponseBody
    @GetMapping("/home")
    public  Map home(@RequestAttribute("msg") String msg,
                     HttpServletRequest request){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("request",request);
        return map;
    }

    @GetMapping("/hello")
    public  String helloWorld(){
        return "hello world~~ 中文";
    }

    @GetMapping("/car")
    public Car car(){
        return car;
    }

    @PostMapping("/submit")
    public Map<String,Object> submit( @RequestBody String content){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("body",content);
        return map;
    }

    @GetMapping("/car2/{id}/info/{username}")
    public Map<String,Object> car2(
            @PathVariable("id") Integer id,
            @PathVariable("username") String username,
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader Map<String,String> header,
            @RequestParam Map<String,String> params,
            @CookieValue("Idea-269bec3e") String ga){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",id);
        map.put("username",username);
        Set<String> keys = header.keySet();
        for (String key:
                keys) {
            map.put(key,header.get(key));
        }
        map.put("params",params);
        map.put("ga",ga);
        return map;
    }
}
