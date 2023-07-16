package com.medplus.insurance.dao;

import java.util.List;

public interface PolicyDetailDao {
public int addPolicyDetail(List<String> ansList, int policynumber, List<String> quesIdList);
}
