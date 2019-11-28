package views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ItemController{
	@FXML
	private Label lblName;
	@FXML
	private ImageView imgView;
	
	@FXML
	private AnchorPane root;
	
	@FXML
	private WebView Intro;
	
	private WebEngine browser;
	
	public void set(Image img, String name) {
		double w = this.imgView.getFitWidth();
		double h = this.imgView.getFitHeight();
		System.out.println(w + ", " + h);
		this.imgView.setImage(img);
		this.imgView.setFitWidth(w);
		this.imgView.setFitHeight(h);
		this.lblName.setText(name);
	}
	
	public AnchorPane getRoot() {
		return root;
	}

	public void click() {
		System.out.println( lblName.getText() + " 클릭");
		//정보를 띄워주는 짓을 해야해
		if(lblName.getText() == "p1.jpg") {
			browser = Intro.getEngine();
			browser.load("http://google.com");
		}
	}
}
