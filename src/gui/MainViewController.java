/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author olive
 */
public class MainViewController implements Initializable {
    
    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;
    
    @FXML
    public void onMenuItemSeller(){
    System.out.println("Seller Action");
    }
    @FXML
    public void onMenuItemDepartment(){
    System.out.println("Department Action");
    }
    @FXML
    public void onMenuItemAbout(){
    System.out.println("About Action");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
