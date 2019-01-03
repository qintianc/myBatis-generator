package dao;

import java.util.List;
import model.InterestRecordPolicy;

public interface InterestRecordPolicyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InterestRecordPolicy record);

    InterestRecordPolicy selectByPrimaryKey(Long id);

    List<InterestRecordPolicy> selectAll();

    int updateByPrimaryKey(InterestRecordPolicy record);
}