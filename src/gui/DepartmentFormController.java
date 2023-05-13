package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController  implements Initializable{
	@FXML
	private TextField txtId;
	@FXML
	private TextField txtName;
	@FXML
	private Label labelErrorName;
	@FXML
	private Button btnSave;
	@FXML
	private Button btnCancel;
	
	@FXML
	public void onbtSaveAction() {
		System.out.println("Save");
		
	}
	@FXML
	public void onbtCancelAction() {
		System.out.println("Cancel");
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	initializacaoNodes();
		
	}
	private void initializacaoNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtId, 30);
	}

}
