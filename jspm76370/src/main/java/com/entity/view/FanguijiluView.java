package com.entity.view;

import com.entity.FanguijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 犯规记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
@TableName("fanguijilu")
public class FanguijiluView  extends FanguijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanguijiluView(){
	}
 
 	public FanguijiluView(FanguijiluEntity fanguijiluEntity){
 	try {
			BeanUtils.copyProperties(this, fanguijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
