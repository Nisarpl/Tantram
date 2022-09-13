package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class moduldashboard_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
<<<<<<< HEAD
		Debug.PushSubsStack("Activity_Create (moduldashboard) ","moduldashboard",2,moduldashboard.mostCurrent.activityBA,moduldashboard.mostCurrent,18);
=======
		Debug.PushSubsStack("Activity_Create (moduldashboard) ","moduldashboard",3,moduldashboard.mostCurrent.activityBA,moduldashboard.mostCurrent,18);
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f
if (RapidSub.canDelegate("activity_create")) { return b4a.example.moduldashboard.remoteMe.runUserSub(false, "moduldashboard","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"DasboardAdmin\")";
Debug.ShouldStop(524288);
moduldashboard.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DasboardAdmin")),moduldashboard.mostCurrent.activityBA);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
<<<<<<< HEAD
		Debug.PushSubsStack("Activity_Pause (moduldashboard) ","moduldashboard",2,moduldashboard.mostCurrent.activityBA,moduldashboard.mostCurrent,27);
=======
		Debug.PushSubsStack("Activity_Pause (moduldashboard) ","moduldashboard",3,moduldashboard.mostCurrent.activityBA,moduldashboard.mostCurrent,28);
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.moduldashboard.remoteMe.runUserSub(false, "moduldashboard","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
<<<<<<< HEAD
		Debug.PushSubsStack("Activity_Resume (moduldashboard) ","moduldashboard",2,moduldashboard.mostCurrent.activityBA,moduldashboard.mostCurrent,23);
=======
		Debug.PushSubsStack("Activity_Resume (moduldashboard) ","moduldashboard",3,moduldashboard.mostCurrent.activityBA,moduldashboard.mostCurrent,24);
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.moduldashboard.remoteMe.runUserSub(false, "moduldashboard","activity_resume");}
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}