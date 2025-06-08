package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaipanDao;
import com.entity.CaipanEntity;
import com.service.CaipanService;
import com.entity.vo.CaipanVO;
import com.entity.view.CaipanView;

@Service("caipanService")
public class CaipanServiceImpl extends ServiceImpl<CaipanDao, CaipanEntity> implements CaipanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipanEntity> page = this.selectPage(
                new Query<CaipanEntity>(params).getPage(),
                new EntityWrapper<CaipanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipanEntity> wrapper) {
		  Page<CaipanView> page =new Query<CaipanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipanVO> selectListVO(Wrapper<CaipanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipanVO selectVO(Wrapper<CaipanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipanView> selectListView(Wrapper<CaipanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipanView selectView(Wrapper<CaipanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
