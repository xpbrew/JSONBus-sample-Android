package org.jsonbus;

import android.app.Activity;
import android.os.Bundle;

import android.webkit.WebView;

public class JSONBusActivity extends Activity
{
  protected WebView myView;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    myView = (WebView) findViewById(R.id.mywebview);
    myView.getSettings().setJavaScriptEnabled(true);
    //myView.addJavascriptInterface(new SampleEchoHandler(this, myView), "SampleEchoHandler");
    //myView.loadUrl("file:///android_asset/index.html");
  }
}
