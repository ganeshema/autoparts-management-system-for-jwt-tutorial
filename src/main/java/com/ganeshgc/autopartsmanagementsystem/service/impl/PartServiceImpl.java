package com.ganeshgc.autopartsmanagementsystem.service.impl;

import com.ganeshgc.autopartsmanagementsystem.dto.PartsDto;
import com.ganeshgc.autopartsmanagementsystem.model.PartEntity;
import com.ganeshgc.autopartsmanagementsystem.repository.PartsRepository;
import com.ganeshgc.autopartsmanagementsystem.service.PartsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PartServiceImpl implements PartsService {

    @Autowired
    private PartsRepository partsRepository;

    @Override
    public void saveParts(PartsDto partsDto) {
        PartEntity partEntity = new PartEntity();
        BeanUtils.copyProperties(partsDto, partEntity);
        partsRepository.save(partEntity);

    }

    @Override
    public List<PartsDto> getParts() {
        List<PartEntity> partEntities = partsRepository.findAll();
        List<PartsDto> partsDtos = new ArrayList<>();
        for (PartEntity partEntity : partEntities) {
            PartsDto partsDto = new PartsDto();
            BeanUtils.copyProperties(partEntity, partsDto);
            partsDtos.add(partsDto);
        }
        return partsDtos;
    }

    @Override
    public void updateParts(int partsId, PartsDto partsDto) {
        PartEntity partEntity = partsRepository.findById(partsId).orElseThrow(()->new RuntimeException("Part is not available with thid id" + partsId));
        BeanUtils.copyProperties(partsDto, partEntity);
        partsRepository.save(partEntity);
    }

    @Override
    public void deleteParts(int partsid) {
        partsRepository.deleteById(partsid);
    }

    @Override
    public PartsDto getPartsById(int partsId) {
        PartEntity partEntity = partsRepository.findById(partsId).orElse(null);
        PartsDto partsDto = new PartsDto();
        BeanUtils.copyProperties(partEntity, partsDto);
        return partsDto;
    }
}
