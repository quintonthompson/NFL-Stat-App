package nflapp.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import nflapp.common.Team;
import nflapp.db.DataSource;

import java.io.IOException;


public class Controller {


    @FXML
    private TableView mainTableView;
    @FXML
    private Button closeButton;
    @FXML
    private BorderPane rootPane;


    public void onSelected(){
        mainTableView.setOnMouseClicked(e -> {
            if(e.getClickCount() == 2){
                try {
                    loadTeamDetailFXML();
                }catch (IOException ex){
                    System.out.println("IOException: " + ex.getMessage());
                }
            }
        });
    }

    public void listAllTeams() {
        //binding the teams from the database to the item property of the UI teamInfoListView
        Task <ObservableList<Team>> task = new GetAllNflTeamsTask();
        mainTableView.itemsProperty().bind(task.valueProperty());
        new Thread(task).start();


    }

    @FXML
    private void closeProgram(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void loadTeamDetailFXML() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("teamDetail.fxml"));
        TeamDetailController teamDetailController = new TeamDetailController();
        teamDetailController.setTeam((Team)mainTableView.getSelectionModel().getSelectedItem());
        rootPane.setCenter(root);

    }


}

class GetAllNflTeamsTask extends Task {
    @Override
    protected ObservableList<Team> call() throws Exception {
        //create observable list with all teams
        return FXCollections.observableArrayList(DataSource.getInstance().queryTeamInfoMainMenu());
    }
}