package multi.com.f.dto;

public class MemberDto {

	private String id,pwe,name,email;
	private int auth;
	
	public MemberDto() {
		
	}

	public MemberDto(String id, String pwe, String name, String email, int auth) {
		super();
		this.id = id;
		this.pwe = pwe;
		this.name = name;
		this.email = email;
		this.auth = auth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwe() {
		return pwe;
	}

	public void setPwe(String pwe) {
		this.pwe = pwe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}
	
}
