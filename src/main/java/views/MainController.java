package views;

import domain.UserVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import main.MainApp;

public class MainController extends MasterController{
	@FXML
	private Button Abtn;
	@FXML
	private Button Wbtn;
	@FXML
	private Label loginInfo;
	
	private UserVO user;
	
	public void setLoginInfo(UserVO vo) {
		this.user = vo;
		loginInfo.setText(vo.getName() + "[" + vo.getId() + "]");
	}
	
	public void logout() {
		user = null;
		MainApp.app.loadPage("login");
	}
	
	public void AbtnPres() {
		MainApp.app.loadPage("Arm");
	}
	
	public void WbtnPres() {
		MainApp.app.loadPage("Middle");
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
}
