package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class InterfazControles extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(10);

        addControl(vbox, new Label("Button:"), new Button("Button"));
        addControl(vbox, new Label("CheckBox:"), new CheckBox("CheckBox"));
        addControl(vbox, new Label("Hyperlink:"), new Hyperlink("Hyperlink"));
        addControl(vbox, new Label("ToggleButton:"), new ToggleButton("ToggleButton"));
        addControl(vbox, new Label("RadioButton:"), new RadioButton("RadioButton"));
        addControl(vbox, new Label("Label:"), new Label("Label"));
        addControl(vbox, new Label("TextField:"), new TextField("some text..."));
        addControl(vbox, new Label("PasswordField:"), new PasswordField());
        addControl(vbox, new Label("TextArea:"), new TextArea("This is very long text that will wrap to several lines."));
        addControl(vbox, new Label("ProgressIndicator:"), new ProgressIndicator(0.49));
        addControl(vbox, new Label("ProgressBar:"), new ProgressBar(0.9));
        addControl(vbox, new Label("Slider:"), new Slider());

        Scene scene = new Scene(vbox, 600, 600);
        primaryStage.setTitle("All Controls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addControl(VBox vbox, Label label, Control control) {
        HBox hbox = new HBox();
        hbox.getChildren().addAll(label, control);
        hbox.setSpacing(10);
        vbox.getChildren().add(hbox);
    }

    public static void main(String[] args) {
        launch(args);
    }
}