package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C38221();
    private final long point;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38221 implements Parcelable.Creator<DateValidatorPointBackward> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ DateValidatorPointBackward createFromParcel(@NonNull Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ DateValidatorPointBackward[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public DateValidatorPointBackward createFromParcel(@NonNull Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    public /* synthetic */ DateValidatorPointBackward(long j, C38221 c38221) {
        this(j);
    }

    @NonNull
    public static DateValidatorPointBackward before(long j) {
        return new DateValidatorPointBackward(j);
    }

    @NonNull
    public static DateValidatorPointBackward now() {
        return before(UtcDates.getTodayCalendar().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.point == ((DateValidatorPointBackward) obj).point;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        return j <= this.point;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }

    private DateValidatorPointBackward(long j) {
        this.point = j;
    }
}
