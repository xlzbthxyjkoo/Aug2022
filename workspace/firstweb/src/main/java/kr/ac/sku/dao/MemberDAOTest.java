package kr.ac.sku.dao;

import kr.ac.sku.dto.MemberDTO;

public class MemberDAOTest {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
//		MemberDTO member = dao.getMember("sku");		
//		member.setPassword("skupw");
//		member.setName("서경이");
//		dao.updateMember(member);
//		
//		System.out.println(dao.getMember("sku"));
		
		dao.delMember("sku2");
				
	}

}
