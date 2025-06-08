package com.entity.model;

import com.entity.BisaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 比赛信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-20 08:05:26
 */
public class BisaixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 比赛日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
