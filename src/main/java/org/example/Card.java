package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Card implements Cloneable
{
    Logger l = Logger.getLogger("MY Logger");
    Scanner s = new Scanner(System.in);
    String hname = "NITHISH KUMAR M";
    String cno = "1234567890123456";
    String vto = "12/27";
    String holderName;
    String cardNo;
    String validTo;
    Card()
    {
        l.info("Enter the Holder name :");
        holderName = s.nextLine();

        l.info("Enter the Card No :");
        cardNo = s.nextLine();

        l.info("Enter the Expired Date");
        validTo = s.nextLine();
    }

    Card cloneCard(){
        try{
            //call clone in object.
            return (Card) super.clone();
        }catch (CloneNotSupportedException e){
            l.info("Cloning not allowed");
            return this;
        }
    }
}
