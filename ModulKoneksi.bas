﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=11.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim MHandler As MysqlHandler
	Dim ResultS As ResultSet
End Sub

Sub koneksi
	'setting koneksi database
	MHandler.Initialize("meniti.id", "u7753801_db_tantram", "u7753801_asepmustopa", "4sepmust0p4")
	
	'cek koneksi
	If MHandler.isConnected = False Then
		MsgboxAsync("Koneksi Terputus","Info")
		ExitApplication
	End If
End Sub