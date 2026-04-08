package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/TransitionData;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class TransitionData {

    /* JADX INFO: renamed from: a */
    public final Fade f4273a;

    /* JADX INFO: renamed from: b */
    public final Slide f4274b;

    /* JADX INFO: renamed from: c */
    public final ChangeSize f4275c;

    /* JADX INFO: renamed from: d */
    public final Scale f4276d;

    /* JADX INFO: renamed from: e */
    public final boolean f4277e;

    /* JADX INFO: renamed from: f */
    public final Map f4278f;

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z2, Map map) {
        this.f4273a = fade;
        this.f4274b = slide;
        this.f4275c = changeSize;
        this.f4276d = scale;
        this.f4277e = z2;
        this.f4278f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return Intrinsics.m18594b(this.f4273a, transitionData.f4273a) && Intrinsics.m18594b(this.f4274b, transitionData.f4274b) && Intrinsics.m18594b(this.f4275c, transitionData.f4275c) && Intrinsics.m18594b(this.f4276d, transitionData.f4276d) && this.f4277e == transitionData.f4277e && Intrinsics.m18594b(this.f4278f, transitionData.f4278f);
    }

    public final int hashCode() {
        Fade fade = this.f4273a;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.f4274b;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.f4275c;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.f4276d;
        return this.f4278f.hashCode() + AbstractC0455a.m2230e((iHashCode3 + (scale != null ? scale.hashCode() : 0)) * 31, 31, this.f4277e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f4273a + ", slide=" + this.f4274b + ", changeSize=" + this.f4275c + ", scale=" + this.f4276d + ", hold=" + this.f4277e + ", effectsMap=" + this.f4278f + ')';
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : changeSize, (i & 8) != 0 ? null : scale, (i & 16) == 0, (i & 32) != 0 ? MapsKt.m18481d() : linkedHashMap);
    }
}
