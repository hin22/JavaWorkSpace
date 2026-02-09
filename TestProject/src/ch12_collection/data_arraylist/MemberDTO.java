package ch12_collection.data_arraylist;

//회원관리 모듈에서 데이터 교환에 사용할 클래스
//MemberDTO 인스턴스 1개가 1명의 회원을 표현
public class MemberDTO {
	//필드는 private 구성
	
	//기본적으로 반드시 받아야하는 정보 필드
	private String memId; //다른 회원과 중복되면 안되는 정보(db 입장에서 유일정보 : key)
	private String memPass;
	private String memName;
	
	//memPhone과 memAddress는 필수는 아니다
	private String memPhone;
	private String memAddress;
	
	
	//생성자를 통해서 회원의 정보? 인터페이스로 데이터 교환용
	public MemberDTO(String memId, String memPass, String memName, String memPhone, String memAddress) {
		this.memId = memId;
		this.memPass = memPass;
		this.memName = memName;
		this.memPhone = memPhone;
		this.memAddress = memAddress;
	}
	
	//private 필드기 때문에 다른 클래스에서 필드값을 추출하거나 변경하기 위한 메소드가 필요함
	//getter(필드값 반환) / setter(필드값 수정)
	
	//gtter
	public String getMemId() {
		return memId;
	}
	
	//setter
	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPass() {
		return memPass;
	}

	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemAddress() {
		return memAddress;
	}

	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}
	
	
}
