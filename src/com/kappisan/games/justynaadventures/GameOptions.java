package com.kappisan.games.justynaadventures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.soidutsrepsak.games.justynaadventures.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class GameOptions extends Activity {

	private Context context;
	
	TextView tvHighScore;
	String testString = "WORKS";
	String readString;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_options);
		context = getApplicationContext();
		tvHighScore = (TextView) findViewById(R.id.textViewHighScore);
		
		tvHighScore.setText(getHighScore());
		
/*
	    FileOutputStream fos;

	    try {
	        fos = openFileOutput("test.txt", Context.MODE_PRIVATE);
	        fos.write(testString.getBytes());
	        fos.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();

	    } catch (IOException e) {
	        e.printStackTrace();

	    }

	    File file = getBaseContext().getFileStreamPath("test.txt");

	    if (file.exists()) {

	        FileInputStream fis;

	        try {
	            fis = openFileInput("test.txt");
	            fis.read(readString.getBytes());
	            fis.close();

	        } catch (IOException e) {
	            e.printStackTrace();

	        } 
	        tvHighScore.setText(String.valueOf(readString));
	       } else {
	                     // more code
	       }
	       */
	}
	
	public String getHighScore() {
		int highScore = 555;
		return "CURRENT HIGHSCORE = " + highScore;
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater awesome = getMenuInflater();
		awesome.inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		
		case R.id.menuShowAbout:
			startActivity(new Intent("com.soidutsrepsak.games.justynaadventures.ABOUT"));
			return true;
		}
		
		return false;
	}
	
}
