package org.project.service.Impl;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;
import org.project.service.MemberService;

public class MemberServiceImpl implements MemberService{
	
	private MemberDao memberDao;
	private MemberServiceImpl(MemberDao memberDao) {
		this.memberDao=memberDao;
	}

	@Override
	public int insertMember(MemberDto memberDto) {
		System.out.println("회원가입");
		
		//DTO -> Entity
		MemberDao dao = MemberDao.getInstance();
		
		int rs1 = dao.findByUserEmail(memberDto.getUserEmail());
		
		if(rs1==1) {
			throw new IllegalArgumentException("이미 등록된 이메일 입니다.");
		}
		
		MemberEntity memberEntity = MemberEntity.toInsertMemberEntity(memberDto);
		
		int rs2 = dao.memberInsert(memberEntity);
		
		if(rs2==1) {
			System.out.println("회원가입");
		}
		return rs2;
		
		
	}

	@Override
	public List<MemberDto> members() {
		System.out.println("회원 조회(목록)");
		
		List<MemberDto> members = new ArrayList<MemberDto>();	
//		
//		MemberDao dao = MemberDao.getInstance();
//		List<MemberEntity> memberEntity = dao.memberList();
//		
//		if(memberEntity.isEmpty()) {
//			for(MemberEntity entity: memberEntity) {
//				MemberDto dto = MemberDto.toMemberDto(entity);
//				members.add(dto);
//			}
//		}
		return members;
	}

	@Override
	public MemberDto memberDetail(String userEmail) {
		System.out.println("회원 삭제");
		return null;
	}
	
}
