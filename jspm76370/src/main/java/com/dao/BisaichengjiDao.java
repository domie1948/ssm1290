package com.dao;

import com.entity.BisaichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BisaichengjiVO;
import com.entity.view.BisaichengjiView;


/**
 * 比赛成绩
 * 
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public interface BisaichengjiDao extends BaseMapper<BisaichengjiEntity> {
	
	List<BisaichengjiVO> selectListVO(@Param("ew") Wrapper<BisaichengjiEntity> wrapper);
	
	BisaichengjiVO selectVO(@Param("ew") Wrapper<BisaichengjiEntity> wrapper);
	
	List<BisaichengjiView> selectListView(@Param("ew") Wrapper<BisaichengjiEntity> wrapper);

	List<BisaichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<BisaichengjiEntity> wrapper);
	
	BisaichengjiView selectView(@Param("ew") Wrapper<BisaichengjiEntity> wrapper);
	
}
