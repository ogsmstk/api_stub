package com.myapp.api.service;

import com.myapp.api.enums.StubType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class StubService {

    @Value("${application.stub.json}")
    private String jsonPath;

    /**
     * 引数で指定したスタブタイプ(enums.StubType)に対応した
     * ファイル名のJson(src\main\resources\stub\json\serviceList.json)を返す
     *
     * @param stubType
     * @return
     */
    public JsonNode getListResponse(String stubType) {

        String filePath = jsonPath + StubType.getValueByCode(stubType) + ".json";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(Paths.get(filePath).toFile());
            System.out.println(rootNode);

            return rootNode;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
