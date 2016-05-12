package com.uwm.projektz.binary.service.impl;

import com.uwm.projektz.binary.converter.BinaryConverter;
import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.dto.BinaryDTOId;
import com.uwm.projektz.binary.ob.BinaryOB;
import com.uwm.projektz.binary.repository.IBinaryRepository;
import com.uwm.projektz.binary.service.IBinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Service
@Transactional
public class BinaryServiceImpl implements IBinaryService {

    @Autowired
    IBinaryRepository binaryRepository;

    @Override
    public BinaryDTOId saveBinary(BinaryDTO aBinaryDTO) {
        return BinaryConverter.converterBinaryOBtoBinaryDTOId(binaryRepository.save(BinaryConverter.converterBinaryDTOtoOB(aBinaryDTO)));
    }

    @Override
    public BinaryDTO findBinaryById(Long aId) {
        return BinaryConverter.converterBinaryOBtoDTO(binaryRepository.findOne(aId));
    }

    @Override
    public List<BinaryDTO> findAllBinary() {
        List<BinaryOB> binaries = binaryRepository.findAll();
        return BinaryConverter.converterBinaryListOBtoDTO(binaries);
    }

    @Override
    public void deleteBinaryById(Long aId) {
        binaryRepository.delete(aId);
    }
}
