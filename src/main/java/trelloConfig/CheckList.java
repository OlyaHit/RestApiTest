
package trelloConfig;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckList {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CheckList [id=" + id + ", name=" + name + ", closed=" + closed + ", idBoard=" + idBoard + ", pos=" + pos
				+ ", subscribed=" + subscribed + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckList other = (CheckList) obj;
		if (closed == null) {
			if (other.closed != null)
				return false;
		} else if (!closed.equals(other.closed))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idBoard == null) {
			if (other.idBoard != null)
				return false;
		} else if (!idBoard.equals(other.idBoard))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pos == null) {
			if (other.pos != null)
				return false;
		} else if (!pos.equals(other.pos))
			return false;
		if (subscribed == null) {
			if (other.subscribed != null)
				return false;
		} else if (!subscribed.equals(other.subscribed))
			return false;
		return true;
	}
	public CheckList(){
		
	}
    public CheckList(String id, String name, Boolean closed, String idBoard, Integer pos, Boolean subscribed) {
		this.id = id;
		this.name = name;
		this.closed = closed;
		this.idBoard = idBoard;
		this.pos = pos;
		this.subscribed = subscribed;
	}

	@SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("pos")
    @Expose
    private Integer pos;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }
    
}
