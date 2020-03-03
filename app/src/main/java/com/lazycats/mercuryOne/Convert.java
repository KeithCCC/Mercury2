package com.lazycats.mercuryOne;

class Convert {

    static String Jn2E(String inputNum) {
        String tempStr, answerText = "";
        tempStr = inputNum;
        Boolean goExit;
        goExit = false;
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

        if ((!nGrp.billions.equals("0")) && (nGrp.billions != "")  ) {
            answerText = nGrp.billions + " Billon \n";
        }
        if ((!nGrp.millions.equals("0")) && (nGrp.millions != "" )) {
            answerText = answerText + nGrp.millions + " Million \n";
        }
        if ((nGrp.thousands != "0" ) && (nGrp.thousands != "" )) {
            answerText = answerText + nGrp.thousands + " Thousand \n";
        }
        answerText = answerText + nGrp.ones;


        return answerText;
    }

    static String Jn2J(String inputNum) {
        String tempStr, answerText = "";
        tempStr = inputNum;
        Boolean goExit = false;
        int strLeng;
        NumGroupJ nGrp = new NumGroupJ();
        nGrp.allnumber = Double.parseDouble(inputNum);

        do {

            //1. 10, 100 の位
            strLeng = tempStr.length();
            if ((strLeng-3)>= 0) {
                nGrp.ones = tempStr.substring(strLeng-3, strLeng);
                tempStr = tempStr.substring(0,strLeng - 3);
            } else {
                if (strLeng != 0) { nGrp.ones = tempStr;  }
                break;
            }

             //千の位
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.thousands = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.thousands = tempStr;
                }
                break;
            }
            //万の位
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.one_m = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.one_m = tempStr;
                }
                break;
            }
            //１０万
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.ten_m = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.ten_m = tempStr;
                }
                break;
            }
            //１００万
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.handreds_m = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.handreds_m = tempStr;
                }
                break;
            }
            //１千万
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.thousands_m = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.thousands_m = tempStr;
                }
                break;
            }
            //１億
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.one_o = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.one_o = tempStr;
                }
                break;
            }
            //１０億
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.ten_o = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.ten_o = tempStr;
                }
                break;
            }
            //１００億
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.handred_o = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.handred_o = tempStr;
                }
                break;
            }
            //１０００億
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.thousands_o = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.thousands_o = tempStr;
                }
                break;
            }
            //１兆
            strLeng = tempStr.length();
            if (strLeng-1 >= 0) {
                nGrp.one_ch = tempStr.substring(strLeng-1, strLeng);
                tempStr = tempStr.substring(0,strLeng - 1);
            } else {
                if (strLeng != 0) {
                    nGrp.one_ch = tempStr;
                }
                break;
            }

        } while (goExit);

        if ((!nGrp.one_ch.equals("0")) && (!nGrp.one_ch.equals(""))  ) {
            answerText = nGrp.one_ch + "兆";
        }
        if ((!nGrp.thousands_o.equals("0")) && (!nGrp.thousands_o.equals(""))) {
            answerText = answerText + nGrp.thousands_o;
        }
        if ((!nGrp.handred_o.equals("0")) && (!nGrp.handred_o.equals(""))) {
            answerText = answerText + nGrp.handred_o;
        }
        if ((!nGrp.ten_o.equals("0")) && (!nGrp.ten_o.equals(""))) {
            answerText = answerText + nGrp.ten_o;
        }
        if ((!nGrp.one_o.equals("0")) && (!nGrp.one_o.equals(""))) {
            answerText = answerText + nGrp.one_o + "億";
        }
        if ((!nGrp.thousands_m.equals("0")) && (!nGrp.thousands_m.equals(""))) {
            answerText = answerText + nGrp.thousands_m;
        }
        if ((!nGrp.handreds_m.equals("0")) && (!nGrp.handreds_m.equals(""))) {
            answerText = answerText + nGrp.handreds_m;
        }
        if ((!nGrp.ten_m.equals("0")) && (!nGrp.ten_m.equals(""))) {
            answerText = answerText + nGrp.ten_m;
        }
        if ((!nGrp.one_m.equals("0")) && (!nGrp.one_m.equals(""))) {
            answerText = answerText + nGrp.one_m + "万";
        }
        if ((!nGrp.thousands.equals("0")) && (!nGrp.thousands.equals(""))) {
            answerText = answerText + nGrp.thousands + "千";
        }
        answerText = answerText + nGrp.ones;


        return answerText;
    }

}
