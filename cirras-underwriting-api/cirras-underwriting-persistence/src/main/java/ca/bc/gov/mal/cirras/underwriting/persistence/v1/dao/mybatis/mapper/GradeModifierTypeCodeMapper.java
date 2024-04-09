package ca.bc.gov.mal.cirras.underwriting.persistence.v1.dao.mybatis.mapper;

import java.util.List;
import java.util.Map;

import ca.bc.gov.mal.cirras.underwriting.persistence.v1.dto.GradeModifierTypeCodeDto;

public interface GradeModifierTypeCodeMapper {
	
	GradeModifierTypeCodeDto fetch(Map<String, Object> parameters);

	List<GradeModifierTypeCodeDto> fetchAll(Map<String, Object> parameters);

	int insert(Map<String, Object> parameters);

	int update(Map<String, Object> parameters);

	int delete(Map<String, Object> parameters);
	
	List<GradeModifierTypeCodeDto> select(Map<String, Object> parameters);
}
