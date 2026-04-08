package androidx.work;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/work/WorkRequest;", "", "Builder", "Companion", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class WorkRequest {

    /* JADX INFO: renamed from: a */
    public final UUID f32626a;

    /* JADX INFO: renamed from: b */
    public final WorkSpec f32627b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f32628c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {

        /* JADX INFO: renamed from: a */
        public UUID f32629a;

        /* JADX INFO: renamed from: b */
        public WorkSpec f32630b;

        /* JADX INFO: renamed from: c */
        public final LinkedHashSet f32631c;

        public Builder(Class cls) {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.m18598f(uuidRandomUUID, "randomUUID()");
            this.f32629a = uuidRandomUUID;
            String string = this.f32629a.toString();
            Intrinsics.m18598f(string, "id.toString()");
            this.f32630b = new WorkSpec(string, (WorkInfo.State) null, cls.getName(), (String) null, (Data) null, (Data) null, 0L, 0L, 0L, (Constraints) null, 0, (BackoffPolicy) null, 0L, 0L, 0L, 0L, false, (OutOfQuotaPolicy) null, 0, 0L, 0, 0, (String) null, 16777210);
            this.f32631c = SetsKt.m18500d(cls.getName());
        }

        /* JADX INFO: renamed from: a */
        public final WorkRequest m12111a() {
            OneTimeWorkRequest.Builder builder = (OneTimeWorkRequest.Builder) this;
            OneTimeWorkRequest oneTimeWorkRequest = new OneTimeWorkRequest(builder.f32629a, builder.f32630b, builder.f32631c);
            Constraints constraints = this.f32630b.f33020j;
            boolean z2 = constraints.m12089a() || constraints.f32548e || constraints.f32546c || constraints.f32547d;
            WorkSpec workSpec = this.f32630b;
            if (workSpec.f33027q) {
                if (z2) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (workSpec.f33017g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (workSpec.f33034x == null) {
                List listM20413K = StringsKt.m20413K(workSpec.f33013c, new String[]{"."}, 6);
                String strM20425W = listM20413K.size() == 1 ? (String) listM20413K.get(0) : (String) CollectionsKt.m18411L(listM20413K);
                if (strM20425W.length() > 127) {
                    strM20425W = StringsKt.m20425W(127, strM20425W);
                }
                workSpec.f33034x = strM20425W;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.m18598f(uuidRandomUUID, "randomUUID()");
            this.f32629a = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            Intrinsics.m18598f(string, "id.toString()");
            WorkSpec other = this.f32630b;
            Intrinsics.m18599g(other, "other");
            this.f32630b = new WorkSpec(string, other.f33012b, other.f33013c, other.f33014d, new Data(other.f33015e), new Data(other.f33016f), other.f33017g, other.f33018h, other.f33019i, new Constraints(other.f33020j), other.f33021k, other.f33022l, other.f33023m, other.f33024n, other.f33025o, other.f33026p, other.f33027q, other.f33028r, other.f33029s, other.f33031u, other.f33032v, other.f33033w, other.f33034x, 524288);
            return oneTimeWorkRequest;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m18302d2 = {"Landroidx/work/WorkRequest$Companion;", "", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "MIN_BACKOFF_MILLIS", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public WorkRequest(UUID id, WorkSpec workSpec, LinkedHashSet tags) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(workSpec, "workSpec");
        Intrinsics.m18599g(tags, "tags");
        this.f32626a = id;
        this.f32627b = workSpec;
        this.f32628c = tags;
    }
}
