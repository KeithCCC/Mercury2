package com.lazycats.mercuryOne;

import java.math.BigDecimal;

public class PrimaryNumber {
    public String displayNumStr = "";
    public double displayNumDouble = 0;
    public double primaryNumRegister = 0;
    public String calcOperator ="";
    public boolean numConcatState = true;
    public boolean isDecimal = false;

    public void conCatNum (PrimaryNumber priN, int inputNum) {

        //priN.calcOperator = "N";

        if (priN.numConcatState == false) {
            priN.displayNumStr = String.valueOf(inputNum);
            priN.displayNumDouble = (double) inputNum;
            priN.numConcatState = true;
        }
        // No string previously or 0 so simply replace with input.
        else if ((priN.displayNumStr.equals("")) || (priN.displayNumStr.equals("0"))){
            priN.displayNumStr =  String.valueOf(inputNum);
            priN.displayNumDouble = (double) inputNum;
            numConcatState = true;
        }
        // Concat number state
        else {
            BigDecimal bigDecimal;
            bigDecimal = new BigDecimal(String.valueOf(priN.displayNumStr));
            // If entry mode is in decimal mode.
//            if ( priN.isDecimal) {
//                priN.displayNumStr = priN.displayNumStr.concat(String.valueOf(inputNum));
//            }
//            // If this is INT, should not be any decimal
//            else {
//                priN.displayNumStr = priN.displayNumStr.concat(String.valueOf(inputNum));
//            }
            priN.displayNumStr = priN.displayNumStr.concat(String.valueOf(inputNum));
            priN.displayNumDouble = Double.valueOf(displayNumStr);
            //return(priN);
            numConcatState = true;
            priN.debugStatus(priN);
        }

    }

    public String debugStatus (PrimaryNumber pN) {

        return (
        "displayNumStr: " + pN.displayNumStr + "\n" +
                "displayNumDouble: " + pN.displayNumDouble + "\n" +
        "primaryNumRegister: " + pN.primaryNumRegister + "\n" +
        "calcOperator:" + pN.calcOperator + "\n" +
                "numConcatState: " + pN.numConcatState  + "\n" +
                "isDecimal:" + pN.isDecimal
        );


    }

}
