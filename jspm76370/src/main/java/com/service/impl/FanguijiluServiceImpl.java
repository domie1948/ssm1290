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


import com.dao.FanguijiluDao;
import com.entity.FanguijiluEntity;
import com.service.FanguijiluService;
import com.entity.vo.FanguijiluVO;
import com.entity.view.FanguijiluView;

@Service("fanguijiluService")
public class FanguijiluServiceImpl extends ServiceImpl<FanguijiluDao, FanguijiluEntity> implements FanguijiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanguijiluEntity> page = this.selectPage(
                new Query<FanguijiluEntity>(params).getPage(),
                new EntityWrapper<FanguijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanguijiluEntity> wrapper) {
		  Page<FanguijiluView> page =new Query<FanguijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanguijiluVO> selectListVO(Wrapper<FanguijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanguijiluVO selectVO(Wrapper<FanguijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanguijiluView> selectListView(Wrapper<FanguijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanguijiluView selectView(Wrapper<FanguijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
