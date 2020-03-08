package com.lazycats.mercuryOne;

public class PrimaryNumber {
    public String primaryNumStr = "";
    public double primaryNumDouble = 0;

    public void conCatNum (PrimaryNumber priN, int inputNum) {
        if (priN.primaryNumStr != "0")
            priN.primaryNumStr = priN.primaryNumStr.concat(String.valueOf(inputNum));
        else
            priN.primaryNumStr = String.valueOf(inputNum);
        priN.primaryNumDouble = Double.valueOf(primaryNumStr);
        //return(priN);
    }

}
