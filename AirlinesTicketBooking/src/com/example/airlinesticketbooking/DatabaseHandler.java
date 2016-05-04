package com.example.airlinesticketbooking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHandler extends SQLiteOpenHelper{
	
	SQLiteDatabase db;
	private static final String LOGCAT = null;
	public static final int Database_Version=1;
	public  static final String Database_Name="Ticket Booking"; 
  

	public DatabaseHandler(Context context) {
		super(context, Database_Name, null, Database_Version);
		Log.d(LOGCAT,"created");
		// TODO Auto-generated constructor stub
		}
		

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
 String Create_Registration_table= "CREATE TABLE tbl_register(_id INTEGER PRIMARY KEY AUTOINCREMENT, reg_username TEXT, reg_email TEXT, reg_password TEXT, reg_phone TEXT);";
 String CREATE_CARD_TABLE="CREATE TABLE tbl_card(_id INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,NUMBER TEXT,DATE TEXT);";		
 db.execSQL(Create_Registration_table);
 db.execSQL(CREATE_CARD_TABLE);
 Log.d(LOGCAT,"table created");
		//this.onCreate(db);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	private static final String Table_Register="tbl_register";
	private static final String Table_card="tbl_card";
	private static final String KEY_ID="_id";
	//private static final String KEY_NAME="reg_name";
	private static final String KEY_USERNAME="reg_username";
	private static final String KEY_EMAIL="reg_email";
	private static final String KEY_PASSWORD="reg_password";
	private static final String KEY_PHONE="reg_phone";
	private static final String KEY_NAME="NAME";
	private static final String KEY_NUMBER="NUMBER";
	private static final String KEY_DATE="DATE";
	
	public void open() throws SQLException
	{
	    db=this.getWritableDatabase();
	}
	public void close()
	{
		//SQLiteDatabase db;
		if(db!=null)
			db.close();
	}
	public void insertData(String my_username,String my_email,String my_password,String my_phone)
	{
		
		SQLiteDatabase db=this.getWritableDatabase();
		ContentValues cv=new ContentValues();
		cv.put(KEY_USERNAME,my_username);
		cv.put(KEY_EMAIL,my_email);
		cv.put(KEY_PASSWORD,my_password);
		cv.put(KEY_PHONE,my_phone);
		//db.o
		db.insert(Table_Register, null, cv);
		Log.d("insert name", my_username.toString());
		Log.d("insert email", my_email.toString());
		Log.d("insert password", my_password.toString());
		Log.d("insert name", my_phone.toString());
		
		
		db.close();
		
	}
	public void insertCardData(String name,String number,String date)
	{
		SQLiteDatabase db=this.getWritableDatabase();
		ContentValues cv1=new ContentValues();
		cv1.put(KEY_NAME,name);
		cv1.put(KEY_NUMBER,number);
		cv1.put(KEY_DATE,date);
		//db.o
		db.insert(Table_card, null, cv1);
		Log.d("insert card", name.toString());
		Log.d("insert num", number.toString());
		Log.d("insert date", date.toString());
		db.close();
		
	}
	public Boolean validateLogin(String uname,String pass)
	{
		SQLiteDatabase db=this.getReadableDatabase();
		String[] columns={KEY_ID};
		String Selection="KEY_USERNAME=? AND KEY_PASSWORD=?";
		String SelectionArgs[]={uname,pass};
		Cursor cursor=null;
		cursor=db.query(Table_Register, columns, Selection, SelectionArgs, null, null, null);
		int numberOfRows=cursor.getCount();
		if(numberOfRows<=0)
		{
			return false;
		}
		else return true;
		
	}
	
	public String getSinlgeEntry(String uname)
	{
	    String Selection="reg_username=?";
		String SelectionArgs[]={uname};
		Cursor cursor=db.query(Table_Register, null,Selection ,SelectionArgs , null, null, null);
        if(cursor.getCount()<=0) // UserName Not Exist
            return "NOT EXIST";
      
        cursor.moveToFirst();
        String password= cursor.getString(cursor.getColumnIndex("reg_password"));
        return password;
        
        }
	

}
