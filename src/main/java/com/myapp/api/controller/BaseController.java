package com.myapp.api.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.myapp.api.controller.stub.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

public abstract class BaseController {

    public abstract JsonNode getServiceListResponse(String stubType);
}