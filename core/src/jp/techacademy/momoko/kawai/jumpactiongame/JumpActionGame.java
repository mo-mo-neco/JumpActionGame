package jp.techacademy.momoko.kawai.jumpactiongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpActionGame extends Game {
	public SpriteBatch batch;
	public ActivityRequestHandler mRequestHandler;

	public JumpActionGame(ActivityRequestHandler requestHandler) {
		super();
		mRequestHandler = requestHandler;
	}

	Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();

		setScreen(new GameScreen(this));
	}
}
