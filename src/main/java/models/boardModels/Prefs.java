package models.boardModels;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Prefs{

	@JsonProperty("backgroundBrightness")
	private String backgroundBrightness;

	@JsonProperty("backgroundColor")
	private String backgroundColor;

	@JsonProperty("comments")
	private String comments;

	@JsonProperty("backgroundTopColor")
	private String backgroundTopColor;

	@JsonProperty("backgroundImage")
	private Object backgroundImage;

	@JsonProperty("canBeOrg")
	private boolean canBeOrg;

	@JsonProperty("backgroundBottomColor")
	private String backgroundBottomColor;

	@JsonProperty("voting")
	private String voting;

	@JsonProperty("calendarFeedEnabled")
	private boolean calendarFeedEnabled;

	@JsonProperty("backgroundTile")
	private boolean backgroundTile;

	@JsonProperty("canBePublic")
	private boolean canBePublic;

	@JsonProperty("canBePrivate")
	private boolean canBePrivate;

	@JsonProperty("backgroundImageScaled")
	private Object backgroundImageScaled;

	@JsonProperty("permissionLevel")
	private String permissionLevel;

	@JsonProperty("cardAging")
	private String cardAging;

	@JsonProperty("canInvite")
	private boolean canInvite;

	@JsonProperty("invitations")
	private String invitations;

	@JsonProperty("background")
	private String background;

	@JsonProperty("cardCovers")
	private boolean cardCovers;

	@JsonProperty("selfJoin")
	private boolean selfJoin;

	public void setBackgroundBrightness(String backgroundBrightness){
		this.backgroundBrightness = backgroundBrightness;
	}

	public String getBackgroundBrightness(){
		return backgroundBrightness;
	}

	public void setBackgroundColor(String backgroundColor){
		this.backgroundColor = backgroundColor;
	}

	public String getBackgroundColor(){
		return backgroundColor;
	}

	public void setComments(String comments){
		this.comments = comments;
	}

	public String getComments(){
		return comments;
	}

	public void setBackgroundTopColor(String backgroundTopColor){
		this.backgroundTopColor = backgroundTopColor;
	}

	public String getBackgroundTopColor(){
		return backgroundTopColor;
	}

	public void setBackgroundImage(Object backgroundImage){
		this.backgroundImage = backgroundImage;
	}

	public Object getBackgroundImage(){
		return backgroundImage;
	}

	public void setCanBeOrg(boolean canBeOrg){
		this.canBeOrg = canBeOrg;
	}

	public boolean isCanBeOrg(){
		return canBeOrg;
	}

	public void setBackgroundBottomColor(String backgroundBottomColor){
		this.backgroundBottomColor = backgroundBottomColor;
	}

	public String getBackgroundBottomColor(){
		return backgroundBottomColor;
	}

	public void setVoting(String voting){
		this.voting = voting;
	}

	public String getVoting(){
		return voting;
	}

	public void setCalendarFeedEnabled(boolean calendarFeedEnabled){
		this.calendarFeedEnabled = calendarFeedEnabled;
	}

	public boolean isCalendarFeedEnabled(){
		return calendarFeedEnabled;
	}

	public void setBackgroundTile(boolean backgroundTile){
		this.backgroundTile = backgroundTile;
	}

	public boolean isBackgroundTile(){
		return backgroundTile;
	}

	public void setCanBePublic(boolean canBePublic){
		this.canBePublic = canBePublic;
	}

	public boolean isCanBePublic(){
		return canBePublic;
	}

	public void setCanBePrivate(boolean canBePrivate){
		this.canBePrivate = canBePrivate;
	}

	public boolean isCanBePrivate(){
		return canBePrivate;
	}

	public void setBackgroundImageScaled(Object backgroundImageScaled){
		this.backgroundImageScaled = backgroundImageScaled;
	}

	public Object getBackgroundImageScaled(){
		return backgroundImageScaled;
	}

	public void setPermissionLevel(String permissionLevel){
		this.permissionLevel = permissionLevel;
	}

	public String getPermissionLevel(){
		return permissionLevel;
	}

	public void setCardAging(String cardAging){
		this.cardAging = cardAging;
	}

	public String getCardAging(){
		return cardAging;
	}

	public void setCanInvite(boolean canInvite){
		this.canInvite = canInvite;
	}

	public boolean isCanInvite(){
		return canInvite;
	}

	public void setInvitations(String invitations){
		this.invitations = invitations;
	}

	public String getInvitations(){
		return invitations;
	}

	public void setBackground(String background){
		this.background = background;
	}

	public String getBackground(){
		return background;
	}

	public void setCardCovers(boolean cardCovers){
		this.cardCovers = cardCovers;
	}

	public boolean isCardCovers(){
		return cardCovers;
	}

	public void setSelfJoin(boolean selfJoin){
		this.selfJoin = selfJoin;
	}

	public boolean isSelfJoin(){
		return selfJoin;
	}

	@Override
 	public String toString(){
		return 
			"Prefs{" + 
			"backgroundBrightness = '" + backgroundBrightness + '\'' + 
			",backgroundColor = '" + backgroundColor + '\'' + 
			",comments = '" + comments + '\'' + 
			",backgroundTopColor = '" + backgroundTopColor + '\'' + 
			",backgroundImage = '" + backgroundImage + '\'' + 
			",canBeOrg = '" + canBeOrg + '\'' + 
			",backgroundBottomColor = '" + backgroundBottomColor + '\'' + 
			",voting = '" + voting + '\'' + 
			",calendarFeedEnabled = '" + calendarFeedEnabled + '\'' + 
			",backgroundTile = '" + backgroundTile + '\'' + 
			",canBePublic = '" + canBePublic + '\'' + 
			",canBePrivate = '" + canBePrivate + '\'' + 
			",backgroundImageScaled = '" + backgroundImageScaled + '\'' + 
			",permissionLevel = '" + permissionLevel + '\'' + 
			",cardAging = '" + cardAging + '\'' + 
			",canInvite = '" + canInvite + '\'' + 
			",invitations = '" + invitations + '\'' + 
			",background = '" + background + '\'' + 
			",cardCovers = '" + cardCovers + '\'' + 
			",selfJoin = '" + selfJoin + '\'' + 
			"}";
		}
}