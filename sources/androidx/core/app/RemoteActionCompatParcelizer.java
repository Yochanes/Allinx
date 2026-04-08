package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        VersionedParcelable versionedParcelableM12049n = remoteActionCompat.f23092a;
        if (versionedParcel.mo12045j(1)) {
            versionedParcelableM12049n = versionedParcel.m12049n();
        }
        remoteActionCompat.f23092a = (IconCompat) versionedParcelableM12049n;
        CharSequence charSequenceMo12044i = remoteActionCompat.f23093b;
        if (versionedParcel.mo12045j(2)) {
            charSequenceMo12044i = versionedParcel.mo12044i();
        }
        remoteActionCompat.f23093b = charSequenceMo12044i;
        CharSequence charSequenceMo12044i2 = remoteActionCompat.f23094c;
        if (versionedParcel.mo12045j(3)) {
            charSequenceMo12044i2 = versionedParcel.mo12044i();
        }
        remoteActionCompat.f23094c = charSequenceMo12044i2;
        Parcelable parcelableMo12047l = remoteActionCompat.f23095d;
        if (versionedParcel.mo12045j(4)) {
            parcelableMo12047l = versionedParcel.mo12047l();
        }
        remoteActionCompat.f23095d = (PendingIntent) parcelableMo12047l;
        boolean zMo12042g = remoteActionCompat.f23096e;
        if (versionedParcel.mo12045j(5)) {
            zMo12042g = versionedParcel.mo12042g();
        }
        remoteActionCompat.f23096e = zMo12042g;
        boolean zMo12042g2 = remoteActionCompat.f23097f;
        if (versionedParcel.mo12045j(6)) {
            zMo12042g2 = versionedParcel.mo12042g();
        }
        remoteActionCompat.f23097f = zMo12042g2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo12051p(false, false);
        IconCompat iconCompat = remoteActionCompat.f23092a;
        versionedParcel.mo12050o(1);
        versionedParcel.m12058w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f23093b;
        versionedParcel.mo12050o(2);
        versionedParcel.mo12054s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f23094c;
        versionedParcel.mo12050o(3);
        versionedParcel.mo12054s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f23095d;
        versionedParcel.mo12050o(4);
        versionedParcel.mo12056u(pendingIntent);
        boolean z2 = remoteActionCompat.f23096e;
        versionedParcel.mo12050o(5);
        versionedParcel.mo12052q(z2);
        boolean z3 = remoteActionCompat.f23097f;
        versionedParcel.mo12050o(6);
        versionedParcel.mo12052q(z3);
    }
}
