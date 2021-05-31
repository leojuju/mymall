package cn.leo.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:55:34
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

