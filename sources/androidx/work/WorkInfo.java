package androidx.work;

import androidx.compose.animation.AbstractC0455a;
import java.util.HashSet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/work/WorkInfo;", "", "Companion", "PeriodicityInfo", "State", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class WorkInfo {

    /* JADX INFO: renamed from: a */
    public final UUID f32603a;

    /* JADX INFO: renamed from: b */
    public final State f32604b;

    /* JADX INFO: renamed from: c */
    public final HashSet f32605c;

    /* JADX INFO: renamed from: d */
    public final Data f32606d;

    /* JADX INFO: renamed from: e */
    public final Data f32607e;

    /* JADX INFO: renamed from: f */
    public final int f32608f;

    /* JADX INFO: renamed from: g */
    public final int f32609g;

    /* JADX INFO: renamed from: h */
    public final Constraints f32610h;

    /* JADX INFO: renamed from: i */
    public final long f32611i;

    /* JADX INFO: renamed from: j */
    public final PeriodicityInfo f32612j;

    /* JADX INFO: renamed from: k */
    public final long f32613k;

    /* JADX INFO: renamed from: l */
    public final int f32614l;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, m18302d2 = {"Landroidx/work/WorkInfo$Companion;", "", "", "STOP_REASON_APP_STANDBY", "I", "STOP_REASON_BACKGROUND_RESTRICTION", "STOP_REASON_CANCELLED_BY_APP", "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW", "STOP_REASON_CONSTRAINT_CHARGING", "STOP_REASON_CONSTRAINT_CONNECTIVITY", "STOP_REASON_CONSTRAINT_DEVICE_IDLE", "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW", "STOP_REASON_DEVICE_STATE", "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED", "STOP_REASON_FOREGROUND_SERVICE_TIMEOUT", "STOP_REASON_NOT_STOPPED", "STOP_REASON_PREEMPT", "STOP_REASON_QUOTA", "STOP_REASON_SYSTEM_PROCESSING", "STOP_REASON_TIMEOUT", "STOP_REASON_UNKNOWN", "STOP_REASON_USER", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class PeriodicityInfo {

        /* JADX INFO: renamed from: a */
        public final long f32615a;

        /* JADX INFO: renamed from: b */
        public final long f32616b;

        public PeriodicityInfo(long j, long j2) {
            this.f32615a = j;
            this.f32616b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PeriodicityInfo.class.equals(obj.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
                if (periodicityInfo.f32615a == this.f32615a && periodicityInfo.f32616b == this.f32616b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f32616b) + (Long.hashCode(this.f32615a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.f32615a);
            sb.append(", flexIntervalMillis=");
            return AbstractC0455a.m2240o(sb, this.f32616b, '}');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/WorkInfo$State;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class State {

        /* JADX INFO: renamed from: a */
        public static final State f32617a;

        /* JADX INFO: renamed from: b */
        public static final State f32618b;

        /* JADX INFO: renamed from: c */
        public static final State f32619c;

        /* JADX INFO: renamed from: d */
        public static final State f32620d;

        /* JADX INFO: renamed from: f */
        public static final State f32621f;

        /* JADX INFO: renamed from: g */
        public static final State f32622g;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ State[] f32623i;

        static {
            State state = new State("ENQUEUED", 0);
            f32617a = state;
            State state2 = new State("RUNNING", 1);
            f32618b = state2;
            State state3 = new State("SUCCEEDED", 2);
            f32619c = state3;
            State state4 = new State("FAILED", 3);
            f32620d = state4;
            State state5 = new State("BLOCKED", 4);
            f32621f = state5;
            State state6 = new State("CANCELLED", 5);
            f32622g = state6;
            f32623i = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f32623i.clone();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m12110a() {
            return this == f32619c || this == f32620d || this == f32622g;
        }
    }

    public WorkInfo(UUID uuid, State state, HashSet hashSet, Data outputData, Data progress, int i, int i2, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j2, int i3) {
        Intrinsics.m18599g(state, "state");
        Intrinsics.m18599g(outputData, "outputData");
        Intrinsics.m18599g(progress, "progress");
        this.f32603a = uuid;
        this.f32604b = state;
        this.f32605c = hashSet;
        this.f32606d = outputData;
        this.f32607e = progress;
        this.f32608f = i;
        this.f32609g = i2;
        this.f32610h = constraints;
        this.f32611i = j;
        this.f32612j = periodicityInfo;
        this.f32613k = j2;
        this.f32614l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WorkInfo.class.equals(obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f32608f == workInfo.f32608f && this.f32609g == workInfo.f32609g && this.f32603a.equals(workInfo.f32603a) && this.f32604b == workInfo.f32604b && Intrinsics.m18594b(this.f32606d, workInfo.f32606d) && this.f32610h.equals(workInfo.f32610h) && this.f32611i == workInfo.f32611i && Intrinsics.m18594b(this.f32612j, workInfo.f32612j) && this.f32613k == workInfo.f32613k && this.f32614l == workInfo.f32614l && this.f32605c.equals(workInfo.f32605c)) {
            return Intrinsics.m18594b(this.f32607e, workInfo.f32607e);
        }
        return false;
    }

    public final int hashCode() {
        int iM2231f = AbstractC0455a.m2231f(this.f32611i, (this.f32610h.hashCode() + ((((((this.f32607e.hashCode() + ((this.f32605c.hashCode() + ((this.f32606d.hashCode() + ((this.f32604b.hashCode() + (this.f32603a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f32608f) * 31) + this.f32609g) * 31)) * 31, 31);
        PeriodicityInfo periodicityInfo = this.f32612j;
        return Integer.hashCode(this.f32614l) + AbstractC0455a.m2231f(this.f32613k, (iM2231f + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f32603a + "', state=" + this.f32604b + ", outputData=" + this.f32606d + ", tags=" + this.f32605c + ", progress=" + this.f32607e + ", runAttemptCount=" + this.f32608f + ", generation=" + this.f32609g + ", constraints=" + this.f32610h + ", initialDelayMillis=" + this.f32611i + ", periodicityInfo=" + this.f32612j + ", nextScheduleTimeMillis=" + this.f32613k + "}, stopReason=" + this.f32614l;
    }
}
