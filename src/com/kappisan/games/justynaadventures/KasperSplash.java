package com.kappisan.games.justynaadventures;

import com.soidutsrepsak.games.justynaadventures.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class KasperSplash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kasper_splash);
		Thread logoTimer = new Thread() {
			@Override
			public void run() {
				try {
					sleep(500);
					Intent menuIntent = new Intent("com.soidutsrepsak.games.justynaadventures.GAMESPLASH");
					startActivity(menuIntent);
				} catch(InterruptedException e) {
					e.printStackTrace();
				} finally {
					finish();
				}
			}
		};
		logoTimer.start();
	}

}
