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


import com.dao.SaishibaomingDao;
import com.entity.SaishibaomingEntity;
import com.service.SaishibaomingService;
import com.entity.vo.SaishibaomingVO;
import com.entity.view.SaishibaomingView;

@Service("saishibaomingService")
public class SaishibaomingServiceImpl extends ServiceImpl<SaishibaomingDao, SaishibaomingEntity> implements SaishibaomingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishibaomingEntity> page = this.selectPage(
                new Query<SaishibaomingEntity>(params).getPage(),
                new EntityWrapper<SaishibaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishibaomingEntity> wrapper) {
		  Page<SaishibaomingView> page =new Query<SaishibaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishibaomingVO> selectListVO(Wrapper<SaishibaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishibaomingVO selectVO(Wrapper<SaishibaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishibaomingView> selectListView(Wrapper<SaishibaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishibaomingView selectView(Wrapper<SaishibaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
