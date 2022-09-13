package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulloginadmin_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (modulloginadmin) ","modulloginadmin",1,modulloginadmin.mostCurrent.activityBA,modulloginadmin.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.modulloginadmin.remoteMe.runUserSub(false, "modulloginadmin","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"LoginAdmin\")";
Debug.ShouldStop(2097152);
modulloginadmin.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoginAdmin")),modulloginadmin.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Pause (modulloginadmin) ","modulloginadmin",1,modulloginadmin.mostCurrent.activityBA,modulloginadmin.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.modulloginadmin.remoteMe.runUserSub(false, "modulloginadmin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Resume (modulloginadmin) ","modulloginadmin",1,modulloginadmin.mostCurrent.activityBA,modulloginadmin.mostCurrent,26);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.modulloginadmin.remoteMe.runUserSub(false, "modulloginadmin","activity_resume");}
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (modulloginadmin) ","modulloginadmin",1,modulloginadmin.mostCurrent.activityBA,modulloginadmin.mostCurrent,35);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.modulloginadmin.remoteMe.runUserSub(false, "modulloginadmin","btnlogin_click");}
 BA.debugLineNum = 35;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
modulloginadmin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 37;BA.debugLine="StartActivity(ModulDashboard)";
Debug.ShouldStop(16);
modulloginadmin.mostCurrent.__c.runVoidMethod ("StartActivity",modulloginadmin.processBA,(Object)((modulloginadmin.mostCurrent._moduldashboard.getObject())));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private edtUsername As EditText";
modulloginadmin.mostCurrent._edtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private edtPassword As EditText";
modulloginadmin.mostCurrent._edtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}