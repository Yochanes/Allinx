package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C38181();

    @NonNull
    private final Month end;
    private final int firstDayOfWeek;
    private final int monthSpan;

    @Nullable
    private Month openAt;

    @NonNull
    private final Month start;

    @NonNull
    private final DateValidator validator;
    private final int yearSpan;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38181 implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ CalendarConstraints[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i, C38181 c38181) {
        this(month, month2, dateValidator, month3, i);
    }

    public static /* synthetic */ Month access$100(CalendarConstraints calendarConstraints) {
        return calendarConstraints.start;
    }

    public static /* synthetic */ Month access$200(CalendarConstraints calendarConstraints) {
        return calendarConstraints.end;
    }

    public static /* synthetic */ Month access$300(CalendarConstraints calendarConstraints) {
        return calendarConstraints.openAt;
    }

    public static /* synthetic */ int access$400(CalendarConstraints calendarConstraints) {
        return calendarConstraints.firstDayOfWeek;
    }

    public static /* synthetic */ DateValidator access$500(CalendarConstraints calendarConstraints) {
        return calendarConstraints.validator;
    }

    public Month clamp(Month month) {
        return month.compareTo2(this.start) < 0 ? this.start : month.compareTo2(this.end) > 0 ? this.end : month;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.start.equals(calendarConstraints.start) && this.end.equals(calendarConstraints.end) && Objects.equals(this.openAt, calendarConstraints.openAt) && this.firstDayOfWeek == calendarConstraints.firstDayOfWeek && this.validator.equals(calendarConstraints.validator);
    }

    public DateValidator getDateValidator() {
        return this.validator;
    }

    @NonNull
    public Month getEnd() {
        return this.end;
    }

    public long getEndMs() {
        return this.end.timeInMillis;
    }

    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public int getMonthSpan() {
        return this.monthSpan;
    }

    @Nullable
    public Month getOpenAt() {
        return this.openAt;
    }

    @Nullable
    public Long getOpenAtMs() {
        Month month = this.openAt;
        if (month == null) {
            return null;
        }
        return Long.valueOf(month.timeInMillis);
    }

    @NonNull
    public Month getStart() {
        return this.start;
    }

    public long getStartMs() {
        return this.start.timeInMillis;
    }

    public int getYearSpan() {
        return this.yearSpan;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, Integer.valueOf(this.firstDayOfWeek), this.validator});
    }

    public boolean isWithinBounds(long j) {
        if (this.start.getDay(1) > j) {
            return false;
        }
        Month month = this.end;
        return j <= month.getDay(month.daysInMonth);
    }

    public void setOpenAt(@Nullable Month month) {
        this.openAt = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
        parcel.writeInt(this.firstDayOfWeek);
    }

    private CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, @Nullable Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.start = month;
        this.end = month2;
        this.openAt = month3;
        this.firstDayOfWeek = i;
        this.validator = dateValidator;
        if (month3 != null && month.compareTo2(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo2(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > UtcDates.getUtcCalendar().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.monthSpan = month.monthsUntil(month2) + 1;
        this.yearSpan = (month2.year - month.year) + 1;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        private static final String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        private long end;
        private int firstDayOfWeek;
        private Long openAt;
        private long start;
        private DateValidator validator;
        static final long DEFAULT_START = UtcDates.canonicalYearMonthDay(Month.create(1900, 0).timeInMillis);
        static final long DEFAULT_END = UtcDates.canonicalYearMonthDay(Month.create(2100, 11).timeInMillis);

        public Builder() {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        @NonNull
        public CalendarConstraints build() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(DEEP_COPY_VALIDATOR_KEY, this.validator);
            Month monthCreate = Month.create(this.start);
            Month monthCreate2 = Month.create(this.end);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(DEEP_COPY_VALIDATOR_KEY);
            Long l = this.openAt;
            return new CalendarConstraints(monthCreate, monthCreate2, dateValidator, l == null ? null : Month.create(l.longValue()), this.firstDayOfWeek, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setEnd(long j) {
            this.end = j;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int i) {
            this.firstDayOfWeek = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOpenAt(long j) {
            this.openAt = Long.valueOf(j);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setStart(long j) {
            this.start = j;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setValidator(@NonNull DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.validator = dateValidator;
            return this;
        }

        public Builder(@NonNull CalendarConstraints calendarConstraints) {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.start = CalendarConstraints.access$100(calendarConstraints).timeInMillis;
            this.end = CalendarConstraints.access$200(calendarConstraints).timeInMillis;
            this.openAt = Long.valueOf(CalendarConstraints.access$300(calendarConstraints).timeInMillis);
            this.firstDayOfWeek = CalendarConstraints.access$400(calendarConstraints);
            this.validator = CalendarConstraints.access$500(calendarConstraints);
        }
    }
}
