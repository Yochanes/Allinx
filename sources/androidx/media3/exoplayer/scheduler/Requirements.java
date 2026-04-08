package androidx.media3.exoplayer.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C18641();

    /* JADX INFO: renamed from: a */
    public final int f27103a;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.scheduler.Requirements$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C18641 implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    public Requirements(int i) {
        this.f27103a = (i & 2) != 0 ? i | 1 : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass()) {
            if (this.f27103a == ((Requirements) obj).f27103a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27103a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27103a);
    }
}
