package com.io.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class TopicService {
	

	@Autowired
	private TopicRepository topicRepository;
	
	public Topic getAllTopic(@RequestBody Topic topic) {
		Topic topics=topicRepository.save(topic);
		return topics;
		
	}
	@ResponseBody
	public void getNames(@PathVariable ("name")String name) {
		Topic to=topicRepository.findOne(name);
		to.setName(name);
		
		
		
	}

			
			}
		
	
	
	
	
	
	


