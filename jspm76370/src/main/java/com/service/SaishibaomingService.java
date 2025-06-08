package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishibaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishibaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishibaomingView;


/**
 * 赛事报名
 *
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public interface SaishibaomingService extends IService<SaishibaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishibaomingVO> selectListVO(Wrapper<SaishibaomingEntity> wrapper);
   	
   	SaishibaomingVO selectVO(@Param("ew") Wrapper<SaishibaomingEntity> wrapper);
   	
   	List<SaishibaomingView> selectListView(Wrapper<SaishibaomingEntity> wrapper);
   	
   	SaishibaomingView selectView(@Param("ew") Wrapper<SaishibaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishibaomingEntity> wrapper);
   	
}

