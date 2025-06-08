package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 比赛信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
@TableName("bisaixinxi")
public class BisaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BisaixinxiEntity() {
		
	}
	
	public BisaixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 比赛项目
	 */
					
	private String bisaixiangmu;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 比赛日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date bisairiqi;
	
	/**
	 * 比赛地点
	 */
					
	private String bisaididian;
	
	/**
	 * 参赛人数
	 */
					
	private Integer cansairenshu;
	
	/**
	 * 比赛详情
	 */
					
	private String bisaixiangqing;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：比赛项目
	 */
	public void setBisaixiangmu(String bisaixiangmu) {
		this.bisaixiangmu = bisaixiangmu;
	}
	/**
	 * 获取：比赛项目
	 */
	public String getBisaixiangmu() {
		return bisaixiangmu;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：比赛日期
	 */
	public void setBisairiqi(Date bisairiqi) {
		this.bisairiqi = bisairiqi;
	}
	/**
	 * 获取：比赛日期
	 */
	public Date getBisairiqi() {
		return bisairiqi;
	}
	/**
	 * 设置：比赛地点
	 */
	public void setBisaididian(String bisaididian) {
		this.bisaididian = bisaididian;
	}
	/**
	 * 获取：比赛地点
	 */
	public String getBisaididian() {
		return bisaididian;
	}
	/**
	 * 设置：参赛人数
	 */
	public void setCansairenshu(Integer cansairenshu) {
		this.cansairenshu = cansairenshu;
	}
	/**
	 * 获取：参赛人数
	 */
	public Integer getCansairenshu() {
		return cansairenshu;
	}
	/**
	 * 设置：比赛详情
	 */
	public void setBisaixiangqing(String bisaixiangqing) {
		this.bisaixiangqing = bisaixiangqing;
	}
	/**
	 * 获取：比赛详情
	 */
	public String getBisaixiangqing() {
		return bisaixiangqing;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}

}
