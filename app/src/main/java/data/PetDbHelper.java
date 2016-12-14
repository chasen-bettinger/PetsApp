package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import data.PetContract.PetEntry;

/**
 * Created by Chasen on 12/13/2016.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTable = "CREATE TABLE " + PetEntry.TABLE_NAME + " ( "
                + PetEntry._ID + " integer primary key autoincrement, "
                + PetEntry.COLUMN_PET_NAME + " text, "
                + PetEntry.COLUMN_PET_BREED + " text, "
                + PetEntry.COLUMN_PET_GENDER + " integer, "
                + PetEntry.COLUMN_PET_WEIGHT + " integer);";

        sqLiteDatabase.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        // String dropTable = "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;

        // sqLiteDatabase.execSQL(dropTable);

        // sqLiteDatabase.setVersion(i1);

    }
}
