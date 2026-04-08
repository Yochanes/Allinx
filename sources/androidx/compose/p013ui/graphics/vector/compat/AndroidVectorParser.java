package androidx.compose.p013ui.graphics.vector.compat;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.compose.p013ui.graphics.vector.PathParser;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class AndroidVectorParser {

    /* JADX INFO: renamed from: a */
    public final XmlResourceParser f18183a;

    /* JADX INFO: renamed from: b */
    public int f18184b = 0;

    /* JADX INFO: renamed from: c */
    public final PathParser f18185c;

    public AndroidVectorParser(XmlResourceParser xmlResourceParser) {
        this.f18183a = xmlResourceParser;
        PathParser pathParser = new PathParser();
        pathParser.f18079a = new float[64];
        this.f18185c = pathParser;
    }

    /* JADX INFO: renamed from: a */
    public final float m5509a(TypedArray typedArray, String str, int i, float f) {
        if (TypedArrayUtils.m7547c(this.f18183a, str)) {
            f = typedArray.getFloat(i, f);
        }
        m5510b(typedArray.getChangingConfigurations());
        return f;
    }

    /* JADX INFO: renamed from: b */
    public final void m5510b(int i) {
        this.f18184b = i | this.f18184b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return Intrinsics.m18594b(this.f18183a, androidVectorParser.f18183a) && this.f18184b == androidVectorParser.f18184b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18184b) + (this.f18183a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f18183a);
        sb.append(", config=");
        return AbstractC0000a.m17n(sb, this.f18184b, ')');
    }
}
