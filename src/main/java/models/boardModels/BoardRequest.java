package models.boardModels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoardRequest {

	@JsonProperty("prefs_comments")
	private String prefsComments;

	@JsonProperty("prefs_cardCovers")
	private boolean prefsCardCovers;

	@JsonProperty("prefs_background")
	private String prefsBackground;

	@JsonProperty("defaultLabels")
	private boolean defaultLabels;

	@JsonProperty("prefs_voting")
	private String prefsVoting;

	@JsonProperty("prefs_invitations")
	private String prefsInvitations;

	@JsonProperty("prefs_selfJoin")
	private boolean prefsSelfJoin;

	@JsonProperty("name")
	private String name;

	@JsonProperty("defaultLists")
	private boolean defaultLists;

	@JsonProperty("prefs_permissionLevel")
	private String prefsPermissionLevel;

	@JsonProperty("desc")
	private String desc;

	public BoardRequest(String prefsComments, boolean prefsCardCovers, String prefsBackground, boolean defaultLabels, String prefsVoting, String prefsInvitations, boolean prefsSelfJoin, String name, boolean defaultLists, String prefsPermissionLevel, String keepFromSource, String prefsCardAging, String desc) {
		this.prefsComments = prefsComments;
		this.prefsCardCovers = prefsCardCovers;
		this.prefsBackground = prefsBackground;
		this.defaultLabels = defaultLabels;
		this.prefsVoting = prefsVoting;
		this.prefsInvitations = prefsInvitations;
		this.prefsSelfJoin = prefsSelfJoin;
		this.name = name;
		this.defaultLists = defaultLists;
		this.prefsPermissionLevel = prefsPermissionLevel;
		this.keepFromSource = keepFromSource;
		this.prefsCardAging = prefsCardAging;
		this.desc = desc;
	}

	@JsonProperty("keepFromSource")

	private String keepFromSource;

	@JsonProperty("prefs_cardAging")
	private String prefsCardAging;

	public void setPrefsComments(String prefsComments){
		this.prefsComments = prefsComments;
	}

	public String getPrefsComments(){
		return prefsComments;
	}

	public void setPrefsCardCovers(boolean prefsCardCovers){
		this.prefsCardCovers = prefsCardCovers;
	}

	public boolean getPrefsCardCovers(){
		return prefsCardCovers;
	}

	public void setPrefsBackground(String prefsBackground){
		this.prefsBackground = prefsBackground;
	}

	public String getPrefsBackground(){
		return prefsBackground;
	}

	public void setDefaultLabels(boolean defaultLabels){
		this.defaultLabels = defaultLabels;
	}

	public boolean getDefaultLabels(){
		return defaultLabels;
	}

	public void setPrefsVoting(String prefsVoting){
		this.prefsVoting = prefsVoting;
	}

	public String getPrefsVoting(){
		return prefsVoting;
	}

	public void setPrefsInvitations(String prefsInvitations){
		this.prefsInvitations = prefsInvitations;
	}

	public String getPrefsInvitations(){
		return prefsInvitations;
	}

	public void setPrefsSelfJoin(boolean prefsSelfJoin){
		this.prefsSelfJoin = prefsSelfJoin;
	}

	public boolean getPrefsSelfJoin(){
		return prefsSelfJoin;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDefaultLists(boolean defaultLists){
		this.defaultLists = defaultLists;
	}

	public boolean getDefaultLists(){
		return defaultLists;
	}

	public void setPrefsPermissionLevel(String prefsPermissionLevel){
		this.prefsPermissionLevel = prefsPermissionLevel;
	}

	public String getPrefsPermissionLevel(){
		return prefsPermissionLevel;
	}

	public void setKeepFromSource(String keepFromSource){
		this.keepFromSource = keepFromSource;
	}

	public String getKeepFromSource(){
		return keepFromSource;
	}

	public void setPrefsCardAging(String prefsCardAging){
		this.prefsCardAging = prefsCardAging;
	}

	public String getPrefsCardAging(){
		return prefsCardAging;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}