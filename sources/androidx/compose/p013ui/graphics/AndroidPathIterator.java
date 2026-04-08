package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.graphics.PathIterator;
import androidx.compose.p013ui.graphics.PathSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/AndroidPathIterator;", "Landroidx/compose/ui/graphics/PathIterator;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AndroidPathIterator implements PathIterator {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PathIterator.ConicEvaluation[] conicEvaluationArr = PathIterator.ConicEvaluation.f17619a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PathSegment.Type type = PathSegment.Type.f17624a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PathSegment.Type type2 = PathSegment.Type.f17624a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PathSegment.Type type3 = PathSegment.Type.f17624a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PathSegment.Type type4 = PathSegment.Type.f17624a;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final PathSegment next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
