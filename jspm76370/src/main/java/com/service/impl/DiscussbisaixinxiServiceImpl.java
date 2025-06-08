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


import com.dao.DiscussbisaixinxiDao;
import com.entity.DiscussbisaixinxiEntity;
import com.service.DiscussbisaixinxiService;
import com.entity.vo.DiscussbisaixinxiVO;
import com.entity.view.DiscussbisaixinxiView;

@Service("discussbisaixinxiService")
public class DiscussbisaixinxiServiceImpl extends ServiceImpl<DiscussbisaixinxiDao, DiscussbisaixinxiEntity> implements DiscussbisaixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbisaixinxiEntity> page = this.selectPage(
                new Query<DiscussbisaixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussbisaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbisaixinxiEntity> wrapper) {
		  Page<DiscussbisaixinxiView> page =new Query<DiscussbisaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbisaixinxiVO> selectListVO(Wrapper<DiscussbisaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbisaixinxiVO selectVO(Wrapper<DiscussbisaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbisaixinxiView> selectListView(Wrapper<DiscussbisaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbisaixinxiView selectView(Wrapper<DiscussbisaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
