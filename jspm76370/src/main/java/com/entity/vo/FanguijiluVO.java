package com.entity.vo;

import com.entity.FanguijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 犯规记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public class FanguijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
