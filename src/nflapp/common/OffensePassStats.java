package nflapp.common;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class OffensePassStats {
    private SimpleDoubleProperty passAttGame;
    private SimpleDoubleProperty passCompGame;
    private SimpleDoubleProperty yardsPerPassAtt;
    private SimpleDoubleProperty yardsPerPassComp;
    private SimpleDoubleProperty passCompPerc;
    private SimpleIntegerProperty passTd;
    private SimpleIntegerProperty interception;
    private SimpleIntegerProperty id;


    public OffensePassStats(){
        this.passAttGame = new SimpleDoubleProperty();
        this.passCompGame = new SimpleDoubleProperty();
        this.yardsPerPassAtt = new SimpleDoubleProperty();
        this.yardsPerPassComp = new SimpleDoubleProperty();
        this.passCompPerc = new SimpleDoubleProperty();
        this.passTd = new SimpleIntegerProperty();
        this.interception = new SimpleIntegerProperty();
        this.id = new SimpleIntegerProperty();
    }

    public double getPassAttGame() {
        return passAttGame.get();
    }


    public void setPassAttGame(double passAttGame) {
        this.passAttGame.set(passAttGame);
    }

    public double getPassCompGame() {
        return passCompGame.get();
    }


    public void setPassCompGame(double passCompGame) {
        this.passCompGame.set(passCompGame);
    }

    public double getYardsPerPassAtt() {
        return yardsPerPassAtt.get();
    }


    public void setYardsPerPassAtt(double yardsPerPassAtt) {
        this.yardsPerPassAtt.set(yardsPerPassAtt);
    }

    public double getYardsPerPassComp() {
        return yardsPerPassComp.get();
    }



    public void setYardsPerPassComp(double yardsPerPassComp) {
        this.yardsPerPassComp.set(yardsPerPassComp);
    }

    public double getPassCompPerc() {
        return passCompPerc.get();
    }



    public void setPassCompPerc(double passCompPerc) {
        this.passCompPerc.set(passCompPerc);
    }

    public int getPassTd() {
        return passTd.get();
    }


    public void setPassTd(int passTd) {
        this.passTd.set(passTd);
    }

    public int getInterception() {
        return interception.get();
    }


    public void setInterception(int interception) {
        this.interception.set(interception);
    }

    public int getId() {
        return id.get();
    }


    public void setId(int id) {
        this.id.set(id);
    }
}
