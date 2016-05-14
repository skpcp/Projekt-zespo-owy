package com.uwm.projektz.binary.converter;

import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.ob.BinaryOB;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class BinaryConverter {
    //Binary
    public static BinaryDTO converterBinaryOBtoDTO(BinaryOB aBinaryOB) {
        if (aBinaryOB == null) return null;
        String binaries = aBinaryOB.getBinary() == null ? null : new String(aBinaryOB.getBinary(), StandardCharsets.UTF_8);
        return new BinaryDTO(aBinaryOB.getId(), aBinaryOB.getTechDate(),binaries);
    }


    //BinaryLists
    public static List<BinaryDTO> converterBinaryListOBtoDTO(List<BinaryOB> aBinaryListOB) {
        if (aBinaryListOB == null) return null;
        List<BinaryDTO> temp = new ArrayList<BinaryDTO>();
        for (BinaryOB element : aBinaryListOB) {
            temp.add(converterBinaryOBtoDTO(element));
        }
        return temp;
    }
}


