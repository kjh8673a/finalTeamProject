package com.campus.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.campus.myapp.vo.AdminPagingVO;
import com.campus.myapp.vo.AnimalInfoVO;
import com.campus.myapp.vo.MemberVO;

@Mapper
@Repository
public interface AdminDAO {
	public List<AnimalInfoVO> animalInfoList(AdminPagingVO apVO);
	public int animalInfoTotalRecord(AdminPagingVO apVO);
	public int animalInfoInsert(AnimalInfoVO vo);
	public AnimalInfoVO animalInfoGetFileName(String breedkey);
	public int animalInfoDataDelete(String breedkey);
	public AnimalInfoVO animalInfoEditView(String breedkey);
	public int animalInfoUpdate(AnimalInfoVO vo);
	
	public List<MemberVO> memberList(AdminPagingVO apVO);
	public int memberTotalRecord(AdminPagingVO apVO);
	public int memberDelete(String userid);
	public int memberChangeAdmin(String userid);
	public int memberChangeNormal(String userid);
	public int memberChangeStop(String userid);

	
	
}
