package com.cagriturkmen.SpringBootBilgeAdam2.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class _02_indexJSP {

    @GetMapping("/firstJsp")
    public String getJSP(){
        return "index.jsp";
    }
}
