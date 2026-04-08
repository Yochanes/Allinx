package androidx.media3.extractor.metadata.icy;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class IcyHeaders implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final int f28473a;

    /* JADX INFO: renamed from: b */
    public final String f28474b;

    /* JADX INFO: renamed from: c */
    public final String f28475c;

    /* JADX INFO: renamed from: d */
    public final String f28476d;

    /* JADX INFO: renamed from: e */
    public final boolean f28477e;

    /* JADX INFO: renamed from: f */
    public final int f28478f;

    public IcyHeaders(int i, int i2, String str, String str2, String str3, boolean z2) {
        Assertions.m9460a(i2 == -1 || i2 > 0);
        this.f28473a = i;
        this.f28474b = str;
        this.f28475c = str2;
        this.f28476d = str3;
        this.f28477e = z2;
        this.f28478f = i2;
    }

    /* JADX INFO: renamed from: d */
    public static IcyHeaders m10847d(Map map) {
        boolean z2;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List list = (List) map.get("icy-br");
        boolean z3 = true;
        int i3 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z2 = true;
                } else {
                    try {
                        Log.m9511g("IcyHeaders", "Invalid bitrate: " + str4);
                        z2 = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC1610a.m8741s("Invalid bitrate header: ", str4, "IcyHeaders");
                        z2 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z2 = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z2 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z2 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z2 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z2 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        Log.m9511g("IcyHeaders", "Invalid metadata interval: " + str5);
                        z3 = z2;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        AbstractC1610a.m8741s("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z2 = z3;
            } catch (NumberFormatException unused4) {
            }
        }
        int i5 = i3;
        if (z2) {
            return new IcyHeaders(i, i5, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    /* JADX INFO: renamed from: b */
    public final void mo9328b(MediaMetadata.Builder builder) {
        String str = this.f28475c;
        if (str != null) {
            builder.f25308x = str;
        }
        String str2 = this.f28474b;
        if (str2 != null) {
            builder.f25307w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.f28473a == icyHeaders.f28473a && Objects.equals(this.f28474b, icyHeaders.f28474b) && Objects.equals(this.f28475c, icyHeaders.f28475c) && Objects.equals(this.f28476d, icyHeaders.f28476d) && this.f28477e == icyHeaders.f28477e && this.f28478f == icyHeaders.f28478f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f28473a) * 31;
        String str = this.f28474b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28475c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28476d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f28477e ? 1 : 0)) * 31) + this.f28478f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f28475c + "\", genre=\"" + this.f28474b + "\", bitrate=" + this.f28473a + ", metadataInterval=" + this.f28478f;
    }
}
