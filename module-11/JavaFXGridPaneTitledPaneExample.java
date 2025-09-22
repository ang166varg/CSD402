// Angela Vargas CSD402 Example Code 
// This program demonstrates the use of JavaFX GridPane and TitledPane
// It matches the examples described in the paper:
//   - GridPane is used for a simple login form (username + password).
//   - TitledPane is used for a settings section.
//   - A combination of GridPane inside a TitledPane is also shown.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFXGridPaneTitledPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // === Example 1: GridPane for a Login Form ===
        GridPane loginGrid = new GridPane();
        loginGrid.setHgap(10); // horizontal spacing between columns
        loginGrid.setVgap(10); // vertical spacing between rows
        loginGrid.setStyle("-fx-padding: 20;"); // padding around the grid

        // Labels and input fields
        Label userLabel = new Label("Username:");
        TextField userField = new TextField();
        Label passLabel = new Label("Password:");
        PasswordField passField = new PasswordField();

        // Add items to the grid by (column, row)
        loginGrid.add(userLabel, 0, 0);
        loginGrid.add(userField, 1, 0);
        loginGrid.add(passLabel, 0, 1);
        loginGrid.add(passField, 1, 1);

        Button loginButton = new Button("Login");
        loginGrid.add(loginButton, 1, 2); // place button under password field

        // === Example 2: TitledPane for Settings ===
        VBox settingsBox = new VBox(10); // vertical layout inside titled pane
        settingsBox.setStyle("-fx-padding: 10;");

        CheckBox darkMode = new CheckBox("Enable Dark Mode");
        CheckBox notifications = new CheckBox("Enable Notifications");
        settingsBox.getChildren().addAll(darkMode, notifications);

        TitledPane settingsPane = new TitledPane("Application Settings", settingsBox);
        settingsPane.setExpanded(false); // collapsed by default

        // === Example 3: Combining GridPane inside TitledPane ===
        GridPane networkGrid = new GridPane();
        networkGrid.setHgap(10);
        networkGrid.setVgap(10);
        networkGrid.setStyle("-fx-padding: 10;");

        Label hostLabel = new Label("Host:");
        TextField hostField = new TextField();
        Label portLabel = new Label("Port:");
        TextField portField = new TextField();
        CheckBox sslBox = new CheckBox("Use SSL");

        // Add network controls to grid
        networkGrid.add(hostLabel, 0, 0);
        networkGrid.add(hostField, 1, 0);
        networkGrid.add(portLabel, 0, 1);
        networkGrid.add(portField, 1, 1);
        networkGrid.add(sslBox, 1, 2);

        TitledPane networkPane = new TitledPane("Network Settings", networkGrid);
        networkPane.setExpanded(true); // expanded by default

        // === Organize everything into a VBox layout ===
        VBox root = new VBox(20);
        root.setStyle("-fx-padding: 20;");
        root.getChildren().addAll(new Label("Login Form:"), loginGrid, settingsPane, networkPane);

        // Create scene and show stage
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("JavaFX GridPane and TitledPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Main method to launch the program
    public static void main(String[] args) {
        launch(args);
    }
}