package com.exchange.allin.p024ui.common;

import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.R;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute;", "", "Home", "Markets", "Trades", "Spot", "Futures", "Flash", "MiniFutures", "Nexus", "Guess", "Assets", "Lcom/exchange/allin/ui/common/BottomNavRoute$Assets;", "Lcom/exchange/allin/ui/common/BottomNavRoute$Flash;", "Lcom/exchange/allin/ui/common/BottomNavRoute$Futures;", "Lcom/exchange/allin/ui/common/BottomNavRoute$Guess;", "Lcom/exchange/allin/ui/common/BottomNavRoute$Home;", "Lcom/exchange/allin/ui/common/BottomNavRoute$Markets;", "Lcom/exchange/allin/ui/common/BottomNavRoute$MiniFutures;", "Lcom/exchange/allin/ui/common/BottomNavRoute$Nexus;", "Lcom/exchange/allin/ui/common/BottomNavRoute$Spot;", "Lcom/exchange/allin/ui/common/BottomNavRoute$Trades;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class BottomNavRoute {

    /* JADX INFO: renamed from: a */
    public final String f35934a;

    /* JADX INFO: renamed from: b */
    public final String f35935b;

    /* JADX INFO: renamed from: c */
    public final int f35936c;

    /* JADX INFO: renamed from: d */
    public final boolean f35937d;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Assets;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Assets extends BottomNavRoute {

        /* JADX INFO: renamed from: e */
        public static final Assets f35938e = new Assets("assets", "assets", R.drawable.ic_assets, true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Assets);
        }

        public final int hashCode() {
            return -25190319;
        }

        public final String toString() {
            return "Assets";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Flash;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Flash extends BottomNavRoute {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Flash);
        }

        public final int hashCode() {
            return 696316258;
        }

        public final String toString() {
            return "Flash";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Futures;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Futures extends BottomNavRoute {

        /* JADX INFO: renamed from: e */
        public static final Futures f35939e = new Futures("futures", "futures", R.drawable.ic_futures, false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Futures);
        }

        public final int hashCode() {
            return -579692542;
        }

        public final String toString() {
            return "Futures";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Guess;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Guess extends BottomNavRoute {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Guess);
        }

        public final int hashCode() {
            return 697511753;
        }

        public final String toString() {
            return "Guess";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Home;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Home extends BottomNavRoute {

        /* JADX INFO: renamed from: e */
        public static final Home f35940e = new Home("home", "home", R.drawable.ic_home, false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Home);
        }

        public final int hashCode() {
            return -1501496019;
        }

        public final String toString() {
            return "Home";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Markets;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Markets extends BottomNavRoute {

        /* JADX INFO: renamed from: e */
        public static final Markets f35941e = new Markets("market", "markets", R.drawable.ic_markets, false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Markets);
        }

        public final int hashCode() {
            return 763125929;
        }

        public final String toString() {
            return "Markets";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$MiniFutures;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class MiniFutures extends BottomNavRoute {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MiniFutures);
        }

        public final int hashCode() {
            return 2099905195;
        }

        public final String toString() {
            return "MiniFutures";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Nexus;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Nexus extends BottomNavRoute {

        /* JADX INFO: renamed from: e */
        public static final Nexus f35942e = new Nexus("nexus", "subscribe", R.drawable.ic_pledge, true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Nexus);
        }

        public final int hashCode() {
            return 703518065;
        }

        public final String toString() {
            return "Nexus";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Spot;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Spot extends BottomNavRoute {

        /* JADX INFO: renamed from: e */
        public static final Spot f35943e = new Spot("spot", "spot", R.drawable.ic_spot, false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Spot);
        }

        public final int hashCode() {
            return -1501167280;
        }

        public final String toString() {
            return "Spot";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/common/BottomNavRoute$Trades;", "Lcom/exchange/allin/ui/common/BottomNavRoute;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Trades extends BottomNavRoute {

        /* JADX INFO: renamed from: e */
        public static final Trades f35944e = new Trades("trades", "trades", R.drawable.ic_transfer, false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Trades);
        }

        public final int hashCode() {
            return 517302365;
        }

        public final String toString() {
            return "Trades";
        }
    }

    public BottomNavRoute(String str, String str2, int i, boolean z2) {
        this.f35934a = str;
        this.f35935b = str2;
        this.f35936c = i;
        this.f35937d = z2;
    }
}
