package views;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import main.MainApp;

public class PwrWeaponController extends MasterController{
	@FXML
	private WebView webView;
	
	private WebEngine browser;
	@FXML
	private AnchorPane pwrweaponPane;
	
	public void pwr1() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2069224589/%EC%B2%9C%EC%9D%98-%EB%AA%A9%EC%86%8C%EB%A6%AC/");
	}
	public void pwr2() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1395261499/%EC%A0%9C%EB%85%B8%ED%8C%8C%EC%A7%80/");
	}
	public void pwr3() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2376481550/%EB%AC%B4%EC%A0%95%EB%B6%80/");
	}
	public void pwr4() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3141979346/darci/");
	}
	public void pwr5() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2591746970/%EB%A6%AC%EB%B0%94%EC%9D%B4%EC%96%B4%EB%8D%98%EC%9D%98-%EC%88%A8%EA%B2%B0/");
	}
	public void pwr6() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1508896098/%EC%9B%8C%EB%93%9C%ED%81%B4%EB%A6%AC%ED%94%84-%EC%BD%94%EC%9D%BC/");
	}
	public void pwr7() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3549153979/%ED%83%90%EC%82%AC%EC%9E%90/");
	}
	public void pwr8() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2694576561/%EC%9D%B4%EC%A4%91-%EA%BC%AC%EB%A6%AC-%EC%97%AC%EC%9A%B0/");
	}
	public void pwr9() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1744115122/%EC%95%84%ED%81%AC%EB%A6%AC%EC%9A%B0%EC%8A%A4%EC%9D%98-%EC%A0%84%EC%84%A4/");
	}
	public void pwr10() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3325463374/%EC%B2%9C%EB%91%A5%EC%9D%98-%EC%99%95/");
	}
	public void pwr11() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1891561814/%EB%B2%8C%EB%A0%88%EC%9D%98-%EC%86%8D%EC%82%AD%EC%9E%84/");
	}
	public void pwr12() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2232171099/%EC%A3%BD%EC%9D%8C%EC%A0%84%EB%8B%AC%EC%9E%90/");
	}
	public void pwr13() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3580904581/%ED%8A%B8%EB%9E%99%ED%84%B0-%EB%8C%80%ED%8F%AC/");
	}
	public void pwr14() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1864563948/%EC%84%B8%EA%B3%84%EC%84%A0-%EC%A0%9C%EB%A1%9C/");
	}
	public void pwr15() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1201830623/%EC%A7%84%EC%8B%A4/");
	}
	public void pwr16() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3899270607/%EC%BD%9C%EB%A1%9C%EB%8B%88/");
	}
	public void pwr17() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2044500762/%EC%97%AC%EC%99%95%EC%9D%98-%EB%B0%B0%EB%B0%98%EC%9E%90/");
	}
	public void pwr18() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3766045777/%EA%B2%80%EC%9D%80-%EB%B0%9C%ED%86%B1/");
	}
	public void pwr19() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4036115577/%EC%8A%AC%EB%A6%AC%ED%8D%BC-%EC%8B%9C%EB%AE%AC%EB%9F%B0%ED%8A%B8/");
	}
	public void EweaponGO() {
		MainApp.app.slideOut(pwrweaponPane);
	}
	public void PweaponGO() {
		MainApp.app.loadPage("weapon");
	}
	public void Back() {
		MainApp.app.slideOut(pwrweaponPane);
		browser = webView.getEngine();
		browser.load(null);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
}
