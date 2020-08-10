package com.innominds.artifactory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artifactory")
public class ArtifactoryController {

	@GetMapping
	public String getData() {
		return "This is artifactory";
	}
}
