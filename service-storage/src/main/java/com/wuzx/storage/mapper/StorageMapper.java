package com.wuzx.storage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuzx.storage.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageMapper extends BaseMapper<Storage> {
}
