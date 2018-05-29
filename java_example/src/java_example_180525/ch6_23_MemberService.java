package java_example_180525;

import java.util.*;

public class ch6_23_MemberService {
	String id ;
	String pass ;
	
	
	boolean login (String id, String pass) {
		if(!this.id.equals(id) && !this.pass.equals(pass)) {
			return false;
		}
		return true;
	}
	public void logout() {
		System.out.println(/*this.id+"님이 로그아웃 되었습니다."*/);
		}
	}

