package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class CameraCaptureFailure {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Reason {

        /* JADX INFO: renamed from: a */
        public static final Reason f2601a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Reason[] f2602b;

        static {
            Reason reason = new Reason("ERROR", 0);
            f2601a = reason;
            f2602b = new Reason[]{reason};
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) f2602b.clone();
        }
    }
}
