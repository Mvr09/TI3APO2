package com.mike.ti3apo2.view;
//Esta clase sería responsable de dibujar el estado actual del juego. Esto incluiría la posición del jugador, los enemigos, las balas, etc.
import com.mike.ti3apo2.model.Player;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class GameView {
    private GraphicsContext gc;

    public GameView(GraphicsContext gc) {
        this.gc = gc;
    }

    public void drawPlayer(Player player) {
        // Dibuja el jugador en el canvas usando la imagen del jugador y su posición
        // Todo: encontrar imagen del jugador
        Image playerImage = new Image("file:player.png");
        gc.drawImage(playerImage, player.getX(), player.getY());
    }

    // Métodos similares para dibujar enemigos, balas, etc.
}
