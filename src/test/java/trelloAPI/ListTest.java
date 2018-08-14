package trelloAPI;

import controllers.boardControllers.BoardController;
import controllers.boardControllers.ListController;
import models.boardModels.BoardRequest;
import models.boardModels.BoardResponse;
import models.listModel.ListRequest;
import models.listModel.ListResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class ListTest {
    private String basePathBoard = "/1/boards/";
    private String boardId;

   @After
   public void deleteBoardAfterTest() {
        new BoardController(basePathBoard).deleteBoard(boardId);
    }

    @Test
    public void addListToBoardTest() {
        String boardName = RandomStringUtils.randomAlphabetic(5);
        BoardRequest boardRequest = new BoardRequest("members", true, "blue", true, "disabled", "members", true, boardName, true, "private", "none", "regular", "");
        BoardResponse createdBoard = new BoardController(boardRequest, basePathBoard).addNewBoard();
        String boardIdGenerated = createdBoard.getId();
        String basePathList = "/1/boards/" + boardIdGenerated + "/lists/";
        boardId = boardIdGenerated;

        ListRequest listRequest = new ListRequest(boardIdGenerated, "listToDo", "top");
        ListResponse actualResponse = new ListController(listRequest, basePathList).addNewList();
        ListResponse expectedResponse = new ListResponse(boardIdGenerated, "listToDo", false);
        Assert.assertEquals(expectedResponse, actualResponse);
    }
}
