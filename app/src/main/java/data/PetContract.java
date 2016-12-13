package data;

import android.provider.BaseColumns;


/**
 * Created by Chasen on 12/13/2016.
 */

public final class PetContract {

    public static abstract class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "Pets";

        public static final String _ID = BaseColumns._ID;

        public static final String COLUMN_PET_NAME = "name";

        public static final String COLUMN_PET_BREED = "breed";

        public static final String COLUMN_PET_GENDER = "gender";

        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}