
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "b4a.example.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.example.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static b4a.example.main _main = null;
<<<<<<< HEAD
public static b4a.example.modulloginadmin _modulloginadmin = null;
public static b4a.example.moduldashboard _moduldashboard = null;
public static b4a.example.moduldataalat _moduldataalat = null;
public static b4a.example.modultambahalat _modultambahalat = null;
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.modulloginalat _modulloginalat = null;
public static b4a.example.modulalat01 _modulalat01 = null;
public static b4a.example.modulgambar _modulgambar = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(b4a.example.main.class),"ModulAlat01",Debug.moduleToString(b4a.example.modulalat01.class),"ModulDashboard",Debug.moduleToString(b4a.example.moduldashboard.class),"ModulDataAlat",Debug.moduleToString(b4a.example.moduldataalat.class),"ModulGambar",Debug.moduleToString(b4a.example.modulgambar.class),"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"ModulLoginAdmin",Debug.moduleToString(b4a.example.modulloginadmin.class),"ModulLoginAlat",Debug.moduleToString(b4a.example.modulloginalat.class),"Modultambahalat",Debug.moduleToString(b4a.example.modultambahalat.class),"Service",starter.mostCurrent._service};
=======
public static b4a.example.modulhomepage _modulhomepage = null;
public static b4a.example.modulloginadmin _modulloginadmin = null;
public static b4a.example.moduldashboard _moduldashboard = null;
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.modulalat01 _modulalat01 = null;
public static b4a.example.modulloginalat _modulloginalat = null;
public static b4a.example.modullaporanbulananalat _modullaporanbulananalat = null;
public static b4a.example.modulgambar _modulgambar = null;
public static b4a.example.modullaporanbulanan _modullaporanbulanan = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(b4a.example.main.class),"ModulAlat01",Debug.moduleToString(b4a.example.modulalat01.class),"ModulDashboard",Debug.moduleToString(b4a.example.moduldashboard.class),"ModulGambar",Debug.moduleToString(b4a.example.modulgambar.class),"ModulHomePage",Debug.moduleToString(b4a.example.modulhomepage.class),"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"ModulLaporanBulanan",Debug.moduleToString(b4a.example.modullaporanbulanan.class),"ModulLaporanBulananAlat",Debug.moduleToString(b4a.example.modullaporanbulananalat.class),"ModulLoginAdmin",Debug.moduleToString(b4a.example.modulloginadmin.class),"ModulLoginAlat",Debug.moduleToString(b4a.example.modulloginalat.class),"Service",starter.mostCurrent._service};
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f
}
}