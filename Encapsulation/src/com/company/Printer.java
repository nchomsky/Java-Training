package com.company;

public class Printer {
    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
        this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if((tonerAmount + this.tonerLevel) > 100){
                return -1;
            } else {
                return this.tonerLevel += tonerAmount;
            }
        }
        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex == true){
            if(pagesToPrint % 2 != 0){
                int leftoverPages = pagesToPrint % 2;
                return (pagesToPrint / 2) + leftoverPages;
            }
            return pagesToPrint / 2;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
