package com.mike.ti3apo2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import com.mike.ti3apo2.model.Player;
import com.mike.ti3apo2.model.Enemy;

import com.mike.ti3apo2.view.GameView;
import com.mike.ti3apo2.controller.GameController;
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mi Juego");

        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        Canvas canvas = new Canvas(800, 600);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Inicializa el modelo, la vista y el controlador
        Player player = new Player(/* parámetros */);
        Enemy enemy = new Enemy(/* parámetros */);
        GameView gameView = new GameView(gc);
        GameController gameController = new GameController(player, enemy, gameView);

        // Crea el bucle del juego
        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                // Actualiza y dibuja el juego en cada frame
                gameController.update();
            }
        }.start();

        primaryStage.show();
    }
}