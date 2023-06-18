import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WhitePage extends Application {

    private static final int PAGE_WIDTH = 400;
    private static final int PAGE_HEIGHT = 400;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("White Page");

        StackPane whitePage = new StackPane();
        whitePage.setStyle("-fx-background-color: white");

        Button openBlackPageButton = new Button("Open Black Page");
        openBlackPageButton.setOnAction(event -> {
            BlackPage blackPage = new BlackPage();
            blackPage.show();
            primaryStage.hide();
        });

        whitePage.getChildren().add(openBlackPageButton);

        Scene scene = new Scene(whitePage, PAGE_WIDTH, PAGE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
