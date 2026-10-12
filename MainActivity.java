package com.evtools.slotfill;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebView; import android.webkit.WebSettings; import android.graphics.Color;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){ super.onCreate(b); getWindow().setStatusBarColor(Color.rgb(18,48,71)); getWindow().setNavigationBarColor(Color.rgb(18,48,71)); WebView w=new WebView(this); w.setBackgroundColor(Color.rgb(242,245,247)); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); w.setVerticalScrollBarEnabled(true); setContentView(w); w.loadUrl("file:///android_asset/index.html"); }
}
