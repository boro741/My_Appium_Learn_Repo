# My_Appium_Learn_Repo

#### Hybrid App
So it is the app which is native also has access to web view i.e opens the chrome browser
<br><br>
Appium cannot handle when your in native app and then switch to chrome browser.<br>
In this case you need to tell appium that your switching the context so that Appium injects selenium.
Since Selenium can handle better the web view.<br>

<b>Note:</b><br>
When switching the context it is important that to wait for some seconds and later check the context.

<b>Resources:</b><br>
http://appium.io/docs/en/writing-running-appium/web/hybrid/