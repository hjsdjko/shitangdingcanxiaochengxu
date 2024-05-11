package com.entity.view;

import com.entity.GonglueLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 攻略评论
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gonglue_liuyan")
public class GonglueLiuyanView extends GonglueLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 gonglue
			/**
			* 攻略名称
			*/
			private String gonglueName;
			/**
			* 封面
			*/
			private String gongluePhoto;
			/**
			* 攻略类型
			*/
			private Integer gonglueTypes;
				/**
				* 攻略类型的值
				*/
				private String gonglueValue;
			/**
			* 攻略信息 的 用户
			*/
			private Integer gonglueYonghuId;
			/**
			* 攻略介绍
			*/
			private String gonglueContent;
			/**
			* 逻辑删除
			*/
			private Integer gonglueDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public GonglueLiuyanView() {

	}

	public GonglueLiuyanView(GonglueLiuyanEntity gonglueLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, gonglueLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set gonglue

					/**
					* 获取： 攻略名称
					*/
					public String getGonglueName() {
						return gonglueName;
					}
					/**
					* 设置： 攻略名称
					*/
					public void setGonglueName(String gonglueName) {
						this.gonglueName = gonglueName;
					}

					/**
					* 获取： 封面
					*/
					public String getGongluePhoto() {
						return gongluePhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setGongluePhoto(String gongluePhoto) {
						this.gongluePhoto = gongluePhoto;
					}

					/**
					* 获取： 攻略类型
					*/
					public Integer getGonglueTypes() {
						return gonglueTypes;
					}
					/**
					* 设置： 攻略类型
					*/
					public void setGonglueTypes(Integer gonglueTypes) {
						this.gonglueTypes = gonglueTypes;
					}


						/**
						* 获取： 攻略类型的值
						*/
						public String getGonglueValue() {
							return gonglueValue;
						}
						/**
						* 设置： 攻略类型的值
						*/
						public void setGonglueValue(String gonglueValue) {
							this.gonglueValue = gonglueValue;
						}

					/**
					* 获取：攻略信息 的 用户
					*/
					public Integer getGonglueYonghuId() {
						return gonglueYonghuId;
					}
					/**
					* 设置：攻略信息 的 用户
					*/
					public void setGonglueYonghuId(Integer gonglueYonghuId) {
						this.gonglueYonghuId = gonglueYonghuId;
					}


					/**
					* 获取： 攻略介绍
					*/
					public String getGonglueContent() {
						return gonglueContent;
					}
					/**
					* 设置： 攻略介绍
					*/
					public void setGonglueContent(String gonglueContent) {
						this.gonglueContent = gonglueContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getGonglueDelete() {
						return gonglueDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setGonglueDelete(Integer gonglueDelete) {
						this.gonglueDelete = gonglueDelete;
					}













				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
