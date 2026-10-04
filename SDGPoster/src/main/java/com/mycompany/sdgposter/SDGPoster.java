/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sdgposter;

/**
 *
 * @author hp
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class SDGPoster extends Application {

    @Override
    public void start(Stage stage) {

        // ==============================
        // TOP TITLE
        // ==============================

        Label sdgNumber = new Label("🌍  SDG 13");
        sdgNumber.setFont(Font.font("Arial", FontWeight.BOLD, 42));
        sdgNumber.setTextFill(Color.WHITE);

        Label title = new Label("CLIMATE ACTION");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        title.setTextFill(Color.WHITE);

        Label subtitle = new Label(
                "Together, Let's Protect Our Planet!"
        );
        subtitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        subtitle.setTextFill(Color.web("#FFF59D"));

        // ==============================
        // MAIN MESSAGE
        // ==============================

        Label message = new Label(
                "🌱 Small Actions Today\n"
                + "Create a Better Tomorrow 🌱"
        );

        message.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        message.setTextFill(Color.WHITE);
        message.setAlignment(Pos.CENTER);

        // ==============================
        // ACTION CARDS
        // ==============================

        Label tree = createCard(
                "🌳",
                "PLANT TREES",
                "Grow more trees\nand protect forests."
        );

        Label recycle = createCard(
                "♻",
                "RECYCLE",
                "Reduce waste\nand reuse materials."
        );

        Label energy = createCard(
                "⚡",
                "SAVE ENERGY",
                "Switch off lights\nwhen not needed."
        );

        Label water = createCard(
                "💧",
                "SAVE WATER",
                "Use water wisely\nand avoid wastage."
        );

        HBox row1 = new HBox(20, tree, recycle);
        row1.setAlignment(Pos.CENTER);

        HBox row2 = new HBox(20, energy, water);
        row2.setAlignment(Pos.CENTER);

        // ==============================
        // CALL TO ACTION
        // ==============================

        Label call = new Label(
                "🌎 THERE IS NO PLANET B! 🌎"
        );

        call.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        call.setTextFill(Color.WHITE);

        Button actButton = new Button("🌱 ACT NOW!");
        actButton.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        actButton.setStyle(
                "-fx-background-color: #FFD600;" +
                "-fx-text-fill: #1B5E20;" +
                "-fx-background-radius: 30;" +
                "-fx-padding: 12 35;" +
                "-fx-cursor: hand;"
        );

        // Button event
        actButton.setOnAction(e -> {
            call.setText(
                    "💚 THANK YOU FOR CARING FOR OUR PLANET! 💚"
            );

            actButton.setText("🌍 I AM TAKING ACTION!");
        });

        // ==============================
        // FOOTER
        // ==============================

        Label footer = new Label(
                "Every action counts • Every person matters • Every day matters"
        );

        footer.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        footer.setTextFill(Color.WHITE);

        // ==============================
        // MAIN LAYOUT
        // ==============================

        VBox root = new VBox(18);

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(30));

        // Colourful gradient background
        root.setStyle(
                "-fx-background-color: linear-gradient(" +
                "to bottom right, " +
                "#00695C, " +
                "#2E7D32, " +
                "#43A047, " +
                "#81C784);"
        );

        root.getChildren().addAll(
                sdgNumber,
                title,
                subtitle,
                message,
                row1,
                row2,
                call,
                actButton,
                footer
        );

        // ==============================
        // SCENE
        // ==============================

        Scene scene = new Scene(root, 700, 800);

        stage.setTitle("SDG 13 - Climate Action Poster");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // ==============================
    // CREATE COLOURFUL CARD
    // ==============================

    private Label createCard(
            String icon,
            String heading,
            String description) {

        Label card = new Label(
                icon + "\n\n"
                + heading + "\n\n"
                + description
        );

        card.setPrefSize(250, 130);
        card.setAlignment(Pos.CENTER);

        card.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        card.setTextFill(Color.WHITE);

        card.setStyle(
                "-fx-background-color: rgba(255,255,255,0.20);" +
                "-fx-background-radius: 20;" +
                "-fx-border-color: white;" +
                "-fx-border-width: 2;" +
                "-fx-border-radius: 20;" +
                "-fx-padding: 15;"
        );

        return card;
    }

    // ==============================
    // MAIN METHOD
    // ==============================

    public static void main(String[] args) {
        launch(args);
    }
}
