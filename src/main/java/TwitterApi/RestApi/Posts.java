package TwitterApi.RestApi;

public class Posts {
	public Posts(String id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	private String id;
	private String title;
	private String author;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return author;
	}

	public void setBody(String body) {
		this.author = body;
	}


	
//	public Posts(String userId, String id, String title, String body) {
//		this.userId = userId;
//		this.id = id;
//		this.title = title;
//		this.body = body;
//	}
	
}
