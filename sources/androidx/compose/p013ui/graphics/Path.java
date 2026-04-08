package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/Path;", "", "Companion", "Direction", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public interface Path {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Direction {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Direction[] f17616a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f17617b;

        static {
            Direction[] directionArr = {new Direction("CounterClockwise", 0), new Direction("Clockwise", 1)};
            f17616a = directionArr;
            f17617b = EnumEntriesKt.m18563a(directionArr);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f17616a.clone();
        }
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ void m5240m(Path path, Rect rect) {
        Direction[] directionArr = Direction.f17616a;
        path.mo5148j(rect);
    }

    /* JADX INFO: renamed from: r */
    static /* synthetic */ void m5241r(Path path, RoundRect roundRect) {
        Direction[] directionArr = Direction.f17616a;
        path.mo5152o(roundRect);
    }

    /* JADX INFO: renamed from: a */
    default void mo5139a(float f, float f2, float f3, float f4) {
        mo5144f(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: b */
    boolean mo5140b();

    /* JADX INFO: renamed from: c */
    void mo5141c(float f, float f2);

    void close();

    /* JADX INFO: renamed from: d */
    void mo5142d(float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: renamed from: e */
    void mo5143e(float f, float f2, float f3, float f4);

    /* JADX INFO: renamed from: f */
    void mo5144f(float f, float f2, float f3, float f4);

    /* JADX INFO: renamed from: g */
    void mo5145g(int i);

    /* JADX INFO: renamed from: h */
    default void mo5146h(float f, float f2, float f3, float f4) {
        mo5143e(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: i */
    int mo5147i();

    /* JADX INFO: renamed from: j */
    void mo5148j(Rect rect);

    /* JADX INFO: renamed from: k */
    void mo5149k(float f, float f2);

    /* JADX INFO: renamed from: l */
    void mo5150l(float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: renamed from: n */
    default void mo5151n() {
        reset();
    }

    /* JADX INFO: renamed from: o */
    void mo5152o(RoundRect roundRect);

    /* JADX INFO: renamed from: p */
    void mo5153p(long j);

    /* JADX INFO: renamed from: q */
    void mo5154q(float f, float f2);

    void reset();

    /* JADX INFO: renamed from: s */
    void mo5155s(float f, float f2);
}
