package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty;", "T", "", "Fill", "FillAlpha", "PathData", "PivotX", "PivotY", "Rotation", "ScaleX", "ScaleY", "Stroke", "StrokeAlpha", "StrokeLineWidth", "TranslateX", "TranslateY", "TrimPathEnd", "TrimPathOffset", "TrimPathStart", "Landroidx/compose/ui/graphics/vector/VectorProperty$Fill;", "Landroidx/compose/ui/graphics/vector/VectorProperty$FillAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PathData;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PivotX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PivotY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$Rotation;", "Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$Stroke;", "Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeLineWidth;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathEnd;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathOffset;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathStart;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class VectorProperty<T> {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Fill;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "Landroidx/compose/ui/graphics/Brush;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Fill extends VectorProperty<Brush> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$FillAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class FillAlpha extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PathData;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class PathData extends VectorProperty<List<? extends PathNode>> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PivotX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class PivotX extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PivotY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class PivotY extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Rotation;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Rotation extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class ScaleX extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class ScaleY extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Stroke;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "Landroidx/compose/ui/graphics/Brush;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Stroke extends VectorProperty<Brush> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class StrokeAlpha extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeLineWidth;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class StrokeLineWidth extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TranslateX extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TranslateY extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathEnd;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TrimPathEnd extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathOffset;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TrimPathOffset extends VectorProperty<Float> {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathStart;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TrimPathStart extends VectorProperty<Float> {
    }
}
