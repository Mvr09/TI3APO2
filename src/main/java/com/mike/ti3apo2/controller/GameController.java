package com.mike.ti3apo2.controller;

import com.mike.ti3apo2.model.Enemy;
import com.mike.ti3apo2.model.Player;
import com.mike.ti3apo2.view.GameView;

//Esta clase manejaría la lógica principal del juego, como el bucle del juego, la detección de colisiones, el cambio de escenario, etc.
public class GameController {
    private Player player;
    private Enemy enemy;
    private GameView gameView;

    public GameController(Player player, Enemy enemy, GameView gameView) {
        this.player = player;
        this.enemy = enemy;
        this.gameView = gameView;
    }

    public void update() {
        // Actualiza el estado del juego y luego lo dibuja
        // Por ejemplo, podrías cambiar la posición del jugador aquí basándote en las teclas presionadas

        // Luego, usa el objeto gameView para dibujar el estado actual del juego
        gameView.drawPlayer(player);
        // Más código para dibujar enemigos, balas, etc.
    }
}
