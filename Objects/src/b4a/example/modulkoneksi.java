package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class modulkoneksi {
private static modulkoneksi mostCurrent = new modulkoneksi();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static mysql.mysqlhandler _mhandler = null;
public static mysql.mysqlhandler.ResultSetWrapper _results = null;
public b4a.example.main _main = null;
<<<<<<< HEAD
public b4a.example.modulloginadmin _modulloginadmin = null;
public b4a.example.moduldashboard _moduldashboard = null;
public b4a.example.moduldataalat _moduldataalat = null;
public b4a.example.modultambahalat _modultambahalat = null;
public b4a.example.modulloginalat _modulloginalat = null;
public b4a.example.modulalat01 _modulalat01 = null;
public b4a.example.modulgambar _modulgambar = null;
=======
public b4a.example.modulhomepage _modulhomepage = null;
public b4a.example.modulloginadmin _modulloginadmin = null;
public b4a.example.moduldashboard _moduldashboard = null;
public b4a.example.modulalat01 _modulalat01 = null;
public b4a.example.modulloginalat _modulloginalat = null;
public b4a.example.modullaporanbulananalat _modullaporanbulananalat = null;
public b4a.example.modulgambar _modulgambar = null;
public b4a.example.modullaporanbulanan _modullaporanbulanan = null;
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f
public b4a.example.starter _starter = null;
public static String  _koneksi(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="modulkoneksi";
if (Debug.shouldDelegate(null, "koneksi", false))
	 {return ((String) Debug.delegate(null, "koneksi", new Object[] {_ba}));}
<<<<<<< HEAD
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub koneksi";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="MHandler.Initialize(\"meniti.id\", \"u7753801_db_tan";
_mhandler.Initialize("meniti.id","u7753801_db_tantram","u7753801_asepmustopa","4sepmust0p4");
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="If MHandler.isConnected = False Then";
if (_mhandler.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Koneksi Terputus"),BA.ObjectToCharSequence("Info"),(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="End Sub";
=======
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub koneksi";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="MHandler.Initialize(\"meniti.id\", \"u7753801_db_tan";
_mhandler.Initialize("meniti.id","u7753801_db_tantram","u7753801_asepmustopa","4sepmust0p4");
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="If MHandler.isConnected = False Then";
if (_mhandler.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Koneksi Terputus"),BA.ObjectToCharSequence("Info"),(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="End Sub";
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f
return "";
}
}