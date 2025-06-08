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


import com.dao.BisaichengjiDao;
import com.entity.BisaichengjiEntity;
import com.service.BisaichengjiService;
import com.entity.vo.BisaichengjiVO;
import com.entity.view.BisaichengjiView;

@Service("bisaichengjiService")
public class BisaichengjiServiceImpl extends ServiceImpl<BisaichengjiDao, BisaichengjiEntity> implements BisaichengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BisaichengjiEntity> page = this.selectPage(
                new Query<BisaichengjiEntity>(params).getPage(),
                new EntityWrapper<BisaichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BisaichengjiEntity> wrapper) {
		  Page<BisaichengjiView> page =new Query<BisaichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BisaichengjiVO> selectListVO(Wrapper<BisaichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BisaichengjiVO selectVO(Wrapper<BisaichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BisaichengjiView> selectListView(Wrapper<BisaichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BisaichengjiView selectView(Wrapper<BisaichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
