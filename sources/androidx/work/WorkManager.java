package androidx.work;

import android.annotation.SuppressLint;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/work/WorkManager;", "", "Companion", "UpdateResult", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/WorkManager$Companion;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class UpdateResult {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ UpdateResult[] f32624a = {new UpdateResult("NOT_APPLIED", 0), new UpdateResult("APPLIED_IMMEDIATELY", 1), new UpdateResult("APPLIED_FOR_NEXT_RUN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        UpdateResult EF5;

        public static UpdateResult valueOf(String str) {
            return (UpdateResult) Enum.valueOf(UpdateResult.class, str);
        }

        public static UpdateResult[] values() {
            return (UpdateResult[]) f32624a.clone();
        }
    }
}
