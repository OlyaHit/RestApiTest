package models.listModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListRequest {

    @JsonProperty("idBoard")
    private String idBoard;

    @JsonProperty("name")
    private String name;

    @JsonProperty("pos")
    private String pos;

    public ListRequest(String idBoard, String name, String pos) {
        this.idBoard = idBoard;
        this.name = name;
        this.pos = pos;
    }
}
