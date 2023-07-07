package com.example.winwin.mapper.board;

import com.example.winwin.dto.board.CommunityDto;
import com.example.winwin.vo.board.CommunityVo;
import com.example.winwin.vo.board.CommunityProfileVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityMapper {
//    추가
    public void insert(CommunityDto communityDto);
//    삭제
    public void delete(Long communityNumber);
//    수정
    public void update(CommunityDto communityDto);
//    조회
    public CommunityVo select(Long communityNumber);
//    전체조회
    public List<CommunityVo> selectAll(CommunityVo communityVo);
//    조회수증가
    public int upHit(Long communityNumber);
//    댓글수조회
    public int commentCnt(Long communityNumber);
//    프로필조회
    public List<CommunityProfileVo> selectUserProfile(Long userNumber);

}
