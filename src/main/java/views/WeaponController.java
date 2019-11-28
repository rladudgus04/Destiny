package views;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import main.MainApp;

public class WeaponController extends MasterController {

	@FXML
	private Button NextPagebtn;

	@FXML
	private GridPane wGrid;

	@FXML
	private WebView webView;

	private WebEngine browser;

	@FXML
	private AnchorPane weaponPage;

	private List<ItemController> icList = new ArrayList<ItemController>();

//	@FXML
//	private void initialize() {
//		
//		//물리무기 이미지 로드
//		for(int i = 1; i <= 22; i++) {
//			Image img = new Image(getClass().getResource("/Pimage/p" + i + ".jpg").toString());
//			String name = "p" + i + ".jpg";
//			
//			try {
//				FXMLLoader loader = new FXMLLoader();
//				loader.setLocation(getClass().getResource("/views/ItemLayout.fxml"));
//				AnchorPane root = loader.load();
//				ItemController ic = loader.getController();
//				ic.set(img, name);
//				icList.add(ic);
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println(i + "번째 이미지 로드중 오류 발생");
//			}
//			
//		}
//		//에너지무기
//		
//		//파워무기
//		
//		loadPWeapon();
//	}

//	public void loadPWeapon() {
//		clearGrid();
//		for(int i = 0; i < icList.size(); i++) {
//			ItemController item = icList.get(i);
//			int y = i / 6;
//			int x = i % 6;
//			wGrid.add(item.getRoot(), x, y);
//		}
//	}
	public void click() {
		browser = webView.getEngine();
		browser.load("http://google.com");

	}

	public void W1() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2816212794/%EB%B6%88%EC%BE%8C%ED%95%9C-%EC%A3%BC%EC%88%A0/");
	}

	public void W2() {
		browser = webView.getEngine();
		browser.load(
				"https://www.light.gg/db/ko/items/1331482397/mida-%EB%8B%A4%EB%AA%A9%EC%A0%81-%EB%8F%84%EA%B5%AC/");
	}

	public void W3() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/204878059/%EB%B6%88%EB%B2%95-%EB%AC%B4%EA%B8%B0/");
	}

	public void W4() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3973202132/%EA%B0%80%EC%8B%9C/");
	}

	public void W5() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3628991659/%EA%B0%90%EC%8B%9C%EC%9D%98-%EB%82%A0%EA%B0%9C/");
	}

	public void W6() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2362471601/%EC%A5%90%EC%9D%98-%EC%99%95/");
	}

	public void W7() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2286143274/%ED%97%88%ED%81%B4%EB%B2%A0%EB%A6%AC/");
	}

	public void W8() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1541131350/%EC%BC%80%EB%A5%B4%EB%B2%A0%EB%A1%9C%EC%8A%A41/");
	}

	public void W9() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1364093401/%EC%9C%A0%EC%96%B8/");
	}

	public void W10() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/4068264807/%EB%AA%AC%ED%85%8C%EC%B9%B4%EB%A5%BC%EB%A1%9C/");
	}

	public void W11() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/1345867570/%EB%A9%8B%EC%A7%84-%EB%AA%A8%EC%8A%B5/");
	}

	public void W12() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3844694310/%EC%98%A5%ED%86%A0%EB%81%BC/");
	}

	public void W13() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3512014804/%EB%A3%A8%EB%AF%B8%EB%82%98/");
	}

	public void W14() {
		browser = webView.getEngine();
		browser.load(
				"https://www.light.gg/db/ko/items/347366834/%EC%8A%A4%ED%8E%98%EC%9D%B4%EB%93%9C-%EC%97%90%EC%9D%B4%EC%8A%A4/");
	}

	public void W15() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3413860062/%EC%83%A4%ED%8E%98%EB%A1%A0/");
	}

	public void W16() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2856683562/%EC%84%9C%EB%A1%9C%EC%8A%A4-%EC%B2%B4%EC%A0%9C/");
	}

	public void W17() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/814876684/%EC%86%8C%EC%9B%90-%EC%A2%85%EA%B2%B0%EC%9E%90/");
	}

	public void W18() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/400096939/%EC%99%84%EB%B2%BD%ED%95%9C-%ED%8F%AD%EB%8F%99/");
	}

	public void W19() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2907129556/%EC%A7%88%ED%92%8D/");
	}

	public void W20() {
		browser = webView.getEngine();
		browser.load(
				"https://www.light.gg/db/ko/items/3211806999/%EC%9D%B4%EC%9E%90%EB%82%98%EA%B8%B0%EC%9D%98-%EC%A7%90/");
	}

	public void W21() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/2130065553/%EC%84%9D%EA%B6%81/");
	}

	public void W22() {
		browser = webView.getEngine();
		browser.load("https://www.light.gg/db/ko/items/3437746471/%EC%A7%84%ED%99%8D-%ED%95%8F%EC%9E%90%EA%B5%AD/");
	}

	private void clearGrid() {
		wGrid.getChildren().clear();
	}
	public void logout() {
		MainApp.app.slideOut(weaponPage);
		browser = webView.getEngine();
		browser.load(null);
	}
	public void EweaponGo() {
		MainApp.app.loadPage("Eweapon");
	}
	public void PwrweaponGO() {
		MainApp.app.loadPage("Pwrweapon");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

}
