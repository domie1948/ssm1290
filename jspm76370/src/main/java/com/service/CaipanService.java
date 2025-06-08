package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipanView;


/**
 * 裁判
 *
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public interface CaipanService extends IService<CaipanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipanVO> selectListVO(Wrapper<CaipanEntity> wrapper);
   	
   	CaipanVO selectVO(@Param("ew") Wrapper<CaipanEntity> wrapper);
   	
   	List<CaipanView> selectListView(Wrapper<CaipanEntity> wrapper);
   	
   	CaipanView selectView(@Param("ew") Wrapper<CaipanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipanEntity> wrapper);
   	
}

