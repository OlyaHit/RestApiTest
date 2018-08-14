package models.boardModels;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"descData"})
public class BoardResponse {

	private String descData;

	@JsonProperty("pinned")
	private boolean pinned;

	@JsonProperty("name")
	private String name;

	@JsonProperty("idOrganization")
	private String idOrganization;

	@JsonProperty("closed")
	private boolean closed;

	@JsonProperty("desc")
	private String desc;

    @JsonProperty("id")
    private String id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("limits")
    private Limits limits;

    @JsonProperty("prefs")
    private Prefs prefs;

    @JsonProperty("labelNames")
    private LabelNames labelNames;

    @JsonProperty("shortUrl")
    private String shortUrl;

	public BoardResponse() {

	}

	public BoardResponse (boolean pinned, String name, String idOrganization, boolean closed, String desc) {
		this.pinned = pinned;
		this.name = name;
		this.idOrganization = idOrganization;
		this.closed = closed;
		this.desc = desc;
	}

    public String getId() {
        return id;
    }

	public void setPinned(boolean pinned){
		this.pinned = pinned;
	}

	public boolean isPinned(){
		return pinned;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIdOrganization(String idOrganization){
		this.idOrganization = idOrganization;
	}

	public String getIdOrganization(){
		return idOrganization;
	}

	public void setClosed(boolean closed){
		this.closed = closed;
	}

	public boolean isClosed(){
		return closed;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

    public String getDesc(){
		return desc;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardResponse that = (BoardResponse) o;
        return pinned == that.pinned &&
                closed == that.closed &&
                Objects.equals(name, that.name) &&
                Objects.equals(idOrganization, that.idOrganization) &&
                Objects.equals(desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinned, name, idOrganization, closed, desc);
    }
}