package com.achraf.sport.cote.ksoap;

/**
 * Created by Achraf on 10/07/2016.
 */
public class Match {
    public String DateBet;
    public String HeureDebut;
    public String NumeroBet;
    public int MinBets;
    public String HcpEq1;
    public String Equipe1;
    public String Equipe2;
    public String HcpEq2;
    public String Bet1;
    public String Betx;
    public String Bet2;
    public String DoubleChance1x;
    public String DoubleChance12;
    public String DoubleChancex2;
    public String Hcp1;
    public String Hcpx;
    public String Hcp2;
    public String Mitemps1;
    public String Mitempsx;
    public String Mitemps2;
    public String moins;
    public String plus;
    public String But01;
    public String But23;
    public String But4Plus;
    public String MitempsResultatFinal11;
    public String MitempsResultatFinalx1;
    public String MitempsResultatFinal21;
    public String MitempsResultatFinal1x;
    public String MitempsResultatFinalxx;
    public String MitempsResultatFinal2x;
    public String MitempsResultatFinal12;
    public String MitempsResultatFinalx2;
    public String MitempsResultatFinal22;

    public Match(String bet1, String bet2, String betx, String but01, String but23, String but4Plus, String dateBet, String doubleChance12, String doubleChance1x, String doubleChancex2, String equipe1, String equipe2, String hcp1, String hcp2, String hcpEq1, String hcpEq2, String hcpx, String heureDebut, int minBets, String mitemps1, String mitemps2, String mitempsResultatFinal11, String mitempsResultatFinal12, String mitempsResultatFinal1x, String mitempsResultatFinal21, String mitempsResultatFinal22, String mitempsResultatFinal2x, String mitempsResultatFinalx1, String mitempsResultatFinalx2, String mitempsResultatFinalxx, String mitempsx, String moins, String numeroBet, String plus) {
        Bet1 = bet1;
        Bet2 = bet2;
        Betx = betx;
        But01 = but01;
        But23 = but23;
        But4Plus = but4Plus;
        DateBet = dateBet;
        DoubleChance12 = doubleChance12;
        DoubleChance1x = doubleChance1x;
        DoubleChancex2 = doubleChancex2;
        Equipe1 = equipe1;
        Equipe2 = equipe2;
        Hcp1 = hcp1;
        Hcp2 = hcp2;
        HcpEq1 = hcpEq1;
        HcpEq2 = hcpEq2;
        Hcpx = hcpx;
        HeureDebut = heureDebut;
        MinBets = minBets;
        Mitemps1 = mitemps1;
        Mitemps2 = mitemps2;
        MitempsResultatFinal11 = mitempsResultatFinal11;
        MitempsResultatFinal12 = mitempsResultatFinal12;
        MitempsResultatFinal1x = mitempsResultatFinal1x;
        MitempsResultatFinal21 = mitempsResultatFinal21;
        MitempsResultatFinal22 = mitempsResultatFinal22;
        MitempsResultatFinal2x = mitempsResultatFinal2x;
        MitempsResultatFinalx1 = mitempsResultatFinalx1;
        MitempsResultatFinalx2 = mitempsResultatFinalx2;
        MitempsResultatFinalxx = mitempsResultatFinalxx;
        Mitempsx = mitempsx;
        this.moins = moins;
        NumeroBet = numeroBet;
        this.plus = plus;
    }

    public String getBet1() {

        return Bet1;
    }

    public void setBet1(String bet1) {
        Bet1 = bet1;
    }

    public String getBet2() {
        return Bet2;
    }

    public void setBet2(String bet2) {
        Bet2 = bet2;
    }

    public String getBetx() {
        return Betx;
    }

    public void setBetx(String betx) {
        Betx = betx;
    }

    public String getBut01() {
        return But01;
    }

    public void setBut01(String but01) {
        But01 = but01;
    }

    public String getBut23() {
        return But23;
    }

    public void setBut23(String but23) {
        But23 = but23;
    }

    public String getBut4Plus() {
        return But4Plus;
    }

    public void setBut4Plus(String but4Plus) {
        But4Plus = but4Plus;
    }

    public String getDateBet() {
        return DateBet;
    }

    public void setDateBet(String dateBet) {
        DateBet = dateBet;
    }

    public String getDoubleChance12() {
        return DoubleChance12;
    }

    public void setDoubleChance12(String doubleChance12) {
        DoubleChance12 = doubleChance12;
    }

    public String getDoubleChance1x() {
        return DoubleChance1x;
    }

    public void setDoubleChance1x(String doubleChance1x) {
        DoubleChance1x = doubleChance1x;
    }

    public String getDoubleChancex2() {
        return DoubleChancex2;
    }

    public void setDoubleChancex2(String doubleChancex2) {
        DoubleChancex2 = doubleChancex2;
    }

    public String getEquipe1() {
        return Equipe1;
    }

    public void setEquipe1(String equipe1) {
        Equipe1 = equipe1;
    }

    public String getEquipe2() {
        return Equipe2;
    }

    public void setEquipe2(String equipe2) {
        Equipe2 = equipe2;
    }

    public String getHcp1() {
        return Hcp1;
    }

    public void setHcp1(String hcp1) {
        Hcp1 = hcp1;
    }

    public String getHcp2() {
        return Hcp2;
    }

    public void setHcp2(String hcp2) {
        Hcp2 = hcp2;
    }

    public String getHcpEq1() {
        return HcpEq1;
    }

    public void setHcpEq1(String hcpEq1) {
        HcpEq1 = hcpEq1;
    }

    public String getHcpEq2() {
        return HcpEq2;
    }

    public void setHcpEq2(String hcpEq2) {
        HcpEq2 = hcpEq2;
    }

    public String getHcpx() {
        return Hcpx;
    }

    public void setHcpx(String hcpx) {
        Hcpx = hcpx;
    }

    public String getHeureDebut() {
        return HeureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        HeureDebut = heureDebut;
    }

    public int getMinBets() {
        return MinBets;
    }

    public void setMinBets(int minBets) {
        MinBets = minBets;
    }

    public String getMitemps1() {
        return Mitemps1;
    }

    public void setMitemps1(String mitemps1) {
        Mitemps1 = mitemps1;
    }

    public String getMitemps2() {
        return Mitemps2;
    }

    public void setMitemps2(String mitemps2) {
        Mitemps2 = mitemps2;
    }

    public String getMitempsResultatFinal11() {
        return MitempsResultatFinal11;
    }

    public void setMitempsResultatFinal11(String mitempsResultatFinal11) {
        MitempsResultatFinal11 = mitempsResultatFinal11;
    }

    public String getMitempsResultatFinal12() {
        return MitempsResultatFinal12;
    }

    public void setMitempsResultatFinal12(String mitempsResultatFinal12) {
        MitempsResultatFinal12 = mitempsResultatFinal12;
    }

    public String getMitempsResultatFinal1x() {
        return MitempsResultatFinal1x;
    }

    public void setMitempsResultatFinal1x(String mitempsResultatFinal1x) {
        MitempsResultatFinal1x = mitempsResultatFinal1x;
    }

    public String getMitempsResultatFinal21() {
        return MitempsResultatFinal21;
    }

    public void setMitempsResultatFinal21(String mitempsResultatFinal21) {
        MitempsResultatFinal21 = mitempsResultatFinal21;
    }

    public String getMitempsResultatFinal22() {
        return MitempsResultatFinal22;
    }

    public void setMitempsResultatFinal22(String mitempsResultatFinal22) {
        MitempsResultatFinal22 = mitempsResultatFinal22;
    }

    public String getMitempsResultatFinal2x() {
        return MitempsResultatFinal2x;
    }

    public void setMitempsResultatFinal2x(String mitempsResultatFinal2x) {
        MitempsResultatFinal2x = mitempsResultatFinal2x;
    }

    public String getMitempsResultatFinalx1() {
        return MitempsResultatFinalx1;
    }

    public void setMitempsResultatFinalx1(String mitempsResultatFinalx1) {
        MitempsResultatFinalx1 = mitempsResultatFinalx1;
    }

    public String getMitempsResultatFinalx2() {
        return MitempsResultatFinalx2;
    }

    public void setMitempsResultatFinalx2(String mitempsResultatFinalx2) {
        MitempsResultatFinalx2 = mitempsResultatFinalx2;
    }

    public String getMitempsResultatFinalxx() {
        return MitempsResultatFinalxx;
    }

    public void setMitempsResultatFinalxx(String mitempsResultatFinalxx) {
        MitempsResultatFinalxx = mitempsResultatFinalxx;
    }

    public String getMitempsx() {
        return Mitempsx;
    }

    public void setMitempsx(String mitempsx) {
        Mitempsx = mitempsx;
    }

    public String getMoins() {
        return moins;
    }

    public void setMoins(String moins) {
        this.moins = moins;
    }

    public String getNumeroBet() {
        return NumeroBet;
    }

    public void setNumeroBet(String numeroBet) {
        NumeroBet = numeroBet;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }
}
