package views;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import main.MainApp;

public class ArmController extends MasterController {
	@FXML
	private AnchorPane ArmPane;
	@FXML
	private WebView webView;

	private WebEngine browser;

	public void back() {
		MainApp.app.slideOut(ArmPane);
		browser = webView.getEngine();
		browser.load(null);
	}

	public void a1() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1321354573/%EC%B2%9C%EA%B3%B5%EC%9D%98-%EC%8F%99%EB%8F%85%EC%83%88/");
	}

	public void a2() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2203146422/%EC%95%94%EC%82%B4%EC%9E%90%EC%9D%98-%EB%91%90%EA%B1%B4/");
	}

	public void a3() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2773056939/%EC%A4%91%EB%A0%A5%EC%9E%90-%EB%AA%B0%EC%88%98/");
	}

	public void a4() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2600992433/%EB%B2%8C%EB%A0%88%ED%97%88%EB%AC%BC-%EC%99%95%EA%B4%80/");
	}

	public void a5() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1667080809/%EC%A0%81-%EC%B6%94%EC%A0%81%EA%B8%B0/");
	}

	public void a6() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1321354572/%EB%B0%94%EB%B3%B4-%ED%83%90%EC%A7%80%EA%B8%B0/");
	}

	public void a7() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3942036043/%EC%98%81%EA%B2%81%EC%9D%98-%EC%86%8D%EB%A0%A5/");
	}

	public void a8() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2757274117/%EC%BC%80%ED%94%84%EB%A6%AC%EC%9D%98-%EC%B9%A8/");
	}

	public void a9() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4284305243/%EC%84%A4%EA%B3%84%EC%82%AC-%EA%B2%B8-%EC%A0%95%EB%B9%84%EC%82%AC%EC%9D%98-%EC%9A%94%EC%88%A0-%EC%86%8C%EB%A7%A4/");
	}

	public void a10() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3295711091/%EA%B1%B0%EC%A7%93%EB%A7%90%EC%9F%81%EC%9D%B4%EC%9D%98-%EC%95%85%EC%88%98/");
	}

	public void a11() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1098931324/%EB%A7%B9%EC%95%BD%EC%88%98%ED%98%B8%EC%9E%90/");
	}

	public void a12() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2166230715/%EB%B4%89%EC%9D%B8%EB%90%9C-%EC%95%84%ED%95%A8%EC%B9%B4%EB%9D%BC-%EC%86%90%EC%95%84%EA%B7%80/");
	}

	public void a13() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1098931325/%EA%B0%88%EB%9D%BC%EB%85%B8%EB%A5%B4%EC%9D%98-%EC%A1%B0%EA%B0%81/");
	}

	public void a14() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1786557270/%EC%8B%9C%EB%85%B8%EB%B6%80%EC%9D%98-%EB%A7%B9%EC%84%B8/");
	}

	public void a15() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4284305242/%EC%96%B4%EB%A6%B0-%EC%95%84%ED%95%A8%EC%B9%B4%EB%9D%BC%EC%9D%98-%EB%93%B1%EB%BC%88/");
	}

	public void a16() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4070560770/%EA%B7%80%EC%8B%A0-%EC%A1%B0%EB%81%BC/");
	}

	public void a17() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/419976111/%ED%96%89%EC%9A%B4%EC%9D%98-%EB%9D%BC%EC%A6%88%EB%B2%A0%EB%A6%AC/");
	}

	public void a18() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3392742912/%EB%B1%80-%EB%B6%88%EC%97%BC%ED%8F%AC/");
	}

	public void a19() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/419976110/%EB%A0%88%EC%9D%B4%EB%93%A0-%ED%94%8C%EB%9F%AD%EC%8A%A4/");
	}

	public void a20() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/419976108/%EC%9A%A9%EC%9D%98-%EA%B7%B8%EB%A6%BC%EC%9E%90/");
	}

	public void a21() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4070560771/6%EB%B2%88%EC%A7%B8-%EC%BD%94%EC%9A%94%ED%85%8C/");
	}

	public void a22() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/574694189/fr0st-ee5/");
	}

	public void a23() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1488061763/%EC%8C%8D%EB%91%A5%EC%9D%B4-%EC%96%B4%EB%A6%BF%EA%B4%91%EB%8C%80/");
	}

	public void a24() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1245809812/%ED%96%89%EC%9A%B4%EC%9D%98-%EB%B0%94%EC%A7%80/");
	}

	public void a25() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1245809813/%EC%98%A4%EB%A5%B4%ED%8E%98%EC%9A%B0%EC%8A%A4-%EB%B3%B4%ED%98%B8-%EC%9E%A5%EA%B5%AC/");
	}

	public void a26() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/193869520/k0kir-ee5/");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

}
