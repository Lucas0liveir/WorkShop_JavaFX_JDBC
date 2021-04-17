/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import application.Program;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

/**
 *
 * @author olive
 */
public class DepartmentListController implements Initializable {
    @FXML
    private TableView<Department> tableViewDepartment;
    @FXML
    private TableColumn<Department, Integer> tableColumnId;
    @FXML
    private TableColumn<Department, String> tableColumnName;
    @FXML
    private Button btNew;
    
    public void onBtNewAction(){
    System.out.println("Button action");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeNodes();
    }

    private void initializeNodes() {
         tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
         tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
         Stage stage =(Stage) Program.getMainScene().getWindow();
         tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
    }
    
}
