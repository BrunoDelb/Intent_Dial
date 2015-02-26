package com.mma.androidlabtest;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {
			 
	EditText etNumber;
	
	public void onCreate (Bundle icicle) {
		super.onCreate (icicle);
		setContentView (R.layout.main);
		etNumber = (EditText)findViewById (R.id.et_number);
		Button btnDial = (Button)findViewById (R.id.btn_dial);
		btnDial.setOnClickListener (new Button.OnClickListener() {
			public void onClick (View view) {
				startActivity (new Intent (Intent.ACTION_DIAL, Uri.parse ("tel:" + 
						etNumber.getText().toString())));
			}
		});
	}
}
