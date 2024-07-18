package com.ganeshgc.autopartsmanagementsystem.service;

import com.ganeshgc.autopartsmanagementsystem.dto.PartsDto;

import java.util.List;

public interface PartsService {
    void saveParts(PartsDto partsDto);
    List<PartsDto> getParts();
    void updateParts(int partsId, PartsDto partsDto);
    void deleteParts(int partsId);
    PartsDto getPartsById(int partsId);


}
