package com.learningsb.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
	int[] retrieveData();
}