package views;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import main.MainApp;

public class MiddleController extends MasterController{
	@FXML
	private AnchorPane MiddlePane;
	
	public void PweaponGo() {
		MainApp.app.loadPage("weapon");
	}
	public void EweaponGo() {
		MainApp.app.loadPage("Eweapon");
	}
	public void PwrweaponGo() {
		MainApp.app.loadPage("Pwrweapon");
	}
	public void back() {
		MainApp.app.slideOut(MiddlePane);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
}
