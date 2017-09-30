
package trelloConfig;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoardCheckList {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("checkItems")
    @Expose
    private CheckItem []  checkItems ;

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

    public CheckItem[] getCheckItems() {
    return checkItems;
    }

    public void setCheckItems(CheckItem[] checkItems) {
    this.checkItems = checkItems;
    }


}
