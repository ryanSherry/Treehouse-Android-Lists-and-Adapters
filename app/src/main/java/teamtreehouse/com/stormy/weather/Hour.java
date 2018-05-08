package teamtreehouse.com.stormy.weather;

import android.os.Parcel;
import android.os.Parcelable;

public class Hour implements Parcelable {
    private Long mTime;
    private String mSummary;
    private double mTemperature;
    private String mIcon;
    private String mTimezone;

    public Long getTime() {
        return mTime;
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }


    @Override
    public int describeContents() {
        return 0; // ignore
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(mTime);
        parcel.writeString(mSummary);
        parcel.writeDouble(mTemperature);
        parcel.writeString(mIcon);
        parcel.writeString(mTimezone);
    }

    public Hour() {}

    private Hour(Parcel in) {
        mTime = in.readLong();
        mSummary = in.readString();
        mTemperature = in.readDouble();
        mIcon = in.readString();
        mTimezone = in.readString();
    }

    public static final Creator<Hour> CREATOR = new Creator<Hour>() {
        @Override
        public Hour createFromParcel(Parcel parcel) {
            return new Hour(parcel);
        }

        @Override
        public Hour[] newArray(int i) {
            return new Hour[i];
        }
    };
}

