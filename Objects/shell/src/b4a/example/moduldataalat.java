
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

public class moduldataalat implements IRemote{
	public static moduldataalat mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public moduldataalat() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("moduldataalat"), "b4a.example.moduldataalat");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, moduldataalat.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static b4a.example.main _main = null;
public static b4a.example.modulloginadmin _modulloginadmin = null;
public static b4a.example.moduldashboard _moduldashboard = null;
<<<<<<< HEAD:Objects/shell/src/b4a/example/moduldataalat.java
public static b4a.example.modultambahalat _modultambahalat = null;
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.modulloginalat _modulloginalat = null;
public static b4a.example.modulalat01 _modulalat01 = null;
public static b4a.example.modulgambar _modulgambar = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",moduldataalat.mostCurrent._activity,"Main",Debug.moduleToString(b4a.example.main.class),"ModulAlat01",Debug.moduleToString(b4a.example.modulalat01.class),"ModulDashboard",Debug.moduleToString(b4a.example.moduldashboard.class),"ModulGambar",Debug.moduleToString(b4a.example.modulgambar.class),"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"ModulLoginAdmin",Debug.moduleToString(b4a.example.modulloginadmin.class),"ModulLoginAlat",Debug.moduleToString(b4a.example.modulloginalat.class),"Modultambahalat",Debug.moduleToString(b4a.example.modultambahalat.class),"Starter",Debug.moduleToString(b4a.example.starter.class)};
=======
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.modulalat01 _modulalat01 = null;
public static b4a.example.modulloginalat _modulloginalat = null;
public static b4a.example.modullaporanbulananalat _modullaporanbulananalat = null;
public static b4a.example.modulgambar _modulgambar = null;
public static b4a.example.modullaporanbulanan _modullaporanbulanan = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",modulhomepage.mostCurrent._activity,"Main",Debug.moduleToString(b4a.example.main.class),"ModulAlat01",Debug.moduleToString(b4a.example.modulalat01.class),"ModulDashboard",Debug.moduleToString(b4a.example.moduldashboard.class),"ModulGambar",Debug.moduleToString(b4a.example.modulgambar.class),"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"ModulLaporanBulanan",Debug.moduleToString(b4a.example.modullaporanbulanan.class),"ModulLaporanBulananAlat",Debug.moduleToString(b4a.example.modullaporanbulananalat.class),"ModulLoginAdmin",Debug.moduleToString(b4a.example.modulloginadmin.class),"ModulLoginAlat",Debug.moduleToString(b4a.example.modulloginalat.class),"Starter",Debug.moduleToString(b4a.example.starter.class)};
>>>>>>> 9cbe68af9e81a97d1975c236ef46985b5c8e933f:Objects/shell/src/b4a/example/modulhomepage.java
}
}