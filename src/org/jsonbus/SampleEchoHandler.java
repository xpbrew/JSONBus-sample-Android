package org.jsonbus;

import android.app.Activity;
import android.webkit.WebView;

public class SampleEchoHandler
{
  Activity myactivity;
  WebView myview;

  public SampleEchoHandler(Activity a, WebView v)
  {
    myactivity = a;
    myview = v;
  }

  public void jsonmessage(String s)
  {
    myview.loadUrl ("javascript:window.echocb('{echo:"+s+"}')"  );
  }
}
