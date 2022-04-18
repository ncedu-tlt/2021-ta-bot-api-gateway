package com.netcracker.edu.review.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Value("#{'${user-service-url}' + '${user-service-register}'}")
    private String reviewServiceUrlRegistration;

    @Value("#{'${user-service-url}' + '${user-service-subscription}'}")
    private String reviewServiceUrlFindByPlaceId;

    @Value("#{'${user-service-url}' + '${user-service-city}'}")
    private String reviewServiceUrlFindByPlaceIdAndAuthorId;


    @Autowired
    private RestTemplate restTemplate;
}
