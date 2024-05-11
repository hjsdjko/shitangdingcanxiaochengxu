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
 * 攻略信息
 *
 * @author 
 * @email
 */
@TableName("gonglue")
public class GonglueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GonglueEntity() {

	}

	public GonglueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 攻略名称
     */
    @TableField(value = "gonglue_name")

    private String gonglueName;


    /**
     * 封面
     */
    @TableField(value = "gonglue_photo")

    private String gongluePhoto;


    /**
     * 攻略类型
     */
    @TableField(value = "gonglue_types")

    private Integer gonglueTypes;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 攻略介绍
     */
    @TableField(value = "gonglue_content")

    private String gonglueContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "gonglue_delete")

    private Integer gonglueDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：攻略名称
	 */
    public String getGonglueName() {
        return gonglueName;
    }
    /**
	 * 获取：攻略名称
	 */

    public void setGonglueName(String gonglueName) {
        this.gonglueName = gonglueName;
    }
    /**
	 * 设置：封面
	 */
    public String getGongluePhoto() {
        return gongluePhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setGongluePhoto(String gongluePhoto) {
        this.gongluePhoto = gongluePhoto;
    }
    /**
	 * 设置：攻略类型
	 */
    public Integer getGonglueTypes() {
        return gonglueTypes;
    }
    /**
	 * 获取：攻略类型
	 */

    public void setGonglueTypes(Integer gonglueTypes) {
        this.gonglueTypes = gonglueTypes;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：攻略介绍
	 */
    public String getGonglueContent() {
        return gonglueContent;
    }
    /**
	 * 获取：攻略介绍
	 */

    public void setGonglueContent(String gonglueContent) {
        this.gonglueContent = gonglueContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGonglueDelete() {
        return gonglueDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setGonglueDelete(Integer gonglueDelete) {
        this.gonglueDelete = gonglueDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gonglue{" +
            "id=" + id +
            ", gonglueName=" + gonglueName +
            ", gongluePhoto=" + gongluePhoto +
            ", gonglueTypes=" + gonglueTypes +
            ", yonghuId=" + yonghuId +
            ", gonglueContent=" + gonglueContent +
            ", gonglueDelete=" + gonglueDelete +
            ", createTime=" + createTime +
        "}";
    }
}
