package com.bhasker.dgstack.lamdaex;

public class RerveByLamda {

    public static void main(String args[]) {

        GenericFunctional<String>  rev = (str) -> {
            String revStr = "";
            for (int i = str.length()-1; i >= 0; i--) {
                revStr = revStr + str.charAt(i);
            }

            return revStr;
        };
    System.out.println(""+ rev.reserve("pankaj"));

      GenericFunctional<Integer> revNum = (num) -> {
        int tempNum =num;
        int digit =0;
        String oppStr ="";
          String actualStr = String.valueOf(tempNum);
          while ( tempNum != 0 ) {
              digit = tempNum % 10;
              oppStr = oppStr + digit;
              tempNum = tempNum / 10;

          }
          return Integer.parseInt(oppStr);
      };
        System.out.println(""+ revNum.reserve(62323));
    }



}
