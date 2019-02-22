package nflapp.common;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class OffenseRushStats {
    private SimpleDoubleProperty rushAttGame;
    private SimpleDoubleProperty rushYardGame;
    private SimpleDoubleProperty rushYardAtt;
    private SimpleIntegerProperty rushTd;
    private SimpleIntegerProperty id;


   public OffenseRushStats(){
       this.rushAttGame = new SimpleDoubleProperty();
       this.rushYardGame = new SimpleDoubleProperty();
       this.rushYardAtt = new SimpleDoubleProperty();
       this.rushTd = new SimpleIntegerProperty();
       this.id = new SimpleIntegerProperty();
   }

    public double getRushAttGame() {
        return rushAttGame.get();
    }


    public void setRushAttGame(double rushAttGame) {
        this.rushAttGame.set(rushAttGame);
    }

    public double getRushYardGame() {
        return rushYardGame.get();
    }


    public void setRushYardGame(double rushYardGame) {
        this.rushYardGame.set(rushYardGame);
    }

    public double getRushYardAtt() {
        return rushYardAtt.get();
    }


    public void setRushYardAtt(double rushYardAtt) {
        this.rushYardAtt.set(rushYardAtt);
    }

    public int getRushTd() {
        return rushTd.get();
    }


    public void setRushTd(int rushTd) {
        this.rushTd.set(rushTd);
    }

    public int getId() {
        return id.get();
    }


    public void setId(int id) {
        this.id.set(id);
    }
}
