package com.store.o2o.service;

import java.util.List;

import com.store.o2o.entity.Area;

public interface AreaService {
	
	public static final String AREALISTKEY = "arealist";
	List<Area> getAreaList();
	
}
