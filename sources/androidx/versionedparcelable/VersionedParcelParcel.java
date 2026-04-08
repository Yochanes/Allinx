package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class VersionedParcelParcel extends VersionedParcel {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f32413d;

    /* JADX INFO: renamed from: e */
    public final Parcel f32414e;

    /* JADX INFO: renamed from: f */
    public final int f32415f;

    /* JADX INFO: renamed from: g */
    public final int f32416g;

    /* JADX INFO: renamed from: h */
    public final String f32417h;

    /* JADX INFO: renamed from: i */
    public int f32418i;

    /* JADX INFO: renamed from: j */
    public int f32419j;

    /* JADX INFO: renamed from: k */
    public int f32420k;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(0), new ArrayMap(0), new ArrayMap(0));
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: a */
    public final void mo12036a() {
        int i = this.f32418i;
        if (i >= 0) {
            int i2 = this.f32413d.get(i);
            Parcel parcel = this.f32414e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: b */
    public final VersionedParcel mo12037b() {
        Parcel parcel = this.f32414e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f32419j;
        if (i == this.f32415f) {
            i = this.f32416g;
        }
        return new VersionedParcelParcel(parcel, iDataPosition, i, AbstractC0000a.m19p(new StringBuilder(), this.f32417h, "  "), this.f32410a, this.f32411b, this.f32412c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: g */
    public final boolean mo12042g() {
        return this.f32414e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: h */
    public final byte[] mo12043h() {
        Parcel parcel = this.f32414e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: i */
    public final CharSequence mo12044i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f32414e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: j */
    public final boolean mo12045j(int i) {
        while (this.f32419j < this.f32416g) {
            int i2 = this.f32420k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f32419j;
            Parcel parcel = this.f32414e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f32420k = parcel.readInt();
            this.f32419j += i4;
        }
        return this.f32420k == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: k */
    public final int mo12046k() {
        return this.f32414e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: l */
    public final Parcelable mo12047l() {
        return this.f32414e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: m */
    public final String mo12048m() {
        return this.f32414e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: o */
    public final void mo12050o(int i) {
        mo12036a();
        this.f32418i = i;
        this.f32413d.put(i, this.f32414e.dataPosition());
        mo12055t(0);
        mo12055t(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: q */
    public final void mo12052q(boolean z2) {
        this.f32414e.writeInt(z2 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: r */
    public final void mo12053r(byte[] bArr) {
        Parcel parcel = this.f32414e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: s */
    public final void mo12054s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f32414e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: t */
    public final void mo12055t(int i) {
        this.f32414e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: u */
    public final void mo12056u(Parcelable parcelable) {
        this.f32414e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: v */
    public final void mo12057v(String str) {
        this.f32414e.writeString(str);
    }

    public VersionedParcelParcel(Parcel parcel, int i, int i2, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f32413d = new SparseIntArray();
        this.f32418i = -1;
        this.f32420k = -1;
        this.f32414e = parcel;
        this.f32415f = i;
        this.f32416g = i2;
        this.f32419j = i;
        this.f32417h = str;
    }
}
