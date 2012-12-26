package org.jsonbus;

import android.app.Activity;
import android.os.Bundle;

import android.webkit.WebView;

public class JSONBusSampleApp extends Activity
{
  WebView myView;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    myView = (WebView) findViewById(R.id.mywebview);
    myView.getSettings().setJavaScriptEnabled(true);
    myView.loadUrl("file:///android_asset/index.html");
    myView.addJavascriptInterface(new MyTestHandler(), "MyTestHandler");
  }

  public class MyTestHandler
  {
    public void test(String s)
    {
      myView.loadUrl("javascript:window.testcb('"+s+"')");
    }
  }
}
