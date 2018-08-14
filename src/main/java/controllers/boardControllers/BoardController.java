package controllers.boardControllers;

import controllers.AbstractController;
import models.boardModels.BoardRequest;
import models.boardModels.BoardResponse;

import static io.restassured.RestAssured.given;

public class BoardController extends AbstractController {

    private BoardRequest boardModel;

    public BoardController(BoardRequest boardModel, String basePath) {
        super(boardModel, basePath);
        this.boardModel = boardModel;
    }

    public BoardController(String basePath){
        super(basePath);
    }

    public BoardResponse addNewBoard() {
        return given(requestSpecification)
                .body(boardModel)
                .post().as(BoardResponse.class);
    }

    public BoardResponse updateBoard() {
        return given(requestSpecification)
                .body(boardModel)
                .put().as(BoardResponse.class);
    }

    public void deleteBoard(String boardId) {
        given(requestSpecification)
            .delete(boardId);
    }

    public BoardResponse getBoard(String boardId) {
        return given(requestSpecification)
                .get(boardId).as(BoardResponse.class);
    }
}
