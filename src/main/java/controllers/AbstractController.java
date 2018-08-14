package controllers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import trelloConfig.Configs;

public abstract class AbstractController {

    protected RequestSpecification requestSpecification;
    private Object model;
    private Configs config;
    private String basePath;


    public AbstractController(Object model, String basePath) {
        config = new Configs();
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(config.getBaseUri())
                .setBasePath(this.basePath = basePath)
                .addQueryParam("key", config.getKey())
                .addQueryParam("token", config.getToken())
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.defaultParser = Parser.JSON;
        this.model = model;
    }

    public AbstractController(String basePath) {
        config = new Configs();
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(config.getBaseUri())
                .setBasePath(this.basePath = basePath)
                .addQueryParam("key", config.getKey())
                .addQueryParam("token", config.getToken())
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.defaultParser = Parser.JSON;
    }
}
