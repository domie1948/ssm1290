package com.entity.view;

import com.entity.SaishibaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛事报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
@TableName("saishibaoming")
public class SaishibaomingView  extends SaishibaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SaishibaomingView(){
	}
 
 	public SaishibaomingView(SaishibaomingEntity saishibaomingEntity){
 	try {
			BeanUtils.copyProperties(this, saishibaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
