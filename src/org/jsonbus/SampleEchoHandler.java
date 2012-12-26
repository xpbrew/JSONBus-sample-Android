package org.jsonbus;

import android.app.Activity;
import android.webkit.WebView;

public class SampleEchoHandler implements JSONBusHandler
{
  JSONBusActivity myactivity;

  public SampleEchoHandler(JSONBusActivity activity)
  {
    myactivity = activity;
  }

  public void jsonmessage(String s)
  {
    myactivity.sendJavascript("javascript:window.echocb('{echo:"+s+"}')");
  }
}
