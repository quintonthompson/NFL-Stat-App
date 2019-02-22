package nflapp.common;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;

public class Team {

    private SimpleStringProperty name;
    private SimpleStringProperty overAllRecord;
    private SimpleStringProperty conference;
    private SimpleStringProperty division;
    private SimpleStringProperty divisionRecord;
    private SimpleStringProperty conferenceRecord;
    private SimpleIntegerProperty byeWeek;
    private SimpleIntegerProperty id;
    private Image img;

public Team(){
    this.name = new SimpleStringProperty();
    this.overAllRecord = new SimpleStringProperty();
    this.conference = new SimpleStringProperty();
    this.division = new SimpleStringProperty();
    this.divisionRecord = new SimpleStringProperty();
    this.conferenceRecord = new SimpleStringProperty();
    this.byeWeek = new SimpleIntegerProperty();
    this.id = new SimpleIntegerProperty();

}

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getOverAllRecord() {
        return overAllRecord.get();
    }


    public void setOverAllRecord(String overAllRecord) {
        this.overAllRecord.set(overAllRecord);
    }

    public String getConference() {
        return conference.get();
    }

    public void setConference(String conference) {
        this.conference.set(conference);
    }

    public String getDivision() {
        return division.get();
    }


    public void setDivision(String division) {
        this.division.set(division);
    }

    public String getDivisionRecord() {
        return divisionRecord.get();
    }


    public void setDivisionRecord(String divisionRecord) {
        this.divisionRecord.set(divisionRecord);
    }

    public String getConferenceRecord() {
        return conferenceRecord.get();
    }

    public void setConferenceRecord(String conferenceRecord) {
        this.conferenceRecord.set(conferenceRecord);
    }

    public int getByeWeek() {
        return byeWeek.get();
    }


    public void setByeWeek(int byeWeek) {
        this.byeWeek.set(byeWeek);
    }
    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

}
