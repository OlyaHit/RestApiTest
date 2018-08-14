package models.listModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.util.Objects;


public class ListResponse{

	@JsonProperty("idBoard")
	private String idBoard;

	@JsonProperty("pos")
	private int pos;

	@JsonProperty("name")
	private String name;

	@JsonProperty("closed")
	private boolean closed;

	@JsonProperty("id")
	private String id;

	@JsonProperty("limits")
	private Limits limits;

	public void setIdBoard(String idBoard){
		this.idBoard = idBoard;
	}

	public String getIdBoard(){
		return idBoard;
	}

	public void setPos(int pos){
		this.pos = pos;
	}

	public int getPos(){
		return pos;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setClosed(boolean closed){
		this.closed = closed;
	}

	public boolean isClosed(){
		return closed;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setLimits(Limits limits){
		this.limits = limits;
	}

	public Limits getLimits(){
		return limits;
	}

    public ListResponse() {
    }

    public ListResponse(String idBoard, String name, boolean closed) {
        this.idBoard = idBoard;
        this.name = name;
        this.closed = closed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListResponse that = (ListResponse) o;
        return closed == that.closed &&
                Objects.equals(idBoard, that.idBoard) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBoard, name, closed);
    }
}