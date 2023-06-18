import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BlackPage extends Application {

    private static final int PAGE_WIDTH = 400;
    private static final int PAGE_HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Black Page");

        StackPane blackPage = new StackPane();
        blackPage.setStyle("-fx-background-color: black");

        Button closeBlackPageButton = new Button("Close Black Page");
        closeBlackPageButton.setOnAction(event -> {
            WhitePage whitePage = new WhitePage();
            whitePage.start(new Stage());
            primaryStage.hide();
        });

        blackPage.getChildren().add(closeBlackPageButton);

        Scene scene = new Scene(blackPage, PAGE_WIDTH, PAGE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
