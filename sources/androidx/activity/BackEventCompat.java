package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/BackEventCompat;", "", "Companion", "SwipeEdge", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BackEventCompat {

    /* JADX INFO: renamed from: a */
    public final float f58a;

    /* JADX INFO: renamed from: b */
    public final float f59b;

    /* JADX INFO: renamed from: c */
    public final float f60c;

    /* JADX INFO: renamed from: d */
    public final int f61d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/activity/BackEventCompat$Companion;", "", "", "EDGE_LEFT", "I", "EDGE_RIGHT", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    @RestrictTo
    public @interface SwipeEdge {
    }

    public BackEventCompat(BackEvent backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
        float fM143c = Api34Impl.m143c(backEvent);
        float fM144d = Api34Impl.m144d(backEvent);
        float fM141a = Api34Impl.m141a(backEvent);
        int iM142b = Api34Impl.m142b(backEvent);
        this.f58a = fM143c;
        this.f59b = fM144d;
        this.f60c = fM141a;
        this.f61d = iM142b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f58a);
        sb.append(", touchY=");
        sb.append(this.f59b);
        sb.append(", progress=");
        sb.append(this.f60c);
        sb.append(", swipeEdge=");
        return AbstractC0000a.m17n(sb, this.f61d, '}');
    }
}
