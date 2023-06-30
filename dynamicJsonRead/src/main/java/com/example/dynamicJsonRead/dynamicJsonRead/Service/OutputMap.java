package com.example.dynamicJsonRead.dynamicJsonRead.Service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.dynamicJsonRead.dynamicJsonRead.Controller.getMapping;
import com.example.dynamicJsonRead.dynamicJsonRead.Dto.PlanogramDetail;
import com.example.dynamicJsonRead.dynamicJsonRead.Dto.Proforma;
import com.example.dynamicJsonRead.dynamicJsonRead.Dto.RootDto;
import com.example.dynamicJsonRead.dynamicJsonRead.model.Itemplanogram;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.LongStream;

@Component
public class OutputMap {

    @Autowired
    Proforma proforma;
    @Autowired
    RootDto rootDto;
    @Autowired
    getMapping getMapping;



    public void rootmap(String offerId, String timestamp, List<Itemplanogram> itemplanogramsList, String docNumber, String effedate) throws IOException{
        final Logger logger = LoggerFactory.getLogger(OutputMap.class);
        proforma.setDocNumber(docNumber);
        proforma.setEffDate(effedate);
        rootDto.setProformas(new ArrayList<>(Collections.singletonList(proforma)));
        //System.out.println("docNumber :" + proforma.getDocNumber() );
        //System.out.println("effeDate :" + proforma.getEffDate() );

        rootDto.setOfferId(offerId);
        rootDto.setImportParameterTimestamp(timestamp);
        //System.out.println("offerId :" + rootDto.getOfferId() );
        //System.out.println("timestamp :" + rootDto.getImportParameterTimestamp());

        List<PlanogramDetail> planogramDetailList = new ArrayList<>();

        for (Itemplanogram itemplanogram : itemplanogramsList) {
            PlanogramDetail planogramDetail = new PlanogramDetail();
            planogramDetail.setPlanogramId(itemplanogram.getPlanogramId());
            planogramDetail.setPlanogramName(itemplanogram.getPlanogramName());

            planogramDetailList.add(planogramDetail);
        }

        rootDto.setPlanogramDetails((ArrayList<PlanogramDetail>) planogramDetailList);

        if (rootDto.getOfferId() == null) {
            throw new IOException("Offer ID is null");
        }
        //System.out.println( rootDto.getPlanogramDetails());
        logger.info("rootDtojson : {}", rootDto);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStringRootdto = objectMapper.writeValueAsString(rootDto);

        logger.info("rootDtojsonString : {}", jsonStringRootdto);
           getMapping.pass(jsonStringRootdto);

        /*for (PlanogramDetail planogramDetail : planogramDetailList) {
            System.out.println("planogramId :" + planogramDetail.getPlanogramId());
            System.out.println("planogramName :" + planogramDetail.getPlanogramName());
        }*/
    }

}
