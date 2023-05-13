package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController  implements Initializable{
	
	private Department entity;
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
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
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
	public void updateFormData() {
		if(entity == null) {
			throw new  IllegalStateException("Entity was null");
		}
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(entity.getName());
	}

}
