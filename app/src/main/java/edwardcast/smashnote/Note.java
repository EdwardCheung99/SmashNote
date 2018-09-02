package edwardcast.smashnote;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Note {
    private long mDateTime;
    private String mTitle;
    private String mContent;

    public Note(String title, long DateTime, String content){
        mTitle = title;
        mDateTime = DateTime;
        mContent = content;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public void setDateTime(long dateTime) {
        mDateTime = dateTime;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public long getDateTime() {
        return mDateTime;
    }

    public String getContent() {
        return mContent;
    }

    public String getDateTimeFormatted(Context context) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"
                , context.getResources().getConfiguration().locale);
        formatter.setTimeZone(TimeZone.getDefault());
        return formatter.format(new Date(mDateTime));
    }
}
