package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/paging/ActiveFlowTracker;", "", "FlowType", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@VisibleForTesting
public interface ActiveFlowTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/ActiveFlowTracker$FlowType;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class FlowType {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ FlowType[] f30532a = {new FlowType("PAGED_DATA_FLOW", 0), new FlowType("PAGE_EVENT_FLOW", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        FlowType EF5;

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) f30532a.clone();
        }
    }
}
