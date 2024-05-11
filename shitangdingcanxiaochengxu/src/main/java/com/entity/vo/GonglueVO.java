package com.entity.vo;

import com.entity.GonglueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 攻略信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gonglue")
public class GonglueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
