package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;

    @NonNull
    private final Operator operator;

    @NonNull
    private final List<CalendarConstraints.DateValidator> validators;
    private static final Operator ANY_OPERATOR = new C38191();
    private static final Operator ALL_OPERATOR = new C38202();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C38213();

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CompositeDateValidator$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38191 implements Operator {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.isValid(j)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CompositeDateValidator$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C38202 implements Operator {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.isValid(j)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CompositeDateValidator$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C38213 implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ CompositeDateValidator[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            Operator operatorAccess$100 = (i != 2 && i == 1) ? CompositeDateValidator.access$100() : CompositeDateValidator.access$000();
            arrayList.getClass();
            return new CompositeDateValidator(arrayList, operatorAccess$100, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Operator {
        int getId();

        boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j);
    }

    public /* synthetic */ CompositeDateValidator(List list, Operator operator, C38191 c38191) {
        this(list, operator);
    }

    public static /* synthetic */ Operator access$000() {
        return ALL_OPERATOR;
    }

    public static /* synthetic */ Operator access$100() {
        return ANY_OPERATOR;
    }

    @NonNull
    public static CalendarConstraints.DateValidator allOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ALL_OPERATOR);
    }

    @NonNull
    public static CalendarConstraints.DateValidator anyOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ANY_OPERATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId();
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        return this.operator.isValid(this.validators, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }

    private CompositeDateValidator(@NonNull List<CalendarConstraints.DateValidator> list, Operator operator) {
        this.validators = list;
        this.operator = operator;
    }
}
