package com.example.mercury1;

public class Convert {

    public static String Jn2E(String inputNum) {
        String tempStr, answerText = "";
        tempStr = inputNum;
        Boolean goExit = false;
        int strLeng;
        NumGroup nGrp = new NumGroup();
        nGrp.allnumber = Double.parseDouble(inputNum);

        do {

            strLeng = tempStr.length();
            if ((strLeng-3)>= 0) {
                nGrp.ones = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) {
                    nGrp.ones = tempStr;
                }
                break;
            }

            strLeng = tempStr.length();
            if (strLeng-3 >= 0) {
                nGrp.thousands = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) {
                    nGrp.thousands = tempStr;
                }
                break;
            }

            strLeng = tempStr.length();
            if (strLeng-3 >= 0) {
                nGrp.millions = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) {
                    nGrp.millions = tempStr;
                }
                break;
            }

            strLeng = tempStr.length();
            if (strLeng-3 >= 0) {
                nGrp.billions = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) {
                    nGrp.billions = tempStr;
                }
                break;
            }

        } while (goExit);

        if ((nGrp.billions != "0") && (nGrp.billions != "")  ) {
            answerText = nGrp.billions + " billons \n";
        }
        if ((nGrp.millions != "0" ) && (nGrp.millions != "" )) {
            answerText = answerText + nGrp.millions + " millions \n";
        }
        if ((nGrp.thousands != "0" ) && (nGrp.thousands != "" )) {
            answerText = answerText + nGrp.thousands + " thousands \n";
        }
        answerText = answerText + nGrp.ones;


        return answerText;
    }

    public static String Jn2J(String inputNum) {
        String tempStr, answerText = "";
        tempStr = inputNum;
        Boolean goExit = false;
        int strLeng;
        NumGroup nGrp = new NumGroup();
        nGrp.allnumber = Double.parseDouble(inputNum);

        do {
            strLeng = tempStr.length();
            if ((strLeng-3)>= 0) {
                nGrp.ones = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) {
                    nGrp.ones = tempStr;
                }
                break;
            }

            strLeng = tempStr.length();
            if (strLeng-3 >= 0) {
                nGrp.thousands = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) {
                    nGrp.thousands = tempStr;
                }
                break;
            }

            strLeng = tempStr.length();
            if (strLeng-3 >= 0) {
                nGrp.millions = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) {
                    nGrp.millions = tempStr;
                }
                break;
            }

            strLeng = tempStr.length();
            if (strLeng-3 >= 0) {
                nGrp.billions = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) {
                    nGrp.billions = tempStr;
                }
                break;
            }

        } while (goExit);

        if ((nGrp.billions != "0") && (nGrp.billions != "")  ) {
            answerText = nGrp.billions + " billons \n";
        }
        if ((nGrp.millions != "0" ) && (nGrp.millions != "" )) {
            answerText = answerText + nGrp.millions + " millions \n";
        }
        if ((nGrp.thousands != "0" ) && (nGrp.thousands != "" )) {
            answerText = answerText + nGrp.thousands + " thousands \n";
        }
        answerText = answerText + nGrp.ones;


        return answerText;
    }

}
