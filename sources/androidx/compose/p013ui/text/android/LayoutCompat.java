package androidx.compose.p013ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat;", "", "BreakStrategy", "HyphenationFrequency", "JustificationMode", "LineBreakStyle", "LineBreakWordStyle", "TextDirection", "TextGranularity", "TextLayoutAlignment", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutCompat {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f20130a = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$BreakStrategy;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface BreakStrategy {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$HyphenationFrequency;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface HyphenationFrequency {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$JustificationMode;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface JustificationMode {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$LineBreakStyle;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface LineBreakStyle {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$LineBreakWordStyle;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface LineBreakWordStyle {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextDirection;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface TextDirection {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextGranularity;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface TextGranularity {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextLayoutAlignment;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface TextLayoutAlignment {
    }

    static {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}
