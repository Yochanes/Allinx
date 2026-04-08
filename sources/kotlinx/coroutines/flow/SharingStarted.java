package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/SharingStarted;", "", "Companion", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface SharingStarted {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final SharingStarted f56155a = new StartedEagerly();

        /* JADX INFO: renamed from: b */
        public static final SharingStarted f56156b = new StartedLazily();

        /* JADX INFO: renamed from: a */
        public static SharingStarted m20800a(int i) {
            return new StartedWhileSubscribed((i & 1) != 0 ? 0L : 5000L);
        }
    }

    /* JADX INFO: renamed from: a */
    Flow mo20799a(StateFlow stateFlow);
}
