package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RoundRect;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/ui/graphics/Outline;", "", "Generic", "Rectangle", "Rounded", "Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class Outline {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Generic extends Outline {

        /* JADX INFO: renamed from: a */
        public final AndroidPath f17612a;

        public Generic(AndroidPath androidPath) {
            this.f17612a = androidPath;
        }

        @Override // androidx.compose.p013ui.graphics.Outline
        /* JADX INFO: renamed from: a */
        public final Rect getF17613a() {
            return this.f17612a.m5157u();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Rectangle extends Outline {

        /* JADX INFO: renamed from: a */
        public final Rect f17613a;

        public Rectangle(Rect rect) {
            this.f17613a = rect;
        }

        @Override // androidx.compose.p013ui.graphics.Outline
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Rect getF17613a() {
            return this.f17613a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rectangle) {
                return Intrinsics.m18594b(this.f17613a, ((Rectangle) obj).f17613a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f17613a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final class Rounded extends Outline {

        /* JADX INFO: renamed from: a */
        public final RoundRect f17614a;

        /* JADX INFO: renamed from: b */
        public final AndroidPath f17615b;

        public Rounded(RoundRect roundRect) {
            AndroidPath androidPathM5161a;
            this.f17614a = roundRect;
            if (RoundRectKt.m5079c(roundRect)) {
                androidPathM5161a = null;
            } else {
                androidPathM5161a = AndroidPath_androidKt.m5161a();
                Path.m5241r(androidPathM5161a, roundRect);
            }
            this.f17615b = androidPathM5161a;
        }

        @Override // androidx.compose.p013ui.graphics.Outline
        /* JADX INFO: renamed from: a */
        public final Rect getF17613a() {
            RoundRect roundRect = this.f17614a;
            return new Rect(roundRect.f17530a, roundRect.f17531b, roundRect.f17532c, roundRect.f17533d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rounded) {
                return Intrinsics.m18594b(this.f17614a, ((Rounded) obj).f17614a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f17614a.hashCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Rect getF17613a();
}
