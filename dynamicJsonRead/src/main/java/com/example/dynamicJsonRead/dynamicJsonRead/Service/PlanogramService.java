package com.example.dynamicJsonRead.dynamicJsonRead.Service;

import com.example.dynamicJsonRead.dynamicJsonRead.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PlanogramService {

@Autowired
OutputMap outputMap;

    public void getPlanoIdList(Root root) throws IOException {

        String docNumber=null;
        String effedate=null;

        String timestamp = root.getImportParameterTimestamp();
        //System.out.println("Timestamp: " + timestamp);
        String offerId = root.getOfferId();

        ItOffer itOffer = root.getItOffer();
        Proformas proformas = null;
        if (itOffer != null) {
            ItemItOffer itemItOffer = itOffer.getItemItOffer();
            if (itemItOffer != null) {
                String internalSalesOrg = itemItOffer.getInternalSalesOrg();
                String currency = itemItOffer.getCurrency();
                //System.out.println("Internal Sales Org: " + internalSalesOrg);
                //System.out.println("Currency: " + currency);

                ZshowMat zshowMat = itemItOffer.getZshowMat();
                if (zshowMat != null) {
                    List<ItemzshowMat> itemzshowMatList = zshowMat.getItemzshowMat();
                    for (ItemzshowMat itemzshowMat : itemzshowMatList) {
                        proformas = itemzshowMat.getProformas();
                        if (proformas != null) {
                            List<Itemproforma> itemproformasList = proformas.getItemproformas();


                            for (Itemproforma itemproformas : itemproformasList) {
                                 docNumber = itemproformas.getDocNumber();
                                  effedate = itemproformas.getEffeDate();



                                Planograms planograms = itemproformas.getPlanograms();
                                if (planograms != null) {
                                    List<Itemplanogram> itemplanogramsList = planograms.getItemplanograms();

                                    for (Itemplanogram itemplanograms : itemplanogramsList) {

                                        //System.out.println("planogramId :" + itemplanograms.getPlanogramId());

                                    }

                                }


                            }
                        }
                        Planograms planograms = itemzshowMat.getPlanograms();

                        List<Itemplanogram> itemplanogramsList = planograms.getItemplanograms();

                        outputMap.rootmap(offerId,timestamp,itemplanogramsList,docNumber,effedate);



                    }
                }
            }

        }

    }
}
