package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class FontRequest {

    /* JADX INFO: renamed from: a */
    public final String f23275a;

    /* JADX INFO: renamed from: b */
    public final String f23276b;

    /* JADX INFO: renamed from: c */
    public final String f23277c;

    /* JADX INFO: renamed from: d */
    public final List f23278d;

    /* JADX INFO: renamed from: e */
    public final String f23279e;

    public FontRequest(String str, String str2, String str3, List list) {
        str.getClass();
        this.f23275a = str;
        str2.getClass();
        this.f23276b = str2;
        this.f23277c = str3;
        list.getClass();
        this.f23278d = list;
        this.f23279e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f23275a + ", mProviderPackage: " + this.f23276b + ", mQuery: " + this.f23277c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f23278d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
