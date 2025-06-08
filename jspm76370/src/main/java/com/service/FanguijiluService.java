package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanguijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanguijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanguijiluView;


/**
 * 犯规记录
 *
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public interface FanguijiluService extends IService<FanguijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanguijiluVO> selectListVO(Wrapper<FanguijiluEntity> wrapper);
   	
   	FanguijiluVO selectVO(@Param("ew") Wrapper<FanguijiluEntity> wrapper);
   	
   	List<FanguijiluView> selectListView(Wrapper<FanguijiluEntity> wrapper);
   	
   	FanguijiluView selectView(@Param("ew") Wrapper<FanguijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanguijiluEntity> wrapper);
   	
}

