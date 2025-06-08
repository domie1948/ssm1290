package com.dao;

import com.entity.DiscussbisaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbisaixinxiVO;
import com.entity.view.DiscussbisaixinxiView;


/**
 * 比赛信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public interface DiscussbisaixinxiDao extends BaseMapper<DiscussbisaixinxiEntity> {
	
	List<DiscussbisaixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussbisaixinxiEntity> wrapper);
	
	DiscussbisaixinxiVO selectVO(@Param("ew") Wrapper<DiscussbisaixinxiEntity> wrapper);
	
	List<DiscussbisaixinxiView> selectListView(@Param("ew") Wrapper<DiscussbisaixinxiEntity> wrapper);

	List<DiscussbisaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbisaixinxiEntity> wrapper);
	
	DiscussbisaixinxiView selectView(@Param("ew") Wrapper<DiscussbisaixinxiEntity> wrapper);
	
}
