package androidx.graphics.path;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/graphics/path/PathIterator;", "", "Landroidx/graphics/path/PathSegment;", "ConicEvaluation", "graphics-path_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class PathIterator implements Iterator<PathSegment>, KMappedMarker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/graphics/path/PathIterator$ConicEvaluation;", "", "graphics-path_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class ConicEvaluation {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ ConicEvaluation[] f24827a = {new ConicEvaluation("AsConic", 0), new ConicEvaluation("AsQuadratics", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ConicEvaluation EF5;

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) f24827a.clone();
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
