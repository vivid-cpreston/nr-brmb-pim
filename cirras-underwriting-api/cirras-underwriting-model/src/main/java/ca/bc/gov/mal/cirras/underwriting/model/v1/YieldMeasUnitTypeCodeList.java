package ca.bc.gov.mal.cirras.underwriting.model.v1;

import java.io.Serializable;
import java.util.List;

public interface YieldMeasUnitTypeCodeList<E extends YieldMeasUnitTypeCode> extends Serializable {
	public List<E> getCollection();
	public void setCollection(List<E> collection);
}