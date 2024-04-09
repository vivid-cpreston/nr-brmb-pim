package ca.bc.gov.mal.cirras.underwriting.persistence.v1.dao.mybatis.mapper;

import java.util.List;
import java.util.Map;

import ca.bc.gov.mal.cirras.underwriting.persistence.v1.dto.CommodityTypeCodeDto;

public interface CommodityTypeCodeMapper {
	
	CommodityTypeCodeDto fetch(Map<String, Object> parameters);

	List<CommodityTypeCodeDto> fetchAll(Map<String, Object> parameters);

	int insert(Map<String, Object> parameters);

	int update(Map<String, Object> parameters);

	int delete(Map<String, Object> parameters);
	
	List<CommodityTypeCodeDto> selectByPlan(Map<String, Object> parameters);

	List<CommodityTypeCodeDto> selectByCropCommodityPlan(Map<String, Object> parameters);

}
