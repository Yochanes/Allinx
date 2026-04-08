package androidx.room;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/room/FtsOptions;", "", "MatchInfo", "Order", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class FtsOptions {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class MatchInfo {

        /* JADX INFO: renamed from: a */
        public static final MatchInfo f31890a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ MatchInfo[] f31891b;

        /* JADX INFO: Fake field, exist only in values array */
        MatchInfo EF0;

        static {
            MatchInfo matchInfo = new MatchInfo("FTS3", 0);
            MatchInfo matchInfo2 = new MatchInfo("FTS4", 1);
            f31890a = matchInfo2;
            f31891b = new MatchInfo[]{matchInfo, matchInfo2};
        }

        public static MatchInfo valueOf(String str) {
            return (MatchInfo) Enum.valueOf(MatchInfo.class, str);
        }

        public static MatchInfo[] values() {
            return (MatchInfo[]) f31891b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/FtsOptions$Order;", "", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Order {

        /* JADX INFO: renamed from: a */
        public static final Order f31892a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Order[] f31893b;

        static {
            Order order = new Order("ASC", 0);
            f31892a = order;
            f31893b = new Order[]{order, new Order("DESC", 1)};
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f31893b.clone();
        }
    }
}
