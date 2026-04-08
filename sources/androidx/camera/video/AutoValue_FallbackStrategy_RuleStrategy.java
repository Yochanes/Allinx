package androidx.camera.video;

import androidx.camera.video.FallbackStrategy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_FallbackStrategy_RuleStrategy extends FallbackStrategy.RuleStrategy {

    /* JADX INFO: renamed from: b */
    public final Quality f3284b;

    /* JADX INFO: renamed from: c */
    public final int f3285c;

    public AutoValue_FallbackStrategy_RuleStrategy(Quality quality, int i) {
        if (quality == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f3284b = quality;
        this.f3285c = i;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    /* JADX INFO: renamed from: a */
    public final Quality mo1802a() {
        return this.f3284b;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    /* JADX INFO: renamed from: b */
    public final int mo1803b() {
        return this.f3285c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FallbackStrategy.RuleStrategy)) {
            return false;
        }
        FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) obj;
        return this.f3284b.equals(ruleStrategy.mo1802a()) && this.f3285c == ruleStrategy.mo1803b();
    }

    public final int hashCode() {
        return ((this.f3284b.hashCode() ^ 1000003) * 1000003) ^ this.f3285c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.f3284b);
        sb.append(", fallbackRule=");
        return AbstractC0000a.m11h(this.f3285c, "}", sb);
    }
}
