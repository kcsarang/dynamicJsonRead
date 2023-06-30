package com.example.dynamicJsonRead.dynamicJsonRead.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Root{
    public String importParameterTimestamp;
    public ItOffer itOffer;
    public String offerId;
    public String id;
    public int ttl;
    public String _rid;
    public String _self;
    public String _etag;
    public String _attachments;
    public int _ts;
}
