
package trelloConfig;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckItem {
	@SerializedName("idChecklist")
	@Expose
	private String idChecklist;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
	private String name;

	public String getIdChecklist() {
	return idChecklist;
	}

	public CheckItem(){
		
	}
	public CheckItem(String idChecklist, String id, String name) {
		this.idChecklist = idChecklist;
		this.id = id;
		this.name = name;
	}

	public void setIdChecklist(String idChecklist) {
	this.idChecklist = idChecklist;
	}

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
}
	
