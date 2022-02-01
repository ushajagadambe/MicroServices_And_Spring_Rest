package com.microservices.project_02_search_service.project_02_search_service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {
   @GetMapping("/message")
    public String getSearchMessage()
    {
        return "search controller";
    }
}
