package Main;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main extends Application {

    private ConfigurableApplicationContext springContext;
    private Parent root;

    public static void main(String[] args){
        launch(args);
    }
//    @Override
//    public void run(String... args) throws Exception {
//
//    }
    @Override
    public void init() throws Exception
    {
        springContext = SpringApplication.run(Main.class);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        root = fxmlLoader.load();
        super.init();
        springContext.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setScene(new Scene(root,700,700));
        primaryStage.show();
    }

}
