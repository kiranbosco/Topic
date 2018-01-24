package com.io.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value="/topic",method=RequestMethod.POST)
	public Topic getAllTopic(Topic topic) {
		return topicService.getAllTopic(topic);
	}
		
	@RequestMapping(value="/getData",method=RequestMethod.GET)
	public void getNames(@PathVariable ("name")String name) {
		topicService.getNames(name);
	}
	}
	
	


