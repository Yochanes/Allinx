package kotlin.text;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class HexFormatKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m20389a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.m18601i(cCharAt, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
