package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class Label {

    /* JADX INFO: renamed from: a */
    public final String f25212a;

    /* JADX INFO: renamed from: b */
    public final String f25213b;

    static {
        Util.m9594D(0);
        Util.m9594D(1);
    }

    public Label(String str, String str2) {
        this.f25212a = Util.m9599I(str);
        this.f25213b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Label label = (Label) obj;
            if (Objects.equals(this.f25212a, label.f25212a) && Objects.equals(this.f25213b, label.f25213b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f25213b.hashCode() * 31;
        String str = this.f25212a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
