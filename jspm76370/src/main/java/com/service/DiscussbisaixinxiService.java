package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbisaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbisaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbisaixinxiView;


/**
 * 比赛信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public interface DiscussbisaixinxiService extends IService<DiscussbisaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbisaixinxiVO> selectListVO(Wrapper<DiscussbisaixinxiEntity> wrapper);
   	
   	DiscussbisaixinxiVO selectVO(@Param("ew") Wrapper<DiscussbisaixinxiEntity> wrapper);
   	
   	List<DiscussbisaixinxiView> selectListView(Wrapper<DiscussbisaixinxiEntity> wrapper);
   	
   	DiscussbisaixinxiView selectView(@Param("ew") Wrapper<DiscussbisaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbisaixinxiEntity> wrapper);
   	
}

