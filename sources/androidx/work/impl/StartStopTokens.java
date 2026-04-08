package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/work/impl/StartStopTokens;", "", "Companion", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface StartStopTokens {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/StartStopTokens$Companion;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static StartStopTokens m12133a(boolean z2) {
            StartStopTokensImpl startStopTokensImpl = new StartStopTokensImpl();
            return z2 ? new SynchronizedStartStopTokensImpl(startStopTokensImpl) : startStopTokensImpl;
        }
    }

    /* JADX INFO: renamed from: a */
    default StartStopToken m12129a(WorkSpec workSpec) {
        return mo12130b(WorkSpecKt.m12262a(workSpec));
    }

    /* JADX INFO: renamed from: b */
    StartStopToken mo12130b(WorkGenerationalId workGenerationalId);

    /* JADX INFO: renamed from: c */
    boolean mo12131c(WorkGenerationalId workGenerationalId);

    /* JADX INFO: renamed from: d */
    StartStopToken mo12132d(WorkGenerationalId workGenerationalId);

    List remove(String str);
}
