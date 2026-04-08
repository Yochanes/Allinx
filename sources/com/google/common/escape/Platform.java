package com.google.common.escape;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
@ElementTypesAreNonnullByDefault
final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = new C43781();

    /* JADX INFO: renamed from: com.google.common.escape.Platform$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C43781 extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ char[] initialValue() {
            return initialValue2();
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: initialValue, reason: avoid collision after fix types in other method */
        public char[] initialValue2() {
            return new char[UserMetadata.MAX_ATTRIBUTE_SIZE];
        }
    }

    private Platform() {
    }

    public static char[] charBufferFromThreadLocal() {
        char[] cArr = DEST_TL.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
