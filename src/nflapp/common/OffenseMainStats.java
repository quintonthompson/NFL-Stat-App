package nflapp.common;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class OffenseMainStats {
    private SimpleDoubleProperty avgScoreGame;
    private SimpleStringProperty avgTimeOfPos;
    private SimpleDoubleProperty offensePlaysGame;
    private SimpleDoubleProperty offenseYardsGame;
    private SimpleDoubleProperty offenseYardsPlay;
    private SimpleIntegerProperty redZoneAtt;
    private SimpleIntegerProperty redZoneConv;
    private SimpleIntegerProperty penalties;
    private SimpleIntegerProperty penaltyYards;
    private SimpleIntegerProperty id;

    public OffenseMainStats(){

        this.avgScoreGame = new SimpleDoubleProperty();
        this.avgTimeOfPos = new SimpleStringProperty();
        this.offensePlaysGame = new SimpleDoubleProperty();
        this.offenseYardsGame = new SimpleDoubleProperty();
        this.offenseYardsPlay = new SimpleDoubleProperty();
        this.redZoneAtt = new SimpleIntegerProperty();
        this.redZoneConv = new SimpleIntegerProperty();
        this.penalties = new SimpleIntegerProperty();
        this.penaltyYards = new SimpleIntegerProperty();
        this.id = new SimpleIntegerProperty();

    }

    public double getAvgScoreGame() {
        return avgScoreGame.get();
    }

    public void setAvgScoreGame(double avgScoreGame) {
        this.avgScoreGame.set(avgScoreGame);
    }

    public String getAvgTimeOfPos() {
        return avgTimeOfPos.get();
    }


    public void setAvgTimeOfPos(String avgTimeOfPos) {
        this.avgTimeOfPos.set(avgTimeOfPos);
    }

    public double getOffensePlaysGame() {
        return offensePlaysGame.get();
    }


    public void setOffensePlaysGame(double offensePlaysGame) {
        this.offensePlaysGame.set(offensePlaysGame);
    }

    public double getOffenseYardsGame() {
        return offenseYardsGame.get();
    }


    public void setOffenseYardsGame(double offenseYardsGame) {
        this.offenseYardsGame.set(offenseYardsGame);
    }

    public double getOffenseYardsPlay() {
        return offenseYardsPlay.get();
    }


    public void setOffenseYardsPlay(double offenseYardsPlay) {
        this.offenseYardsPlay.set(offenseYardsPlay);
    }

    public int getRedZoneAtt() {
        return redZoneAtt.get();
    }


    public void setRedZoneAtt(int redZoneAtt) {
        this.redZoneAtt.set(redZoneAtt);
    }

    public int getRedZoneConv() {
        return redZoneConv.get();
    }


    public void setRedZoneConv(int redZoneConv) {
        this.redZoneConv.set(redZoneConv);
    }

    public int getPenalties() {
        return penalties.get();
    }


    public void setPenalties(int penalties) {
        this.penalties.set(penalties);
    }

    public int getPenaltyYards() {
        return penaltyYards.get();
    }


    public void setPenaltyYards(int penaltyYards) {
        this.penaltyYards.set(penaltyYards);
    }

    public int getId() {
        return id.get();
    }


    public void setId(int id) {
        this.id.set(id);
    }
}
