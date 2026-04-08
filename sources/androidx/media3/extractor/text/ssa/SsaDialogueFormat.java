package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import com.google.common.base.Ascii;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SsaDialogueFormat {

    /* JADX INFO: renamed from: a */
    public final int f29181a;

    /* JADX INFO: renamed from: b */
    public final int f29182b;

    /* JADX INFO: renamed from: c */
    public final int f29183c;

    /* JADX INFO: renamed from: d */
    public final int f29184d;

    /* JADX INFO: renamed from: e */
    public final int f29185e;

    public SsaDialogueFormat(int i, int i2, int i3, int i4, int i5) {
        this.f29181a = i;
        this.f29182b = i2;
        this.f29183c = i3;
        this.f29184d = i4;
        this.f29185e = i5;
    }

    /* JADX INFO: renamed from: a */
    public static SsaDialogueFormat m10991a(String str) {
        Assertions.m9460a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i5].trim());
            lowerCase.getClass();
            switch (lowerCase) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i, i2, i3, i4, strArrSplit.length);
    }
}
