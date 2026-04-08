package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.C0324h;
import androidx.compose.animation.AbstractC0455a;
import androidx.room.Entity;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "Companion", "IdAndState", "WorkInfoPojo", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@Entity
@RestrictTo
@SourceDebugExtension
public final /* data */ class WorkSpec {

    /* JADX INFO: renamed from: y */
    public static final C0324h f33010y;

    /* JADX INFO: renamed from: a */
    public final String f33011a;

    /* JADX INFO: renamed from: b */
    public WorkInfo.State f33012b;

    /* JADX INFO: renamed from: c */
    public final String f33013c;

    /* JADX INFO: renamed from: d */
    public final String f33014d;

    /* JADX INFO: renamed from: e */
    public Data f33015e;

    /* JADX INFO: renamed from: f */
    public final Data f33016f;

    /* JADX INFO: renamed from: g */
    public final long f33017g;

    /* JADX INFO: renamed from: h */
    public final long f33018h;

    /* JADX INFO: renamed from: i */
    public final long f33019i;

    /* JADX INFO: renamed from: j */
    public Constraints f33020j;

    /* JADX INFO: renamed from: k */
    public final int f33021k;

    /* JADX INFO: renamed from: l */
    public final BackoffPolicy f33022l;

    /* JADX INFO: renamed from: m */
    public final long f33023m;

    /* JADX INFO: renamed from: n */
    public long f33024n;

    /* JADX INFO: renamed from: o */
    public final long f33025o;

    /* JADX INFO: renamed from: p */
    public final long f33026p;

    /* JADX INFO: renamed from: q */
    public boolean f33027q;

    /* JADX INFO: renamed from: r */
    public final OutOfQuotaPolicy f33028r;

    /* JADX INFO: renamed from: s */
    public final int f33029s;

    /* JADX INFO: renamed from: t */
    public final int f33030t;

    /* JADX INFO: renamed from: u */
    public final long f33031u;

    /* JADX INFO: renamed from: v */
    public final int f33032v;

    /* JADX INFO: renamed from: w */
    public final int f33033w;

    /* JADX INFO: renamed from: x */
    public String f33034x;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R,\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m18302d2 = {"Landroidx/work/impl/model/WorkSpec$Companion;", "", "", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Landroidx/arch/core/util/Function;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Landroidx/work/WorkInfo;", "WORK_INFO_MAPPER", "Landroidx/arch/core/util/Function;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class IdAndState {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            ((IdAndState) obj).getClass();
            return Intrinsics.m18594b(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "IdAndState(id=" + ((String) null) + ", state=" + ((Object) null) + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class WorkInfoPojo {
        /* JADX INFO: renamed from: a */
        public final WorkInfo m12232a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            ((WorkInfoPojo) obj).getClass();
            if (Intrinsics.m18594b(null, null) && Intrinsics.m18594b(null, null) && 0 == 0 && 0 == 0 && 0 == 0) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "WorkInfoPojo(id=" + ((String) null) + ", state=" + ((Object) null) + ", output=" + ((Object) null) + ", initialDelay=0, intervalDuration=0, flexDuration=0, constraints=" + ((Object) null) + ", runAttemptCount=0, backoffPolicy=" + ((Object) null) + ", backoffDelayDuration=0, lastEnqueueTime=0, periodCount=0, generation=0, nextScheduleTimeOverride=0, stopReason=0, tags=" + ((Object) null) + ", progress=" + ((Object) null) + ')';
        }
    }

    static {
        Intrinsics.m18598f(Logger.m12101g("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        f33010y = new C0324h(3);
    }

    public WorkSpec(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(state, "state");
        Intrinsics.m18599g(workerClassName, "workerClassName");
        Intrinsics.m18599g(inputMergerClassName, "inputMergerClassName");
        Intrinsics.m18599g(input, "input");
        Intrinsics.m18599g(output, "output");
        Intrinsics.m18599g(constraints, "constraints");
        Intrinsics.m18599g(backoffPolicy, "backoffPolicy");
        Intrinsics.m18599g(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f33011a = id;
        this.f33012b = state;
        this.f33013c = workerClassName;
        this.f33014d = inputMergerClassName;
        this.f33015e = input;
        this.f33016f = output;
        this.f33017g = j;
        this.f33018h = j2;
        this.f33019i = j3;
        this.f33020j = constraints;
        this.f33021k = i;
        this.f33022l = backoffPolicy;
        this.f33023m = j4;
        this.f33024n = j5;
        this.f33025o = j6;
        this.f33026p = j7;
        this.f33027q = z2;
        this.f33028r = outOfQuotaPolicy;
        this.f33029s = i2;
        this.f33030t = i3;
        this.f33031u = j8;
        this.f33032v = i4;
        this.f33033w = i5;
        this.f33034x = str;
    }

    /* JADX INFO: renamed from: b */
    public static WorkSpec m12228b(WorkSpec workSpec, WorkInfo.State state, String str, Data data, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        long j3;
        int i6;
        String id = workSpec.f33011a;
        WorkInfo.State state2 = (i5 & 2) != 0 ? workSpec.f33012b : state;
        String workerClassName = (i5 & 4) != 0 ? workSpec.f33013c : str;
        String inputMergerClassName = workSpec.f33014d;
        Data input = (i5 & 16) != 0 ? workSpec.f33015e : data;
        Data output = workSpec.f33016f;
        long j4 = workSpec.f33017g;
        long j5 = workSpec.f33018h;
        long j6 = workSpec.f33019i;
        Constraints constraints = workSpec.f33020j;
        int i7 = (i5 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? workSpec.f33021k : i;
        BackoffPolicy backoffPolicy = workSpec.f33022l;
        int i8 = i7;
        long j7 = workSpec.f33023m;
        long j8 = (i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? workSpec.f33024n : j;
        long j9 = workSpec.f33025o;
        long j10 = workSpec.f33026p;
        boolean z2 = workSpec.f33027q;
        OutOfQuotaPolicy outOfQuotaPolicy = workSpec.f33028r;
        if ((i5 & 262144) != 0) {
            j3 = j10;
            i6 = workSpec.f33029s;
        } else {
            j3 = j10;
            i6 = i2;
        }
        int i9 = (i5 & 524288) != 0 ? workSpec.f33030t : i3;
        long j11 = (i5 & 1048576) != 0 ? workSpec.f33031u : j2;
        int i10 = (i5 & 2097152) != 0 ? workSpec.f33032v : i4;
        int i11 = workSpec.f33033w;
        String str2 = workSpec.f33034x;
        workSpec.getClass();
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(state2, "state");
        Intrinsics.m18599g(workerClassName, "workerClassName");
        Intrinsics.m18599g(inputMergerClassName, "inputMergerClassName");
        Intrinsics.m18599g(input, "input");
        Intrinsics.m18599g(output, "output");
        Intrinsics.m18599g(constraints, "constraints");
        Intrinsics.m18599g(backoffPolicy, "backoffPolicy");
        Intrinsics.m18599g(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id, state2, workerClassName, inputMergerClassName, input, output, j4, j5, j6, constraints, i8, backoffPolicy, j7, j8, j9, j3, z2, outOfQuotaPolicy, i6, i9, j11, i10, i11, str2);
    }

    /* JADX INFO: renamed from: a */
    public final long m12229a() {
        boolean z2 = this.f33012b == WorkInfo.State.f32617a && this.f33021k > 0;
        long j = this.f33024n;
        boolean zM12231d = m12231d();
        long j2 = this.f33018h;
        long j3 = this.f33031u;
        int i = this.f33021k;
        BackoffPolicy backoffPolicy = this.f33022l;
        long j4 = this.f33023m;
        int i2 = this.f33029s;
        long j5 = this.f33017g;
        boolean z3 = z2;
        long j6 = this.f33019i;
        Intrinsics.m18599g(backoffPolicy, "backoffPolicy");
        if (j3 != Long.MAX_VALUE && zM12231d) {
            if (i2 == 0) {
                return j3;
            }
            long j7 = j + 900000;
            return j3 < j7 ? j7 : j3;
        }
        if (z3) {
            long jScalb = backoffPolicy == BackoffPolicy.f32526b ? j4 * ((long) i) : (long) Math.scalb(j4, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j + jScalb;
        }
        if (zM12231d) {
            long j8 = i2 == 0 ? j + j5 : j + j2;
            return (j6 == j2 || i2 != 0) ? j8 : j8 + (j2 - j6);
        }
        if (j == -1) {
            return Long.MAX_VALUE;
        }
        return j + j5;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12230c() {
        return !Intrinsics.m18594b(Constraints.f32543j, this.f33020j);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12231d() {
        return this.f33018h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return Intrinsics.m18594b(this.f33011a, workSpec.f33011a) && this.f33012b == workSpec.f33012b && Intrinsics.m18594b(this.f33013c, workSpec.f33013c) && Intrinsics.m18594b(this.f33014d, workSpec.f33014d) && Intrinsics.m18594b(this.f33015e, workSpec.f33015e) && Intrinsics.m18594b(this.f33016f, workSpec.f33016f) && this.f33017g == workSpec.f33017g && this.f33018h == workSpec.f33018h && this.f33019i == workSpec.f33019i && Intrinsics.m18594b(this.f33020j, workSpec.f33020j) && this.f33021k == workSpec.f33021k && this.f33022l == workSpec.f33022l && this.f33023m == workSpec.f33023m && this.f33024n == workSpec.f33024n && this.f33025o == workSpec.f33025o && this.f33026p == workSpec.f33026p && this.f33027q == workSpec.f33027q && this.f33028r == workSpec.f33028r && this.f33029s == workSpec.f33029s && this.f33030t == workSpec.f33030t && this.f33031u == workSpec.f33031u && this.f33032v == workSpec.f33032v && this.f33033w == workSpec.f33033w && Intrinsics.m18594b(this.f33034x, workSpec.f33034x);
    }

    public final int hashCode() {
        int iM2228c = AbstractC0455a.m2228c(this.f33033w, AbstractC0455a.m2228c(this.f33032v, AbstractC0455a.m2231f(this.f33031u, AbstractC0455a.m2228c(this.f33030t, AbstractC0455a.m2228c(this.f33029s, (this.f33028r.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2231f(this.f33026p, AbstractC0455a.m2231f(this.f33025o, AbstractC0455a.m2231f(this.f33024n, AbstractC0455a.m2231f(this.f33023m, (this.f33022l.hashCode() + AbstractC0455a.m2228c(this.f33021k, (this.f33020j.hashCode() + AbstractC0455a.m2231f(this.f33019i, AbstractC0455a.m2231f(this.f33018h, AbstractC0455a.m2231f(this.f33017g, (this.f33016f.hashCode() + ((this.f33015e.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b((this.f33012b.hashCode() + (this.f33011a.hashCode() * 31)) * 31, 31, this.f33013c), 31, this.f33014d)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31, this.f33027q)) * 31, 31), 31), 31), 31), 31);
        String str = this.f33034x;
        return iM2228c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("{WorkSpec: "), this.f33011a, '}');
    }

    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i2, long j8, int i3, int i4, String str4, int i5) {
        this(str, (i5 & 2) != 0 ? WorkInfo.State.f32617a : state, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? Data.f32563b : data, (i5 & 32) != 0 ? Data.f32563b : data2, (i5 & 64) != 0 ? 0L : j, (i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? Constraints.f32543j : constraints, (i5 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? 0 : i, (i5 & 2048) != 0 ? BackoffPolicy.f32525a : backoffPolicy, (i5 & 4096) != 0 ? 30000L : j4, (i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? OutOfQuotaPolicy.f32600a : outOfQuotaPolicy, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (i5 & 8388608) != 0 ? null : str4);
    }
}
