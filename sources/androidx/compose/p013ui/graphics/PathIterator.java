package androidx.compose.p013ui.graphics;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/graphics/PathIterator;", "", "Landroidx/compose/ui/graphics/PathSegment;", "ConicEvaluation", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PathIterator extends Iterator<PathSegment>, KMappedMarker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class ConicEvaluation {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ ConicEvaluation[] f17619a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f17620b;

        static {
            ConicEvaluation[] conicEvaluationArr = {new ConicEvaluation("AsConic", 0), new ConicEvaluation("AsQuadratics", 1)};
            f17619a = conicEvaluationArr;
            f17620b = EnumEntriesKt.m18563a(conicEvaluationArr);
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) f17619a.clone();
        }
    }
}
