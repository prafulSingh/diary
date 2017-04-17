package com.eraisedtox94.smartdiary;

/**
 * Created by spraful on 4/8/2017.
 */

public class Constants {

    public static final String DIARY_ENTRY_TABLE = "notes";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_CONTENT = "content";
    public static final String COLUMN_MODIFIED_TIME = "modified_time";
    public static final String COLUMN_CREATED_TIME = "created_time";

    public static final String[] COLUMNS = {
            Constants.COLUMN_ID,
            Constants.COLUMN_TITLE,
            Constants.COLUMN_CONTENT,
            Constants.COLUMN_CREATED_TIME,
            Constants.COLUMN_MODIFIED_TIME
    };
}