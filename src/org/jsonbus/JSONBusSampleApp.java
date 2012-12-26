package org.jsonbus;

import android.app.Activity;
import android.os.Bundle;

import android.webkit.WebView;

public class JSONBusSampleApp extends JSONBusActivity
{
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    myView.addJavascriptInterface(new SampleEchoHandler(this, myView), "SampleEchoHandler");
    myView.loadUrl("file:///android_asset/index.html");
  }
}
