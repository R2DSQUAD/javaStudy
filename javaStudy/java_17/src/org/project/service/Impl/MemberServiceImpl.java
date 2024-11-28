package org.project.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;
import org.project.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Override
	public int save(MemberDto memberDto) {
		System.out.println("회원 가입");
		MemberDao memberDao = MemberDao.getInstance();
		
		int rs = memberDao.findByUserEmail(memberDto.getUserEmail());
		
		if(rs==1) {
			throw new IllegalArgumentException("중복 이메일 입력 실패");
		}
		
		int rs2 = memberDao.save(MemberEntity.toInsertMemberEntity(memberDto));
		if(rs2!=1) {
			throw new IllegalArgumentException("회원가입 실패");
		}
		return rs2;
	}

	@Override
	public List<MemberDto> findAll() {
		System.out.println("회원조회(목록)");
		
		MemberDao dao = MemberDao.getInstance();
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
//		List<MemberEntity> memberEntities=dao.findAll();
		
//		if(memberEntities.isEmpty()) {
//			throw new NullPointerException("조회할 데이터가 업습니다");
//		}
		if(dao.findAll().isEmpty()) {
			throw new NullPointerException("조회할 데이터가 없습니다");
		}
		
//		for(MemberEntity entity:memberEntities) {
//			MemberDto memberDto = MemberDto.toMemberDto(entity);
//			memberDtos.add(memberDto);
//		}
		
//		memberDtos = memberEntities.stream().map(el-> MemberDto.toMemberDto(el)).collect(Collectors.toList());
//		memberDtos = memberEntities.stream().map(MemberDto::toMemberDto).collect(Collectors.toList());
//		return memberDtos;
//		return memberEntities.stream().map(MemberDto::toMemberDto).collect(Collectors.toList());
		return dao.findAll().stream().map(MemberDto::toMemberDto).collect(Collectors.toList());
	}

	@Override
	public MemberDto findbyId(Long memberId) {
		System.out.println("상세조회");
		
		MemberDao memberDao = MemberDao.getInstance();
		MemberEntity memberEntity= memberDao.findById(memberId);
		
		if(memberEntity==null) {
			throw new NullPointerException("존재하지 않은 화면입니다");
		}
		MemberDto memberDto = MemberDto.toMemberDto(memberEntity);
		return memberDto;
		
//		return memberDto.toMemberDto(memberEntity);
	}

	@Override
	public int updateSave(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDto deleteId(Long memberId) {
		System.out.println("회원 삭제");
	
		
		MemberDao memberDao = MemberDao.getInstance();
		MemberEntity memberEntity = memberDao.deleteById(memberId);
		
		if(memberEntity==null) {
			throw new IllegalArgumentException("아이디 삭제 실패");
		}
		
		MemberDto memberDto = MemberDto.toMemberDto(memberEntity);
		
		return memberDto;
	}
	
}
