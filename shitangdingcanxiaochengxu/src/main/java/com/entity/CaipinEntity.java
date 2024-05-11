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
 * 商品
 *
 * @author 
 * @email
 */
@TableName("caipin")
public class CaipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaipinEntity() {

	}

	public CaipinEntity(T t) {
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
     * 商家
     */
    @TableField(value = "shangjia_id")

    private Integer shangjiaId;


    /**
     * 商品编号
     */
    @TableField(value = "caipin_uuid_number")

    private String caipinUuidNumber;


    /**
     * 商品名称
     */
    @TableField(value = "caipin_name")

    private String caipinName;


    /**
     * 商品照片
     */
    @TableField(value = "caipin_photo")

    private String caipinPhoto;


    /**
     * 商品类型
     */
    @TableField(value = "caipin_types")

    private Integer caipinTypes;


    /**
     * 商品库存
     */
    @TableField(value = "caipin_kucun_number")

    private Integer caipinKucunNumber;


    /**
     * 商品原价
     */
    @TableField(value = "caipin_old_money")

    private Double caipinOldMoney;


    /**
     * 现价
     */
    @TableField(value = "caipin_new_money")

    private Double caipinNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "caipin_clicknum")

    private Integer caipinClicknum;


    /**
     * 商品介绍
     */
    @TableField(value = "caipin_content")

    private String caipinContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "caipin_delete")

    private Integer caipinDelete;


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
	 * 设置：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }
    /**
	 * 获取：商家
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 设置：商品编号
	 */
    public String getCaipinUuidNumber() {
        return caipinUuidNumber;
    }
    /**
	 * 获取：商品编号
	 */

    public void setCaipinUuidNumber(String caipinUuidNumber) {
        this.caipinUuidNumber = caipinUuidNumber;
    }
    /**
	 * 设置：商品名称
	 */
    public String getCaipinName() {
        return caipinName;
    }
    /**
	 * 获取：商品名称
	 */

    public void setCaipinName(String caipinName) {
        this.caipinName = caipinName;
    }
    /**
	 * 设置：商品照片
	 */
    public String getCaipinPhoto() {
        return caipinPhoto;
    }
    /**
	 * 获取：商品照片
	 */

    public void setCaipinPhoto(String caipinPhoto) {
        this.caipinPhoto = caipinPhoto;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getCaipinTypes() {
        return caipinTypes;
    }
    /**
	 * 获取：商品类型
	 */

    public void setCaipinTypes(Integer caipinTypes) {
        this.caipinTypes = caipinTypes;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getCaipinKucunNumber() {
        return caipinKucunNumber;
    }
    /**
	 * 获取：商品库存
	 */

    public void setCaipinKucunNumber(Integer caipinKucunNumber) {
        this.caipinKucunNumber = caipinKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getCaipinOldMoney() {
        return caipinOldMoney;
    }
    /**
	 * 获取：商品原价
	 */

    public void setCaipinOldMoney(Double caipinOldMoney) {
        this.caipinOldMoney = caipinOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getCaipinNewMoney() {
        return caipinNewMoney;
    }
    /**
	 * 获取：现价
	 */

    public void setCaipinNewMoney(Double caipinNewMoney) {
        this.caipinNewMoney = caipinNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getCaipinClicknum() {
        return caipinClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setCaipinClicknum(Integer caipinClicknum) {
        this.caipinClicknum = caipinClicknum;
    }
    /**
	 * 设置：商品介绍
	 */
    public String getCaipinContent() {
        return caipinContent;
    }
    /**
	 * 获取：商品介绍
	 */

    public void setCaipinContent(String caipinContent) {
        this.caipinContent = caipinContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getCaipinDelete() {
        return caipinDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setCaipinDelete(Integer caipinDelete) {
        this.caipinDelete = caipinDelete;
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
        return "Caipin{" +
            "id=" + id +
            ", shangjiaId=" + shangjiaId +
            ", caipinUuidNumber=" + caipinUuidNumber +
            ", caipinName=" + caipinName +
            ", caipinPhoto=" + caipinPhoto +
            ", caipinTypes=" + caipinTypes +
            ", caipinKucunNumber=" + caipinKucunNumber +
            ", caipinOldMoney=" + caipinOldMoney +
            ", caipinNewMoney=" + caipinNewMoney +
            ", caipinClicknum=" + caipinClicknum +
            ", caipinContent=" + caipinContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", caipinDelete=" + caipinDelete +
            ", createTime=" + createTime +
        "}";
    }
}
