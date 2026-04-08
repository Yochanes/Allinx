package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C16451();

    /* JADX INFO: renamed from: a */
    public final int[] f24474a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f24475b;

    /* JADX INFO: renamed from: c */
    public final int[] f24476c;

    /* JADX INFO: renamed from: d */
    public final int[] f24477d;

    /* JADX INFO: renamed from: f */
    public final int f24478f;

    /* JADX INFO: renamed from: g */
    public final String f24479g;

    /* JADX INFO: renamed from: i */
    public final int f24480i;

    /* JADX INFO: renamed from: j */
    public final int f24481j;

    /* JADX INFO: renamed from: n */
    public final CharSequence f24482n;

    /* JADX INFO: renamed from: o */
    public final int f24483o;

    /* JADX INFO: renamed from: p */
    public final CharSequence f24484p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f24485q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f24486r;

    /* JADX INFO: renamed from: s */
    public final boolean f24487s;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackRecordState$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C16451 implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.f24704a.size();
        this.f24474a = new int[size * 6];
        if (!backStackRecord.f24710g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f24475b = new ArrayList(size);
        this.f24476c = new int[size];
        this.f24477d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.C1682Op c1682Op = (FragmentTransaction.C1682Op) backStackRecord.f24704a.get(i2);
            int i3 = i + 1;
            this.f24474a[i] = c1682Op.f24720a;
            ArrayList arrayList = this.f24475b;
            Fragment fragment = c1682Op.f24721b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f24474a;
            iArr[i3] = c1682Op.f24722c ? 1 : 0;
            iArr[i + 2] = c1682Op.f24723d;
            iArr[i + 3] = c1682Op.f24724e;
            int i4 = i + 5;
            iArr[i + 4] = c1682Op.f24725f;
            i += 6;
            iArr[i4] = c1682Op.f24726g;
            this.f24476c[i2] = c1682Op.f24727h.ordinal();
            this.f24477d[i2] = c1682Op.f24728i.ordinal();
        }
        this.f24478f = backStackRecord.f24709f;
        this.f24479g = backStackRecord.f24711h;
        this.f24480i = backStackRecord.f24472s;
        this.f24481j = backStackRecord.f24712i;
        this.f24482n = backStackRecord.f24713j;
        this.f24483o = backStackRecord.f24714k;
        this.f24484p = backStackRecord.f24715l;
        this.f24485q = backStackRecord.f24716m;
        this.f24486r = backStackRecord.f24717n;
        this.f24487s = backStackRecord.f24718o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f24474a);
        parcel.writeStringList(this.f24475b);
        parcel.writeIntArray(this.f24476c);
        parcel.writeIntArray(this.f24477d);
        parcel.writeInt(this.f24478f);
        parcel.writeString(this.f24479g);
        parcel.writeInt(this.f24480i);
        parcel.writeInt(this.f24481j);
        TextUtils.writeToParcel(this.f24482n, parcel, 0);
        parcel.writeInt(this.f24483o);
        TextUtils.writeToParcel(this.f24484p, parcel, 0);
        parcel.writeStringList(this.f24485q);
        parcel.writeStringList(this.f24486r);
        parcel.writeInt(this.f24487s ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f24474a = parcel.createIntArray();
        this.f24475b = parcel.createStringArrayList();
        this.f24476c = parcel.createIntArray();
        this.f24477d = parcel.createIntArray();
        this.f24478f = parcel.readInt();
        this.f24479g = parcel.readString();
        this.f24480i = parcel.readInt();
        this.f24481j = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f24482n = (CharSequence) creator.createFromParcel(parcel);
        this.f24483o = parcel.readInt();
        this.f24484p = (CharSequence) creator.createFromParcel(parcel);
        this.f24485q = parcel.createStringArrayList();
        this.f24486r = parcel.createStringArrayList();
        this.f24487s = parcel.readInt() != 0;
    }
}
