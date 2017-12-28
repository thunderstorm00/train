package com.leiqiao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by leiqiao on 2017/12/27.
 */
@Controller
public class HelloWorld {

    @RequestMapping(value = "hello")//②请求URL到处理器功能处理方法的映射
    public ModelAndView helloWorld() {
        //1、收集参数
        //2、绑定参数到命令对象
        //3、调用业务对象
        //4、选择下一个页面
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("hello", "Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("hello");
        return mv;   //模型数据和逻辑视图名
    }

}
