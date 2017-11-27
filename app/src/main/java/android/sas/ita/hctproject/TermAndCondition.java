package android.sas.ita.hctproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;

public class TermAndCondition extends AppCompatActivity {
     WebView webView;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_and_condition);
        webView=(WebView)findViewById(R.id.web);
        webView.loadUrl("file:///android_assets/abc.html");
        checkBox=(CheckBox)findViewById(R.id.checkBox);

    }

    public void agree(View view) {
        if(!checkBox.isChecked()){
            return;

        }
        else
        {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);

        }
    }
}
