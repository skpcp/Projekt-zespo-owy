package com.uwm.projektz.binary.ob;

import com.uwm.projektz.base.ob.BaseOB;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wojni on 11.03.2016.
 */
@Entity
@Table(name = "binaries")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_BINARY_ID")
public class BinaryOB extends BaseOB {
    @Lob
    @Column(name="CONTENT")
    private byte[] binary;

    public BinaryOB() {
    }

    public BinaryOB(byte[] binary) {
        this.binary = binary;
    }

    public byte[] getBinary() {
        return binary;
    }

    public void setBinary(byte[] binary) {
        this.binary = binary;
    }
}

