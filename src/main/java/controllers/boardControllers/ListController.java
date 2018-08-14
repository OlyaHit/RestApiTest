package controllers.boardControllers;

import controllers.AbstractController;
import models.listModel.ListRequest;
import models.listModel.ListResponse;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ListController extends AbstractController {

    private ListRequest listRequest;

    public ListController(ListRequest listRequest, String basePath) {
        super(listRequest, basePath);
        this.listRequest = listRequest;
    }

    public ListController(String basePath) {
        super(basePath);
    }

    public ListResponse addNewList() {
        return given(requestSpecification)
                .body(listRequest)
                .post().as(ListResponse.class);
    }

    public ListResponse getBoardList(String boardId) {
        return given(requestSpecification)
                .get(boardId)
                .as(ListResponse.class);
    }
}
