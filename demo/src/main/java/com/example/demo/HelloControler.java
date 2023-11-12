package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //review ’@‘ 為註解。這裡這裡的Controler為spring提供的一個標識，表示下面的類為一個控制器類 [12/11/2023]
public class HelloControler {
    @RequestMapping("/hello")   //review 建立URl和方法之間的關係[12/11/2023]
    @ResponseBody   //review 將方法的響應結果傳給瀏覽器[12/11/2023]
    String fun (String name){
        return "Hello,"+ name;

    }

}
