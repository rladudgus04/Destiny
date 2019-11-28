package views;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import main.MainApp;

public class EweaponController extends MasterController{
	@FXML
	private WebView webView;
	
	private WebEngine browser;
	
	@FXML
	private AnchorPane Eweapon;
	
	public void EW1() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4190156464/%EB%AC%B4%EC%9E%90%EB%B9%84/");
	}

	public void EW2() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3141979347/%EB%B3%B4%EB%A0%88%EC%95%8C%EB%A6%AC%EC%8A%A4/");
	}

	public void EW3() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3549153978/%ED%98%B8%EC%A0%84%EC%A0%81%EC%9D%B8-%EC%82%AC%EC%9E%90/");
	}

	public void EW4() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3628991658/%EC%A4%91%EB%A0%A5%EC%9E%90%EC%9D%98-%EC%B0%BD/");
	}

	public void EW5() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4255268456/%ED%95%98%EB%8A%98%EB%B0%A9%ED%99%94%EC%9E%90%EC%9D%98-%EB%A7%B9%EC%84%B8/");	
	}

	public void EW6() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2907129557/%ED%83%9C%EC%96%91%ED%83%84/");
	}

	public void EW7() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4124984448/%EA%B5%B3%EC%84%BC-%EB%B9%9B/");
	}

	public void EW8() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/814876685/%EC%82%BC%EC%9C%84%EC%9D%BC%EC%B2%B4-%EC%95%85%EA%B7%80/");
	}

	public void EW9() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2208405142/%ED%85%94%EB%A0%88%EC%8A%A4%ED%86%A0/");
	}

	public void EW10() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4103414242/%EC%8B%A0%EC%84%B1/");
	}

	public void EW11() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3588934839/%EB%A5%B4-%EB%AA%A8%EB%82%98%EB%A5%B4%ED%81%AC/");
	}

//	public void EW12() {
//		browser = webView.getEngine();
//		browser.load("https://www.light.gg/db/ko/items/3844694310/%EC%98%A5%ED%86%A0%EB%81%BC/");
//	}

	public void EW13() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1345867571/%EC%B0%A8%EA%B0%80%EC%9A%B4-%EC%8B%AC%EC%9E%A5/");
	}

	public void EW14() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3524313097/%EC%97%90%EB%A6%AC%EC%95%84%EB%82%98%EC%9D%98-%EB%A7%B9%EC%84%B8/");
	}

	public void EW15() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1852863732/%ED%8C%8C%EC%9E%A5-%EB%B6%84%ED%95%A0%EA%B8%B0/");
	}

	public void EW16() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3413074534/%EB%B6%81%EA%B7%B9%EC%84%B1-%EC%B0%BD/");
	}

	public void EW17() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3413860063/%EB%8A%91%EB%8C%80-%EA%B5%B0%EC%A3%BC/");
	}

	public void EW18() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/400096939/%EC%99%84%EB%B2%BD%ED%95%9C-%ED%8F%AD%EB%8F%99/");
	}

//	public void EW19() {
//		browser = webView.getEngine();
//		browser.load("https://www.light.gg/db/ko/items/2907129556/%EC%A7%88%ED%92%8D/");
//	}

	public void EW20() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3110698812/%ED%83%80%EB%9D%BC%EB%B0%94/");
	}

	public void EW21() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/417164956/%EC%9A%94%ED%88%B0/");
	}

	public void EW22() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3089417789/%EC%A4%84%ED%83%80%EA%B8%B0-%EA%B3%A1%EC%98%88%EC%82%AC/");
	}
	public void Weapon() {
		
	}
	public void Pweapon() {
		
	}
	public void back() {
		MainApp.app.slideOut(Eweapon);
		browser = webView.getEngine();
		browser.load(null);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
}
