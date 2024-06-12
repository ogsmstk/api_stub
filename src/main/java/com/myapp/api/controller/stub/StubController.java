package com.myapp.api.controller.stub;

import com.fasterxml.jackson.databind.JsonNode;
import com.myapp.api.controller.BaseController;
import com.myapp.api.enums.StubType;
import com.myapp.api.service.StubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/stub")
public class StubController extends BaseController {

    @Autowired
    StubService stubService;

    /**
     * リクエストのスタブタイプに対応した
     * ファイル名のJson(src\main\resources\stub\json\serviceList.json)を返す
     *
     * @param stubType
     * @return
     */
//    @Scheduled(initialDelay = 5000)
    @GetMapping
    public JsonNode getServiceListResponse(@RequestParam("stubType") String stubType) {
        return stubService.getListResponse(stubType);
    }
}
