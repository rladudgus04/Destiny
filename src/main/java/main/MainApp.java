package main;

import java.util.HashMap;
import java.util.Map;

import domain.UserVO;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import views.ArmController;
import views.EweaponController;
import views.LoginController;
import views.MainController;
import views.MasterController;
import views.MiddleController;
import views.PwrWeaponController;
import views.RegisterController;
import views.WeaponController;

public class MainApp extends Application{
	public static MainApp app;
	
	private AnchorPane mainPage = null;
	
	private Map<String, MasterController> controllerMap = new HashMap<>();

	@Override
	
	public void start(Stage primaryStage) {
		app = this; //싱글톤으로 만들어준다.
		try {
			FXMLLoader ArmLoader = new FXMLLoader();
			ArmLoader.setLocation(getClass().getResource("/views/ArmLayout.fxml"));
			AnchorPane ArmPage = ArmLoader.load();
			
			ArmController ac = ArmLoader.getController();
			ac.setRoot(ArmPage);
			controllerMap.put("Arm", ac);
			
			
			FXMLLoader PwrweaponLoader = new FXMLLoader();
			PwrweaponLoader.setLocation(getClass().getResource("/views/PwrWeaponLayout.fxml"));
			AnchorPane PwrweaponPage = PwrweaponLoader.load();
			
			PwrWeaponController pwrc = PwrweaponLoader.getController();
			pwrc.setRoot(PwrweaponPage);
			controllerMap.put("Pwrweapon", pwrc);
			
			
			
			FXMLLoader MiddleLoader = new FXMLLoader();
			MiddleLoader.setLocation(getClass().getResource("/views/MiddleLayout.fxml"));
			AnchorPane MiddlePage = MiddleLoader.load();
			
			MiddleController mic = MiddleLoader.getController();
			mic.setRoot(MiddlePage);
			controllerMap.put("Middle", mic);
			
			
			FXMLLoader EweaponLoader = new FXMLLoader();
			EweaponLoader.setLocation(getClass().getResource("/views/EweaponLayout.fxml"));
			AnchorPane EweaponPage = EweaponLoader.load();
			
			EweaponController ec = EweaponLoader.getController();
			ec.setRoot(EweaponPage);
			controllerMap.put("Eweapon", ec);
			
			
			FXMLLoader WeaponLoader = new FXMLLoader();
			WeaponLoader.setLocation(getClass().getResource("/views/WeaponLayout.fxml"));
			AnchorPane WeaponPage = WeaponLoader.load();
			
			WeaponController we = WeaponLoader.getController();
			System.out.println(we);
			we.setRoot(WeaponPage);
			controllerMap.put("weapon", we);
			
			FXMLLoader mainLoader = new FXMLLoader();
			mainLoader.setLocation(getClass().getResource("/views/MainLayout.fxml"));
			mainPage = mainLoader.load();
			
			MainController mc = mainLoader.getController();
			mc.setRoot(mainPage);
			controllerMap.put("main", mc);
			
			FXMLLoader loginLoader = new FXMLLoader();
			loginLoader.setLocation(getClass().getResource("/views/LoginLayout.fxml"));
			AnchorPane loginPage = loginLoader.load();
			
			LoginController lc = loginLoader.getController();
			lc.setRoot(loginPage);
			controllerMap.put("login", lc);
			
			//회원가입 페이지 로드
			FXMLLoader registerLoader = new FXMLLoader();
			registerLoader.setLocation(getClass().getResource("/views/RegisterLayout.fxml"));
			AnchorPane registerPage = registerLoader.load();
			
			RegisterController rc = registerLoader.getController();
			rc.setRoot(registerPage);
			controllerMap.put("register", rc);
			
			Scene scene = new Scene(mainPage);
			mainPage.getChildren().add(loginPage);
			
			scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("DESTINY 도감");
			primaryStage.getIcons().add(new Image("/images/icon.jpg"));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("앱 로딩중 오류 발생");
		}

	}
	
	public void setLoginInfo(UserVO vo) {
		MainController mc = (MainController) controllerMap.get("main");
		mc.setLoginInfo(vo);
	}
	
	public void loadPage(String name) {
		MasterController c = controllerMap.get(name);
		c.init();
		Pane pane = c.getRoot();
		System.out.println(name);
		System.out.println(pane);
		System.out.println(c);
		mainPage.getChildren().add(pane);
		
		pane.setTranslateX(-800);
		pane.setOpacity(0);
		
		Timeline timeline = new Timeline();
		KeyValue toRight = new KeyValue(pane.translateXProperty(), 0);
		KeyValue fadeIn = new KeyValue(pane.opacityProperty(), 1);
		
		KeyFrame frame = new KeyFrame(Duration.millis(500), toRight, fadeIn);
		
		timeline.getKeyFrames().add(frame);
		timeline.play();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void slideOut(Pane pane) {
		Timeline timeline = new Timeline();
		KeyValue toRight = new KeyValue(pane.translateXProperty(), 800);
		KeyValue fadeOut = new KeyValue(pane.opacityProperty(), 0);
		
		KeyFrame frame = new KeyFrame(Duration.millis(500), (e) -> {
			mainPage.getChildren().remove(pane);
		}, toRight, fadeOut);
		
		timeline.getKeyFrames().add(frame);
		timeline.play();
	}
	
}






