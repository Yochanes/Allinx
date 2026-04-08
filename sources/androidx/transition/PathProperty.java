package androidx.transition;

import android.util.Property;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class PathProperty<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a */
    public float f32237a;

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(this.f32237a);
    }

    @Override // android.util.Property
    public final void set(Object obj, Float f) {
        this.f32237a = f.floatValue();
        throw null;
    }
}
