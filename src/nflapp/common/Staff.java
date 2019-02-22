package nflapp.common;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Staff {
    private SimpleStringProperty name;
    private SimpleStringProperty position;
    private SimpleIntegerProperty teamId;

    public Staff(){
        this.name = new SimpleStringProperty();
        this.position = new SimpleStringProperty();
        this.teamId = new SimpleIntegerProperty();
    }

    public String getName() {
        return name.get();
    }


    public void setName(String name) {
        this.name.set(name);
    }

    public String getPosition() {
        return position.get();
    }


    public void setPosition(String position) {
        this.position.set(position);
    }

    public int getId() {
        return teamId.get();
    }

    public void setId(int id) {
        this.teamId.set(id);
    }
}
