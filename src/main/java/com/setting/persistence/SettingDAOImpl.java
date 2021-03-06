package com.setting.persistence;

import com.setting.domain.SettingVO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

/**
 * Created by Jinuk on 2017-07-11.
 */

@Repository
public class SettingDAOImpl implements SettingDAO{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static String namespace = "com.setting.mappers.SettingMapper";

    @Inject
    private SqlSession session;

    @Override
    public List<SettingVO> list(SettingVO settingVO) throws Exception {
        return session.selectList(namespace +".list", settingVO);
    }
}
