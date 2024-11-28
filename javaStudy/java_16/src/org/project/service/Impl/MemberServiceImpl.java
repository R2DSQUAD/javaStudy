package org.project.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;
import org.project.service.MemberService;

public class MemberServiceImpl implements MemberService {


	@Override
	public int save(MemberDto memberDto) {
		System.out.println("회원 가입");
		MemberDao memberDao = MemberDao.getInstance();
		//userEmail Check
		int rs = memberDao.emailChecked(memberDto.getUserEmail());
		//이메일 중복 Exception
		if(rs==1) {
			throw new IllegalArgumentException("Fail!! -> 중복 이메일 입니다");
		}
		//Dto -> Entity
		
		int rs2 = memberDao.save(MemberEntity.toInsertMemberEntity(memberDto));
		
		if (rs2!=1) {
			throw new RuntimeException("회원 가입 실패 입니다");
		}
		
		return rs2;
	}

	@Override
	public List<MemberDto> findAll() {
		System.out.println("회원 조회(목록)");
		List<MemberDto> members = new ArrayList<MemberDto>();
		
		//목록 isEmpty()
		//List<Enity> -> List<Dto>
		
		MemberDao dao = MemberDao.getInstance();
		
		List<MemberEntity> memberEntities= dao.findAll();
		
		if(!memberEntities.isEmpty()) {
			for(MemberEntity memberEntity: memberEntities)
			{
				MemberDto memberDto = MemberDto.toMemeberDto(memberEntity);
				members.add(memberDto);
			}
		}
//		List<MemberDto> entities = memberEntities.stream().map(MemberDto::toMemeberDto).collect(Collectors.toList());
//		return memberEntities.stream().map(MemberDto::toMemeberDto).collect(Collectors.toList());
		return members;
	}

	@Override
	public MemberDto findByUserEmail(String UserEmail) {
		System.out.println("회원 조회(상세)");
		//userEmail -> 확인
		//Entity -> Dto
		return null;
	}

	@Override
	public int updateSave(MemberDto memberDto) {
		System.out.println("회원 수정");
		// memberId -> 확인
		//Dto -> Entity
		return 0;
	}

	@Override
	public int deleteId(Long memberId) {
		System.out.println("회원 삭제");
		//memberId -> 확인
		//memberId
		return 0;
	}

}
