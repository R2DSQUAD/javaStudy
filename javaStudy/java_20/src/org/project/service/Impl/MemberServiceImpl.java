package org.project.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;
import org.project.service.MemberService;

// @Service -> 스프링 빈
public class MemberServiceImpl implements MemberService {

	@Override
	public int save(MemberDto memberDto) {
		System.out.println("회원가입");
		MemberDao dao = MemberDao.getInstance();

//		Optional<MemberEntity> meOptional = dao.findByUserEmail(memberDto.getUserEmail());
//		if(!meOptional.isPresent()) {
//			throw new IllegalArgumentException("Fail -> 이미 등록된 이메일 입니다.");
//		}

		int rs = dao.findByUserEmail(memberDto.getUserEmail());

		if (rs == 1) {
			throw new IllegalArgumentException("Fail -> 이미 등록된 이메일 입니다.");
		}

		int rs2 = dao.save(MemberEntity.toInsertMemberEntity(memberDto));

		if (rs2 != 1) {
			throw new IllegalArgumentException("회원가입 실패");
		}

		return rs2;
	}

	@Override
	public List<MemberDto> findAll() {
		MemberDao dao = MemberDao.getInstance();
		List<MemberEntity> memberEntities = dao.findAll();

		if (!memberEntities.isEmpty()) {
			return memberEntities.stream().map(MemberDto::toMemberDto).collect(Collectors.toList());
		}
		throw new NullPointerException("조회할 데이터가 없습니다");
	}

	@Override
	public MemberDto findbyId(Long memberId) {
		MemberDao dao = MemberDao.getInstance();
		MemberEntity memberEntity = dao.findById(memberId);
		
		if (memberEntity == null) {
			throw new NullPointerException("삭제할 아이디가 없습니다.");
		}
		return MemberDto.toMemberDto(memberEntity);
	}

	@Override
	public int updateSave(MemberDto memberDto) {
		MemberDao dao = MemberDao.getInstance();
		MemberEntity memberEntity = dao.findById(memberDto.getMemberId());
		
		if (memberEntity == null) {
			throw new IllegalArgumentException("수정할 아이디가 없습니다.");
		}
		
		//Spring Boot JPA -> 회원가입, 회원수정 -> save()
		//회원 가입 -> 아이디X -> DB테이블에 중복되는 아이디 없으면 회원가입
		//회원 수정 -> 아이디O -> DB테이블에 종복되는 아이디가 있으면 회원 수정
		
		dao.saveUpdate(MemberEntity.toUpdateMemberEntity(memberDto));
		return 1;
	}

	@Override
	public int deleteId(Long memberId) {
		MemberDao dao = MemberDao.getInstance();
		MemberEntity memberEntity = dao.findById(memberId);
		
		if (memberEntity == null) {
			throw new NullPointerException("삭제할 아이디가 없습니다.");
		}
		dao.deleteById(memberId);
		
		return 1;
	}

}
