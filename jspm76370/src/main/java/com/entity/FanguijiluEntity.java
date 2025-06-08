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
 * 犯规记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
@TableName("fanguijilu")
public class FanguijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FanguijiluEntity() {
		
	}
	
	public FanguijiluEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 犯规次数
	 */
					
	private String fanguicishu;
	
	/**
	 * 犯规内容
	 */
					
	private String fanguineirong;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 裁判账号
	 */
					
	private String caipanzhanghao;
	
	/**
	 * 裁判姓名
	 */
					
	private String caipanxingming;
	
	
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：犯规次数
	 */
	public void setFanguicishu(String fanguicishu) {
		this.fanguicishu = fanguicishu;
	}
	/**
	 * 获取：犯规次数
	 */
	public String getFanguicishu() {
		return fanguicishu;
	}
	/**
	 * 设置：犯规内容
	 */
	public void setFanguineirong(String fanguineirong) {
		this.fanguineirong = fanguineirong;
	}
	/**
	 * 获取：犯规内容
	 */
	public String getFanguineirong() {
		return fanguineirong;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：裁判账号
	 */
	public void setCaipanzhanghao(String caipanzhanghao) {
		this.caipanzhanghao = caipanzhanghao;
	}
	/**
	 * 获取：裁判账号
	 */
	public String getCaipanzhanghao() {
		return caipanzhanghao;
	}
	/**
	 * 设置：裁判姓名
	 */
	public void setCaipanxingming(String caipanxingming) {
		this.caipanxingming = caipanxingming;
	}
	/**
	 * 获取：裁判姓名
	 */
	public String getCaipanxingming() {
		return caipanxingming;
	}

}
