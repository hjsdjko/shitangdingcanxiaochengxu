package com.dao;

import com.entity.GonglueLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GonglueLiuyanView;

/**
 * 攻略评论 Dao 接口
 *
 * @author 
 */
public interface GonglueLiuyanDao extends BaseMapper<GonglueLiuyanEntity> {

   List<GonglueLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
