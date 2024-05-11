package com.entity.model;

import com.entity.GonglueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 攻略信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GonglueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 用户
     */
    private Integer yonghuId;


    /**
     * 攻略介绍
     */
    private String gonglueContent;


    /**
     * 逻辑删除
     */
    private Integer gonglueDelete;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：攻略名称
	 */
    public String getGonglueName() {
        return gonglueName;
    }


    /**
	 * 设置：攻略名称
	 */
    public void setGonglueName(String gonglueName) {
        this.gonglueName = gonglueName;
    }
    /**
	 * 获取：封面
	 */
    public String getGongluePhoto() {
        return gongluePhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setGongluePhoto(String gongluePhoto) {
        this.gongluePhoto = gongluePhoto;
    }
    /**
	 * 获取：攻略类型
	 */
    public Integer getGonglueTypes() {
        return gonglueTypes;
    }


    /**
	 * 设置：攻略类型
	 */
    public void setGonglueTypes(Integer gonglueTypes) {
        this.gonglueTypes = gonglueTypes;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：攻略介绍
	 */
    public String getGonglueContent() {
        return gonglueContent;
    }


    /**
	 * 设置：攻略介绍
	 */
    public void setGonglueContent(String gonglueContent) {
        this.gonglueContent = gonglueContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getGonglueDelete() {
        return gonglueDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setGonglueDelete(Integer gonglueDelete) {
        this.gonglueDelete = gonglueDelete;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
