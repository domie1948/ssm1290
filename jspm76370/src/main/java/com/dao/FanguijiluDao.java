package com.dao;

import com.entity.FanguijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanguijiluVO;
import com.entity.view.FanguijiluView;


/**
 * 犯规记录
 * 
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public interface FanguijiluDao extends BaseMapper<FanguijiluEntity> {
	
	List<FanguijiluVO> selectListVO(@Param("ew") Wrapper<FanguijiluEntity> wrapper);
	
	FanguijiluVO selectVO(@Param("ew") Wrapper<FanguijiluEntity> wrapper);
	
	List<FanguijiluView> selectListView(@Param("ew") Wrapper<FanguijiluEntity> wrapper);

	List<FanguijiluView> selectListView(Pagination page,@Param("ew") Wrapper<FanguijiluEntity> wrapper);
	
	FanguijiluView selectView(@Param("ew") Wrapper<FanguijiluEntity> wrapper);
	
}
