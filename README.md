# My_Appium_Learn_Repo


Error Resolve Solution:<br>
Original error: No Chromedriver found that can automate Chrome '83.0.4103'.

Please download chrome driver which must be compatible with installed chrome , then pass the path in desired capabilities.

For windows don’t forget to add .exe with chromedriver.



https://chromedriver.chromium.org/downloads

You can download chrome driver via nom

https://www.npmjs.com/package/chromedriver

cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

cap.setCapability("chromedriverExecutable", "/Users/45678/node_modules/chromedriver/bin/chromedriver");

<br>
<b>Chrome Abruptly close and open solution:</b> <br>
Download the chrome driver with version that is mentioned in error.