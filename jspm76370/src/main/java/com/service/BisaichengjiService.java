package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BisaichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BisaichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BisaichengjiView;


/**
 * 比赛成绩
 *
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public interface BisaichengjiService extends IService<BisaichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BisaichengjiVO> selectListVO(Wrapper<BisaichengjiEntity> wrapper);
   	
   	BisaichengjiVO selectVO(@Param("ew") Wrapper<BisaichengjiEntity> wrapper);
   	
   	List<BisaichengjiView> selectListView(Wrapper<BisaichengjiEntity> wrapper);
   	
   	BisaichengjiView selectView(@Param("ew") Wrapper<BisaichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BisaichengjiEntity> wrapper);
   	
}

