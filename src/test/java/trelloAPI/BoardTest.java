package trelloAPI;

import controllers.boardControllers.BoardController;
import models.boardModels.BoardRequest;
import models.boardModels.BoardResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class BoardTest {
    private String basePathBoard = "/1/boards/";
    private String boardId;

    @After
    public void deleteBoardAfterTest() {
       new BoardController(basePathBoard).deleteBoard(boardId);
    }

    @Test
    public void addNewBoardTest() {
        String boardName = RandomStringUtils.randomAlphabetic(5);
        BoardRequest boardRequest = new BoardRequest("members", true, "blue", true, "disabled", "members", true, boardName, true, "private", "none", "regular","");
        BoardResponse actualResponse = new BoardController(boardRequest, basePathBoard).addNewBoard();
        BoardResponse expectedResponse = new BoardResponse(false, boardName, null, false, "");
        boardId = actualResponse.getId();
        Assert.assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void updateBoardTest() {
        String boardName = RandomStringUtils.randomAlphabetic(5);
        BoardRequest boardRequest = new BoardRequest("members", true, "blue", true, "disabled", "members", true, boardName, true, "private", "none", "regular", "");
        BoardResponse actualResponse = new BoardController(boardRequest, basePathBoard).addNewBoard();

        String boardIdGenerated = actualResponse.getId();

        boardRequest.setName("changeNameBoard");
        String basePathCreatedBoard = basePathBoard + boardIdGenerated;
        actualResponse = new BoardController(boardRequest, basePathCreatedBoard).updateBoard();
        BoardResponse expectedResponse = new BoardResponse(false, "changeNameBoard", null, false, "");
        boardId = actualResponse.getId();
        Assert.assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void getBoardTest() {
        String boardName = RandomStringUtils.randomAlphabetic(5);
        BoardRequest boardRequest = new BoardRequest("members", true, "blue", true, "disabled", "members", true, boardName, true, "private", "none", "regular", "");
        BoardResponse actualResponse = new BoardController(boardRequest, basePathBoard).addNewBoard();

        String boardIdGenerated = actualResponse.getId();
        actualResponse = new BoardController(boardRequest, basePathBoard).getBoard(boardIdGenerated);
        BoardResponse expectedResponse = new BoardResponse(false, boardName, null, false, "");
        boardId = actualResponse.getId();
        Assert.assertEquals(expectedResponse, actualResponse);
    }
}
