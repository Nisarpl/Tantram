package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class moduldataalat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
<<<<<<< HEAD:Objects/shell/src/b4a/example/moduldataalat_subs_0.java
		Debug.PushSubsStack("Activity_Create (moduldataalat) ","moduldataalat",3,moduldataalat.mostCurrent.activityBA,moduldataalat.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.moduldataalat.remoteMe.runUserSub(false, "moduldataalat","activity_create", _firsttime);}
=======
		Debug.PushSubsStack("Activity_Create (modulhomepage) ","modulhomepage",1,modulhomepage.mostCurrent.activityBA,modulhomepage.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.modulhomepage.remoteMe.runUserSub(false, "modulhomepage","activity_create", _firsttime);}
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f:Objects/shell/src/b4a/example/modulhomepage_subs_0.java
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
<<<<<<< HEAD:Objects/shell/src/b4a/example/moduldataalat_subs_0.java
		Debug.PushSubsStack("Activity_Pause (moduldataalat) ","moduldataalat",3,moduldataalat.mostCurrent.activityBA,moduldataalat.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.moduldataalat.remoteMe.runUserSub(false, "moduldataalat","activity_pause", _userclosed);}
=======
		Debug.PushSubsStack("Activity_Pause (modulhomepage) ","modulhomepage",1,modulhomepage.mostCurrent.activityBA,modulhomepage.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.modulhomepage.remoteMe.runUserSub(false, "modulhomepage","activity_pause", _userclosed);}
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f:Objects/shell/src/b4a/example/modulhomepage_subs_0.java
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
<<<<<<< HEAD:Objects/shell/src/b4a/example/moduldataalat_subs_0.java
		Debug.PushSubsStack("Activity_Resume (moduldataalat) ","moduldataalat",3,moduldataalat.mostCurrent.activityBA,moduldataalat.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.moduldataalat.remoteMe.runUserSub(false, "moduldataalat","activity_resume");}
=======
		Debug.PushSubsStack("Activity_Resume (modulhomepage) ","modulhomepage",1,modulhomepage.mostCurrent.activityBA,modulhomepage.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.modulhomepage.remoteMe.runUserSub(false, "modulhomepage","activity_resume");}
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f:Objects/shell/src/b4a/example/modulhomepage_subs_0.java
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
<<<<<<< HEAD:Objects/shell/src/b4a/example/moduldataalat_subs_0.java
=======
public static RemoteObject  _btnadmin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAdmin_Click (modulhomepage) ","modulhomepage",1,modulhomepage.mostCurrent.activityBA,modulhomepage.mostCurrent,32);
if (RapidSub.canDelegate("btnadmin_click")) { return b4a.example.modulhomepage.remoteMe.runUserSub(false, "modulhomepage","btnadmin_click");}
 BA.debugLineNum = 32;BA.debugLine="Private Sub BtnAdmin_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
modulhomepage.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 34;BA.debugLine="StartActivity(ModulLoginAdmin)";
Debug.ShouldStop(2);
modulhomepage.mostCurrent.__c.runVoidMethod ("StartActivity",modulhomepage.processBA,(Object)((modulhomepage.mostCurrent._modulloginadmin.getObject())));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnalat_click() throws Exception{
try {
		Debug.PushSubsStack("btnAlat_Click (modulhomepage) ","modulhomepage",1,modulhomepage.mostCurrent.activityBA,modulhomepage.mostCurrent,37);
if (RapidSub.canDelegate("btnalat_click")) { return b4a.example.modulhomepage.remoteMe.runUserSub(false, "modulhomepage","btnalat_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub btnAlat_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
modulhomepage.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 39;BA.debugLine="StartActivity(ModulLoginAlat)";
Debug.ShouldStop(64);
modulhomepage.mostCurrent.__c.runVoidMethod ("StartActivity",modulhomepage.processBA,(Object)((modulhomepage.mostCurrent._modulloginalat.getObject())));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f:Objects/shell/src/b4a/example/modulhomepage_subs_0.java
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}