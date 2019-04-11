package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;

public class topicController {

    @RequestMapping("/topics")
    public String getAllTopics(){
        return "All Topics";
    }
}
