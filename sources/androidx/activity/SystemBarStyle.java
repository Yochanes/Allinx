package androidx.activity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/activity/SystemBarStyle;", "", "Companion", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SystemBarStyle {

    /* JADX INFO: renamed from: a */
    public final int f116a;

    /* JADX INFO: renamed from: b */
    public final int f117b;

    /* JADX INFO: renamed from: c */
    public final int f118c;

    /* JADX INFO: renamed from: d */
    public final Function1 f119d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static SystemBarStyle m173a() {
            return new SystemBarStyle(0, 0, 2, SystemBarStyle$Companion$dark$1.f121a);
        }

        /* JADX INFO: renamed from: b */
        public static SystemBarStyle m174b() {
            return new SystemBarStyle(0, 0, 1, SystemBarStyle$Companion$light$1.f122a);
        }
    }

    public SystemBarStyle(int i, int i2, int i3, Function1 function1) {
        this.f116a = i;
        this.f117b = i2;
        this.f118c = i3;
        this.f119d = function1;
    }
}
